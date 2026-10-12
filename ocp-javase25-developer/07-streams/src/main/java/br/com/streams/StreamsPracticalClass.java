package br.com.streams;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
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

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Usando Operações Terminais Comuns
     * <p> » » » » Contagem
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  contagem() {

        System.out.println("###################################################");
        System.out.println("Método: contagem()");
        System.out.println("###################################################");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Usando Operações Terminais Comuns
     * <p> » » » » Encontrando o Mínimo e o Máximo
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  encontrandoMinimoMaximo() {

        System.out.println("###################################################");
        System.out.println("Método: encontrandoMinimoMaximo()");
        System.out.println("###################################################");
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape

        System.out.println("==================================================");

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Usando Operações Terminais Comuns
     * <p> » » » » Encontrando um Valor
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  encontrandoValor() {

        System.out.println("###################################################");
        System.out.println("Método: encontrandoValor()");
        System.out.println("###################################################");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);        // monkey (usually)
        infinite.findAny().ifPresent(System.out::println); // chimp
        System.out.println("==================================================");

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Usando Operações Terminais Comuns
     * <p> » » » » Correspondência (Matching)
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  correspondenciaMatching() {

        System.out.println("###################################################");
        System.out.println("Método: correspondenciaMatching()");
        System.out.println("###################################################");
        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));  // true
        System.out.println(list.stream().allMatch(pred));  // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred));       // true

        System.out.println("==================================================");

        System.out.println(infinite.allMatch(pred));       // Never terminates
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Usando Operações Terminais Comuns
     * <p> » » » » Iteração
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  iteracao() {

        System.out.println("###################################################");
        System.out.println("Método: iteracao()");
        System.out.println("###################################################");
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo

        System.out.println("==================================================");
        //for (Integer i  : s) {} // DOES NOT COMPILE
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Usando Streams
     * <p> » » » Usando Operações Terminais Comuns
     * <p> » » » » Redução
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  reducao() {

        System.out.println("###################################################");
        System.out.println("Método: reducao()");
        System.out.println("###################################################");

        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var s: array) result = result + s;
        System.out.println(result); // wolf

        System.out.println("==================================================");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        System.out.println("==================================================");

        String word2 = stream.reduce("", String::concat);
        System.out.println(word2); // wolf

        System.out.println("==================================================");

        Stream<Integer> streamI = Stream.of(3, 5, 6);
        System.out.println(streamI.reduce(1, (a, b) -> a*b)); // 90

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Trabalhando com Conceitos Avançados de Pipeline de Streams
     * <p> » » » Vinculando Streams aos Dados Subjacentes
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  vinculandoStreamsDadosSubjacentes() {

        System.out.println("###################################################");
        System.out.println("Método: vinculandoStreamsDadosSubjacentes()");
        System.out.println("###################################################");
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("==================================================");

        System.out.println("==================================================");

        System.out.println("==================================================");

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Trabalhando com Conceitos Avançados de Pipeline de Streams
     * <p> » » » Coletando em Maps
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  coletandoMaps() {

        System.out.println("###################################################");
        System.out.println("Método: coletandoMaps()");
        System.out.println("###################################################");
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
            Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}

        System.out.println("==================================================");
       // var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy.collect(
            Collectors.toMap(String::length, k -> k)); // BAD
        System.out.println("==================================================");

        //var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map3 = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map3);            // {5=lions,bears, 6=tigers}
        System.out.println(map3.getClass()); // class java.util.HashMap
        System.out.println("==================================================");
        //var ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map4 = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map4);            // {5=lions,bears, 6=tigers}
        System.out.println(map4.getClass()); // class java.util.TreeMap
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Trabalhando com Conceitos Avançados de Pipeline de Streams
     * <p> » » » Agrupamento, Particionamento e Mapeamento
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  agrupamento() {

        System.out.println("###################################################");
        System.out.println("Método: agrupamento()");
        System.out.println("###################################################");
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map);    // {5=[lions, bears], 6=[tigers]}

        System.out.println("==================================================");
        System.out.println("Valores do tipo Set<String>");
        System.out.println("==================================================");

        //var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()));
        System.out.println(map2);    // {5=[lions, bears], 6=[tigers]}

        System.out.println("==================================================");
        System.out.println("TreeMap com Valores do tipo Set<String>");
        System.out.println("==================================================");
       // var ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map3 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map3); // {5=[lions, bears], 6=[tigers]}

        System.out.println("==================================================");
        System.out.println("TreeMap com Valores do tipo List<String>");
        System.out.println("==================================================");
        //var ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map4 = ohMy.collect(
            Collectors.groupingBy(
                    String::length,
                    TreeMap::new,
                    Collectors.toList()));
        System.out.println(map4);
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Trabalhando com Conceitos Avançados de Pipeline de Streams
     * <p> » » » Agrupamento, Particionamento e Mapeamento
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  particionamento() {

        System.out.println("###################################################");
        System.out.println("Método: particionamento()");
        System.out.println("###################################################");

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map);    // {false=[tigers], true=[lions, bears]}

        System.out.println("==================================================");

       // var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map2 = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map2);    // {false=[], true=[lions, tigers, bears]}

        System.out.println("==================================================");
        //var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map3 = ohMy.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map3);    // {false=[], true=[lions, tigers, bears]}

        System.out.println("==================================================");
        //var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map4 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map4);    // {5=2, 6=1}
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 10 ■ Streams
     * <p> » » Trabalhando com Conceitos Avançados de Pipeline de Streams
     * <p> » » » Agrupamento, Particionamento e Mapeamento
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void  mapeamento() {

        System.out.println("###################################################");
        System.out.println("Método: mapeamento()");
        System.out.println("###################################################");

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map4 = ohMy.collect(
            Collectors.groupingBy(
                String::length,
                Collectors.counting()));
        System.out.println(map4);    // {5=2, 6=1}

        System.out.println("==================================================");
        //var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map2 = ohMy.collect(
            Collectors.groupingBy(
                String::length,
                Collectors.mapping(
                        s -> s.charAt(0),
                        Collectors.minBy((a, b) -> a - b))));
        System.out.println(map2);    // {5=Optional[b], 6=Optional[t]}
        System.out.println("###################################################");

    }
}
