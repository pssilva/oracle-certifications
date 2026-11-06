package br.com.making_decisions;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO: making-decisions
 * <ul>
 *     <li>Controle do Fluxo do Programa</li>
 *     <ul>
 *          <li>
 *               Criar estruturas de controle de fluxo do programa, incluindo if/else, instruções e
 *               expressões switch, loops e instruções break e continue.
 *          </li>
 *     </ul>
 *     <li>Utilizando Conceitos de Orientação a Objetos em Java </li>
 *     <ul>
 *          <li>
 *              Implementar herança, incluindo tipos abstratos e selados, bem como classes de
 *              registro. Sobrescrever métodos, incluindo os da classe Object. Implementar polimorfismo
 *              e diferenciar entre tipo de objeto e tipo de referência. Realizar conversão de tipo de
 *              referência, identificar tipos de objeto usando o operador instanceof e casamento de
 *              padrões com o operador instanceof e a estrutura switch.
 *          </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class MakingDecisionsPracticalClass {

    public MakingDecisionsPracticalClass() {
    }

    public static void main(String[] args){

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 3 ■ Tomando Decisões
     * <p> » » Criando Instruções de Tomada de Decisão
     * <p> » » » Instruções e blocos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void instrucoesBlocos() {
        System.out.println("###################################################");
        System.out.println("Método: instrucoesBlocos()");
        System.out.println("###################################################");
        // Single statement
        int patrons = 0;
        patrons++;

        // Statement inside a block
        {
            patrons++;
        }

        System.out.println("====================================================");

        // Single statement
        int ticketsTaken = 0;
        if (ticketsTaken> 1)
            patrons++;

        // Statement inside a block
        if (ticketsTaken> 1) {
            patrons++;
        }

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 3 ■ Tomando Decisões
     * <p> » » Escrevendo Loops while
     * <p> » » » A instrução `do/while`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void instrucaoDoWhile() {
        System.out.println("###################################################");
        System.out.println("Método: instrucaoDoWhile()");
        System.out.println("###################################################");
        int lizard = 0;
        do {
            lizard++;
        } while (false);
        System.out.println(lizard);
        System.out.println("###################################################");
    }


}
