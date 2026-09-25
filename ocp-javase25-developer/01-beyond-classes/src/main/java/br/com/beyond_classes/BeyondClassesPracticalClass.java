package br.com.beyond_classes;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE CAPÍTULO: beyond-classes
 * <ul>
 *     <li>Utilizando Conceitos de Orientação a Objetos em Java<li>
 *     <ul>
 *          <li>
 *              Declarar e instanciar objetos Java, incluindo objetos de classes aninhadas, e explicar o ciclo
 *              de vida do objeto, incluindo criação, reatribuição de referências e coleta de lixo.
 *           </li>
 *          <li>
 *              Criar classes e registros, e definir e usar campos e métodos de instância e estáticos,
 *              construtores e inicializadores de instância e estáticos.
 *           </li>
 *          <li>
 *              Compreender escopos de variáveis, aplicar encapsulamento e criar objetos imutáveis.
 *              Usar inferência de tipo de variável local.
 *           </li>
 *          <li>
 *              Implementar herança, incluindo tipos abstratos e selados, bem como classes de registro.
 *              Sobrescrever métodos, incluindo os da classe Object. Implementar polimorfismo e diferenciar
 *              entre tipo de objeto e tipo de referência. Realizar conversão de tipo de referência, identificar
 *              tipos de objeto usando o operador instanceof e casamento de padrões com o operador instanceof e
 *              a estrutura switch.
 *           </li>
 *          <li>
 *              Criar e usar interfaces, identificar interfaces funcionais e utilizar métodos de interface privados,
 *              estáticos e padrão.
 *           </li>
 *          <li>
 *              Criar e usar tipos enum com campos, métodos e construtores.
 *           </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class BeyondClassesPracticalClass {

    public BeyondClassesPracticalClass() {
    }

    public static void main(String[] args){
        //compreendendoPolimorfismo();
        //criandoEnumsSimples();
        chamandoMetodosComunsEnum();

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 7 ■ Além das Classes
     * <p> » » Encapsulando Dados com Registros
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void encapsulandoDadosComRegistros() {

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 7 ■ Além das Classes
     * <p> » » Encapsulando Dados com Registros
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void compreendendoPolimorfismo() {
        HasTail hasTail = new Lemur();
        // System.out.println(hasTail.age);             // DOES NOT COMPILE

        Primate primate = new Lemur();
        // System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 7 ■ Além das Classes
     * <p> » » Trabalhando com Enums
     * <p> » » » Criando Enums Simples
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoEnumsSimples() {
        var s = Season.SUMMER;
        System.out.println(Season.SUMMER);       // SUMMER
        System.out.println(s == Season.SUMMER);  // true
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 7 ■ Além das Classes
     * <p> » » Trabalhando com Enums
     * <p> » » » Chamando Métodos Comuns de Enum
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void chamandoMetodosComunsEnum() {
        for(var season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        // if (Season.SUMMER == 2) {} // DOES NOT COMPILE

        Season s = Season.valueOf("SUMMER"); // SUMMER
        Season t = Season.valueOf("summer"); // IllegalArgumentException
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 7 ■ Além das Classes
     * <p> » » Trabalhando com Enums
     * <p> » » » Usando Enums em Instruções switch
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    String getWeather(Season value) {
        return switch (value) {
            case SUMMER        -> "Too hot";
            case Season.WINTER -> "Too cold";
            //case 0      -> "Too cold";  // DOES NOT COMPILE
            case SPRING, FALL  -> "Just right";
        };
    }

}
