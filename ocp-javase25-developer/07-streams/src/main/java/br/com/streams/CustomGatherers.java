package br.com.streams;

import java.util.stream.Stream;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/04EDxRA1" >From Java 21 to Java 25 (Fu Cheng)</a>
 * <p> » Biblioteca principal (Core Library)
 * <p> » » Agregadores de Stream (Stream Gatherers)
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class CustomGatherers  {

    record Student(String id, String name) {

    }

    void distinctBy() {
        var result = Stream.of(
                        new Student("001", "Alex"),
                        new Student("002", "Bob"),
                        new Student("001", "Alex")
                ).gather(DistinctBy.of(Student::id))
                .toList();
        // [Student[id=001, name=Alex], Student[id=002, name=Bob]]
        System.out.println(result);
    }

    static void main() {
        new CustomGatherers().distinctBy();
    }
}
