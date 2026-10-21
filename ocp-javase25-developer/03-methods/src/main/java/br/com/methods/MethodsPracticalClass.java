package br.com.methods;

/**
 *
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO: methods
 * <ul>
 *     <li> Usando Conceitos de Orientação a Objetos em Java</li>
 *     <ul>
 *          <li>
 *             Criar classes e registros, e definir e usar campos e métodos de instância e estáticos,
 *             construtores e inicializadores de instância e estáticos.
 *           </li>
 *          <li>
 *              Implementar métodos sobrecarregados, incluindo métodos com argumentos variáveis
 *              (var-args).
 *         </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class MethodsPracticalClass {

    public MethodsPracticalClass() {
    }

    public static void main(String[] args){


    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 5 ■ Métodos
     * <p> » » Projetando Métodos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void projetandoMetodos() {

    }

    public void swim(int distance) {
        if(distance <= 0) {
            // Exit early, nothing to do!
            return;
        }
        System.out.print("Fish is swimming " + distance + " meters");
    }

    String hike8(int a) {
        if (1 < 2) return "orange";
        return "apple";                   // COMPILER WARNING
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 5 ■ Métodos
     * <p> » » Passando Dados entre Variáveis Métodos
     * <p> » » » Passagem de Objetos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void passagemObjetos() {
        System.out.println("###################################################");
        System.out.println("Método: passagemObjetos()");
        System.out.println("###################################################");
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1);   // 1
        System.out.println(original2);   // 2
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 5 ■ Métodos
     * <p> » » Passando Dados entre Variáveis Métodos
     * <p> » » » Passagem de Objetos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 5 ■ Métodos
     * <p> » » Sobrecarga de Métodos
     * <p> » » » Arrays
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void sobrecargaMetodosArrays() {
        System.out.println("###################################################");
        System.out.println("Método: sobrecargaMetodosArrays()");
        System.out.println("###################################################");
        int[] ints = new int[0];
        walk( ints);
        Integer[] integer = new Integer[0];
        walk( integer);
        System.out.println("###################################################");
    }
    public static void walk(int[] ints) {}
    public static void walk(Integer[] integers) {}
}
