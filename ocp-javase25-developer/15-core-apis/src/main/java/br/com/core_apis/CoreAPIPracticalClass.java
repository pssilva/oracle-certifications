package br.com.core_apis;

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

        criandoManipulandoStrings();
        concatenacao();
        encontrandoMinimoMaximo();
        determinandoTetoCeilingPisoFloor();

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
}
