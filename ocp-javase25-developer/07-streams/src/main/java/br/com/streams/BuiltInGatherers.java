package br.com.streams;

import java.time.Duration;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/04EDxRA1" >From Java 21 to Java 25 (Fu Cheng)</a>
 * <p> » Biblioteca principal (Core Library)
 * <p> » » Agregadores de Stream (Stream Gatherers)
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class BuiltInGatherers {

    void fold() {
        var result = Stream.of(1, 2, 3, 4, 5).gather(
                Gatherers.fold(
                        () -> "",
                        (output, value) -> output + value + ", "
                )
        ).findFirst();
        // 1, 2, 3, 4, 5,
        result.ifPresent(System.out::println);
    }

    void scan() {
        var result = Stream.of(1, 2, 3, 4, 5).gather(
                Gatherers.scan(() -> 0, Integer::sum)
        ).toList();
        // [1, 3, 6, 10, 15]
        System.out.println(result);
    }

    void windowFixed() {
        var result = Stream.of(1, 2, 3, 4, 5).gather(
                Gatherers.windowFixed(2)
        ).toList();
        // [[1, 2], [3, 4], [5]]
        System.out.println(result);
    }

    void windowSliding() {
        var result = Stream.of(1, 2, 3, 4, 5).gather(
                Gatherers.windowSliding(2)
        ).toList();
        // [[1, 2], [2, 3], [3, 4], [4, 5]]
        System.out.println(result);
    }

    void mapConcurrent() {
        var result = Stream.of(1, 2, 3, 4, 5).gather(
                Gatherers.mapConcurrent(3, value -> {
                    try {
                        Thread.sleep(Duration.ofSeconds(1));
                    } catch (InterruptedException e) {
                        //ignore
                    }
                    return value * 10;
                })
        ).toList();
        // [10, 20, 30, 40, 50]
        System.out.println(result);
    }

    static void main() {
        var builtInGatherers = new BuiltInGatherers();
        builtInGatherers.fold();
        builtInGatherers.scan();
        builtInGatherers.windowFixed();
        builtInGatherers.windowSliding();
        builtInGatherers.mapConcurrent();
    }
}
