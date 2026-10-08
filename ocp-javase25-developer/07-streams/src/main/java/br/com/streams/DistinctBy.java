package br.com.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Gatherer;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/04EDxRA1" >From Java 21 to Java 25 (Fu Cheng)</a>
 * <p> » Biblioteca principal (Core Library)
 * <p> » » Agregadores de Stream (Stream Gatherers)
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class DistinctBy{

    /**
     * Create a new {@linkplain DistinctBy} gatherer
     *
     * @param extractor Extract the property from an element
     * @param <T>       Type of the element
     * @param <R>       Type of the element's property
     * @return A new {@linkplain DistinctBy} gatherer
     */
    static <T, R> Gatherer<T, ?, T> of(
            Function<? super T, ? extends R> extractor) {
        class State {

            final Map<R, T> seen = new HashMap<>();
        }

        return Gatherer.ofSequential(State::new, Gatherer.Integrator.ofGreedy(
                        ((state, element, _) -> {
                            state.seen.put(extractor.apply(element), element);
                            return true;
                        })),
                (state, downstream) -> state.seen.values().forEach(downstream::push)
        );
    }
}