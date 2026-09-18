package br.com.core_apis;

import java.time.*;
import java.time.temporal.ChronoUnit;

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
        Zoo zoo = new Zoo();

        //Podemos chamar diretamente o método main()
        Zoo.main(new String[]{""});

        Park park = new Park();

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
}
