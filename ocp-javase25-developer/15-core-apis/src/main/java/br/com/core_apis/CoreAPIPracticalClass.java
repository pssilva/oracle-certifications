package br.com.core_apis;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO:
 * <ul>
 *     <li> Manipulação de Data, Hora, Texto, Valores Numéricos e Booleanos</li>
*      <ul>
*          <li>
 *              Utilizar tipos primitivos e classes wrapper. Avaliar expressões aritméticas e booleanas, utilizando
 *              a API Math e aplicando regras de precedência, conversões de tipo e casting.
 *         </li>
 *          <li>
 *              Manipular texto, incluindo blocos de texto, utilizando as classes String e StringBuilder.
 *         </li>
 *          <li>
 *              Manipular objetos de data, hora, duração, período, instante e fuso horário, incluindo horário de verão,
 *              utilizando a API Date-Time.
 *         </li>
 *     </ul>
 *      <li>Trabalhar com Arrays e Coleções</li>
 *      <ul>
 *          <li>
 *              Criar arrays, coleções List, Set, Map e Deque, e adicionar, remover, atualizar, recuperar e
 *              ordenar seus elementos.
 *           </ul>
 *      </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class CoreAPIPracticalClass {

    public CoreAPIPracticalClass() {

    }

    public static void main(String[] args){
        //  criandoManipulandoStrings();
        //  concatenacao();
        //  encontrandoMinimoMaximo();
        //  determinandoTetoCeilingPisoFloor();
        //trabalhandoDatasHoras();
        //manipulandDatasHoras();
        //chronoUnitDiferencas();
        //levandoEmContaHorarioVerao();

        // Não é necessário criar um objeto (instância)
        //Zoo zoo = new Zoo();

        //Podemos chamar diretamente o método main()
        //Zoo.main(new String[]{""});

        //Park park = new Park();

        //criandoArrayPrimitivos();
        //criandoArrayVariaveisReferencia();
        //criandoArrayDeArrays();
        usandoArrayDeArrays();

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Criando e Manipulando Strings
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoManipulandoStrings() {
        String name = "Fluffy";
        String name2 = new String("Fluffy");
        String name3 = """
               Fluffy""";
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Criando e Manipulando Strings
     * <p> » » » Concatenação
     *
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void concatenacao() {
        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c
        System.out.println("c" + 1 + 2);     // c12
        System.out.println("c" + null);      // cnull

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Calculando com APIs Matemáticas (Math)
     * <p> » » » Encontrando o Mínimo e o Máximo
     *
     * </ br>
     *
     * <p>Exemplo: <p/>
     * <p> public static double min(double a, double b)
     * <p> public static float min(float a, float b)
     * <p> public static int min(int a, int b)
     * <p> public static long min(long a, long b)
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void encontrandoMinimoMaximo() {
        int first = Math.max(3, 7);    // 7
        int second = Math.min(7, -9);  // -9

        double c = Math.ceil(3.14);  // 4.0
        double f = Math.floor(3.14); // 3.0

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Calculando com APIs Matemáticas (Math)
     * <p> » » » Determinando o Teto (Ceiling) e o Piso (Floor)
     *
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void determinandoTetoCeilingPisoFloor() {
        double c = Math.ceil(3.14);  // 4.0
        double f = Math.floor(3.14); // 3.0

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Trabalhando com Datas e Horas
     *
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void trabalhandoDatasHoras() {
        System.out.println("###################################################");
        System.out.println("Método: trabalhandoDatasHoras()");
        System.out.println("###################################################");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var date1 = LocalDate.of(2025, Month.JANUARY, 20);
        var date2 = LocalDate.of(2025, 1, 20);

        var time1 = LocalTime.of(6, 15);               // hour and minute
        var time2 = LocalTime.of(6, 15, 30);           // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200);      // + nanoseconds

        var dateTime1 = LocalDateTime.of(2025, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time2);

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2025, 1, 20,
                6, 15, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        // var d = new LocalDate(); // DOES NOT COMPILE
        // var d = LocalDate.of(2025, Month.JANUARY, 32); // DateTimeException

        System.out.println("###################################################");
        System.out.println("\n\n\n");


    }


    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Trabalhando com Datas e Horas
     * <p> » » » Manipulando Datas e Horas
     *
     *
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void manipulandDatasHoras() {

        System.out.println("###################################################");
        System.out.println("Método: manipulandDatasHoras()");
        System.out.println("###################################################");
        var date = LocalDate.of(2025, Month.JANUARY, 20);
        System.out.println(date);    // 2025–01–20
        date = date.plusDays(2);
        System.out.println(date);    // 2025–01–22
        date = date.plusWeeks(1);
        System.out.println(date);    // 2025–01–29
        date = date.plusMonths(1);
        System.out.println(date);    // 2025–02–28
        date = date.plusYears(5);
        System.out.println(date);    // 2030–02–28

        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);       // 2025–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);       // 2025–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);       // 2025–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime);       // 2025–01–18T19:14:30

        var dateTime2 = LocalDateTime.of(date, time)
                .minusDays(1)
                .minusHours(10)
                .minusSeconds(30);

        System.out.println(dateTime2);

        System.out.println("###################################################");
        System.out.println("\n\n\n");

    }



    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Trabalhando com Datas e Horas
     * <p> » » » ChronoUnit para Diferenças
     *
     *
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void chronoUnitDiferencas() {

        System.out.println("###################################################");
        System.out.println("Método: chronoUnitDiferencas()");
        System.out.println("###################################################");
        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 55);
        var date = LocalDate.of(2025, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two));     // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two));   // 100
        //System.out.println(ChronoUnit.MINUTES.between(one, date));  // DateTimeException

        System.out.println("###################################################");
        System.out.println("\n\n\n");

    }


    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Trabalhando com Datas e Horas
     * <p> » » » Levando em conta o Horário de Verão
     *
     *
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void levandoEmContaHorarioVerao() {

        System.out.println("###################################################");
        System.out.println("Método: levandoEmContaHorarioVerao()");
        System.out.println("###################################################");
        var date = LocalDate.of(2025, Month.MARCH, 9);
        var time = LocalTime.of(1, 30);
        var zone = ZoneId.of("US/Eastern");
        var dateTime = ZonedDateTime.of(date, time, zone);

        System.out.println(dateTime);  // 2025–03-09T01:30-05:00[US/Eastern]
        System.out.println(dateTime.getHour());   // 1
        System.out.println(dateTime.getOffset()); // -05:00

        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime);  // 2025–03-09T03:30-04:00[US/Eastern]
        System.out.println(dateTime.getHour());   // 3
        System.out.println(dateTime.getOffset()); // -04:00
        System.out.println("###################################################");
        System.out.println("\n\n\n");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Criando um Array de Primitivos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoArrayPrimitivos() {

        char[] letters;
        int[] moreNumbers = new int[] {42, 55, 99};
        // int[] moreNumbers = {42, 55, 99};

        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Criando um Array com Variáveis   de Referência
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoArrayVariaveisReferencia() {

        System.out.println("###################################################");
        System.out.println("Método: criandoArrayVariaveisReferencia()");
        System.out.println("###################################################");
        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;
        String[] anotherArray = { "cricket", "beetle", "ladybug" };
        System.out.println(bugs.equals(alias));        // true
        System.out.println(bugs.equals(anotherArray)); // false
        System.out.println(bugs.toString());           // [Ljava.lang.String;@160bc7c0

        System.out.println("====================================================");

        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
       // againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
         objects[0] = new StringBuilder();        // Careful!
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Usando um Array
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void usandoArray() {

        System.out.println("###################################################");
        System.out.println("Método: UsandoArray()");
        System.out.println("###################################################");
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);           // 3
        System.out.println(mammals[0]);               // monkey
        System.out.println(mammals[1]);               // chimp
        System.out.println(mammals[2]);               // donkey
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Ordenação
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void ordenacao() {

        System.out.println("###################################################");
        System.out.println("Método: ordenacao()");
        System.out.println("###################################################");
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] +  " ");

        System.out.println("===================================================");

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String s : strings)
            System.out.print(s + " ");

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Pesquisa
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void pesquisa() {

        System.out.println("###################################################");
        System.out.println("Método: pesquisa()");
        System.out.println("###################################################");
         int[] numbers = {2,4,6,8};
         System.out.println(Arrays.binarySearch(numbers, 2)); // 0
         System.out.println(Arrays.binarySearch(numbers, 4)); // 1
         System.out.println(Arrays.binarySearch(numbers, 1)); // -1
         System.out.println(Arrays.binarySearch(numbers, 3)); // -2
         System.out.println(Arrays.binarySearch(numbers, 9)); // -5
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Comparando
     * <p> » » » » Usando o `equals()`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void arrayEquals() {

        System.out.println("###################################################");
        System.out.println("Método: arrayEquals()");
        System.out.println("###################################################");
        System.out.println(new int[] {1} == new int[] {1});                 // false
        System.out.println(Arrays.equals(new int[] {1}, new int[] {1}));    // true
        System.out.println(Arrays.equals(new int[] {1}, new int[] {2}));    // false
        System.out.println(Arrays.equals(new int[] {1}, new int[] {1, 2})); // false
        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Comparando
     * <p> » » » » Usando o `compare()`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void arrayCompare() {

        System.out.println("###################################################");
        System.out.println("Método: arrayCompare()");
        System.out.println("###################################################");
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

        System.out.println("===================================================");

        //System.out.println(Arrays.compare(new int[] {1}, new String[] {"a"})); // DOES NOT COMPILE

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Comparando
     * <p> » » » » Usando `mismatch()`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void arrayUsandoMismatch() {

        System.out.println("###################################################");
        System.out.println("Método: arrayUsandoMismatch()");
        System.out.println("###################################################");

        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
        System.out.println(Arrays.mismatch(new String[] {"a"},
                new String[] {"A"}));
        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));

        System.out.println("===================================================");

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Using Methods with Varargs
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void usingMethodsVarargs() {

        System.out.println("###################################################");
        System.out.println("Método: usingMethodsVarargs()");
        System.out.println("###################################################");
        String[] args = new String[0];
        main1(args);
        main2(args);
        main3(args); // varargs
        System.out.println("===================================================");

        System.out.println("###################################################");

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Using Methods with Varargs
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void main1(String[] args){

        System.out.println("###################################################");
        System.out.println("Método: main1()");
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Using Methods with Varargs
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void main2(String args[]){

        System.out.println("###################################################");
        System.out.println("Método: main2()");
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Entendendo Arrays
     * <p> » » » Using Methods with Varargs
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void main3(String ... args){  // varargs
        System.out.println("###################################################");
        System.out.println("Método: main3()");
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Trabalhando com arrays de arrays
     * <p> » » » Criando um array de arrays
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoArrayDeArrays() {

        System.out.println("###################################################");
        System.out.println("Método: criandoArrayDeArrays()");
        System.out.println("###################################################");
        int[][] vars1;               // 2D array
        int vars2 [][];              // 2D array
        int[] vars3[];               // 2D array
        int[] vars4 [], space [][];  // 2D and 3D arrays
        System.out.println("===================================================");

        String [][] rectangle = new String[3][2];
        rectangle[0][1] = "set";
        System.out.println(Arrays.toString(rectangle));
        System.out.println(Arrays.toString(rectangle[0]));
        System.out.println(Arrays.toString(rectangle[1]));
        System.out.println("===================================================");



        System.out.println("###################################################");

    }
    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 4 ■ APIs Principais
     * <p> » » Trabalhando com arrays de arrays
     * <p> » » » Usando um array de arrays
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void usandoArrayDeArrays() {

        System.out.println("###################################################");
        System.out.println("Método: usandoArrayDeArrays()");
        System.out.println("###################################################");
        var twoD = new int[3][2];
        for(int i = 0; i < twoD.length; i++) {
            for(int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                  // time for a new row
        }


        System.out.println("===================================================");
        System.out.println("Loop Aprimorado (enhanced for loop) ");
        System.out.println("===================================================");
        for(int[] inner : twoD) {
            for(int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

        System.out.println("###################################################");

    }
}
