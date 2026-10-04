package br.com.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: streams
 * <ul>
 *     <li> Trabalhando com Streams e Expressões Lambda</li>
 *     <ul>
 *          <li>
 *              Use Streams de objetos e tipos primitivos do Java, incluindo expressões lambda
 *              que implementam interfaces funcionais, para criar, filtrar, transformar, processar
 *              e ordenar dados.
 *           </li>
 *          <li>
 *              Realize decomposição, concatenação, redução, agrupamento e particionamento em fluxos
 *              sequenciais e paralelos.
 *           </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class StreamsPracticalClass {

    public StreamsPracticalClass() {
    }

    public static void main(String[] args){

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Retornando um Optional
     * <p> » » » Definindo uma Interface Funcional
     * <p> » » » » Criando um Optional
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoOptional() {

        System.out.println("###################################################");
        System.out.println("Método: criandoOptional()");
        System.out.println("###################################################");

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Retornando um Optional
     * <p> » » » Definindo uma Interface Funcional
     * <p> » » » » Criando um Optional
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static Optional<Double> average(int ... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Criando Fontes de Stream
     * <p> » » » » Criando Streams Finitos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  criandoStreamsFinitos() {

        System.out.println("###################################################");
        System.out.println("Método: criandoStreamsFinitos()");
        System.out.println("###################################################");
        Stream<String> empty = Stream.empty();          // count = 0
        Stream<Integer> singleElement = Stream.of(1);   // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3

        System.out.println("===================================================");

         var list = List.of("a", "b", "c");
         Stream<String> fromList = list.stream();

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Criando Fontes de Stream
     * <p> » » » » Criando Streams Infinitos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  criandoStreamsInfinitos() {

        System.out.println("###################################################");
        System.out.println("Método: criandoStreamsInfinitos()");
        System.out.println("###################################################");
         Stream<Double> randoms = Stream.generate(Math::random);
         Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        System.out.print(randoms); // java.util.stream.ReferencePipeline$3@4517d9a3
        System.out.println("===================================================");
        Stream<Integer> oddNumberUnder100 = Stream.iterate(
        1,                // seed
        n -> n < 100,     // Predicate to specify when done
        n -> n + 2);      // UnaryOperator to get next value

        System.out.println("###################################################");

    }

}
