package br.com.building_blocks;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: building-classes
 * <ul>
 *     <li> Manipulação de Data, Hora, Texto, Valores Numéricos e Booleanos</li>
 *     <ul>
 *          <li>
 *              Utilizar tipos primitivos e classes wrapper. Avaliar expressões
 *              aritméticas e booleanas, utilizando a API Math e aplicando regras
 *              de precedência, conversões de tipo e casting.
 *           </li>
 *     </ul>
 *     <li>Utilizar Conceitos de Orientação a Objetos em Java</li>
 *     <ul>
 *          <li>
 *            Declarar e instanciar objetos Java, incluindo objetos de classes aninhadas,
 *            e explicar o ciclo de vida do objeto, incluindo criação, reatribuição de
 *            referências e coleta de lixo.
 *           </li>
 *
 *          <li>
 *             Compreender escopos de variáveis, aplicar encapsulamento e criar objetos
 *             imutáveis. Utilizar inferência de tipo de variável local.
 *           </li>
 *     </ul>
 * </ul>
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class BuildingBlocksPracticalClass {

    public BuildingBlocksPracticalClass() {
    }

    public static void main(String[] args){

        Animal animal = new Animal();
        animal.setName("Panda");
        System.out.println(animal.getName());

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Compreendendo Tipos de Dados
     * <p> » » » Usando Tipos Primitivos
     * <p> » » » » Escrevendo Literais
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void escrevendoLiterais() {

        // long max = 3123456789;  // DOES NOT COMPILE
        long max = 3123456789L;  // Now Java knows it is a long
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Compreendendo Tipos de Dados
     * <p> » » » Usando Tipos Primitivos
     * <p> » » » » Literais e o caractere de sublinhado (*underscore*)
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void literaisCaractereSublinhado() {

        int million1 = 1000000;
        int million2 = 1_000_000;
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Compreendendo Tipos de Dados
     * <p> » » » Using Primitive Types
     * <p> » » » » The Primitive Types
     * <p> » » » » » TABLE 1.5 Primitive types
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void primitiveTypes() {

        boolean bool = false;
        byte b = 1;
        short sh = 1;
        int i = 0;
        long l = 0L;
        float f = 0F;
        double d = 0D;
        char c = 'c';
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Compreendendo Tipos de Dados
     * <p> » » » Criando Classes Wrapper
     * <p> » » » » TABLE 1.6 Wrapper classes
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoClassesWrapper() {

        Boolean bool = false;
        Byte b = 1;
        Short sh = 1;
        Integer i = 0;
        Long l = 0L;
        Float f = 0F;
        Double d = 0D;
        Character c = 'c';
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Inicializando Variáveis
     * <p> » » » Definição de Variáveis de Instância e de Classe
     * <p> » » » » Inferência de Tipo com `var`
     * <p> » » » » Tipo Inferência de `var`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void tipoInferenciaVar() {
        System.out.println("###################################################");
        System.out.println("Método: tipoInferenciaVar()");
        System.out.println("###################################################");
        reassignment();
        breakingDeclaration();
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Inicializando Variáveis
     * <p> » » » Definição de Variáveis de Instância e de Classe
     * <p> » » » » Inferência de Tipo com `var`
     * <p> » » » » Tipo Inferência de `var`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void reassignment() {
        var number = 7;
        number = 4;
        //number = "five";  // DOES NOT COMPILE
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Inicializando Variáveis
     * <p> » » » Definição de Variáveis de Instância e de Classe
     * <p> » » » » Inferência de Tipo com `var`
     * <p> » » » » Tipo Inferência de `var`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void breakingDeclaration() {
        var silly
                = 1;
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Declarando Variáveis
     * <p> » » » Declarando Múltiplas Variáveis
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    static void sandFence() {
        String s1, s2;
        String s3 = "yes", s4 = "no";
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Declarando Variáveis
     * <p> » » » Declarando Múltiplas Variáveis
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public static void declarandoMultiplasVariaveis() {
        sandFence();

        //int num, String value; // DOES NOT COMPILE

        boolean b1, b2;
        String s1 = "1", s2;
        // double d1, double d2; // DOES NOT COMPILE
        int i1; int i2;
        // int i3; i4; // DOES NOT COMPILE
    }

    void paintFence() {
        int i1, i2, i3 = 0;
    }

    public int valid() {
        int y = 10;
        int x;  // x is declared here
        x = 3;  // x is initialized here
        int z;  // z is declared here but never initialized or used
        int reply = x + y;
        return reply;
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Criando Variáveis Locais
     * <p> » » » Variáveis Locais Não Inicializadas
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public int notValid() {
        int y = 10;
        int x;
//        int reply = x + y;  // DOES NOT COMPILE
//        return reply;
        return y;
    }

    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch);  // DOES NOT COMPILE
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Inicializando Variáveis
     * <p> » » » Exemplos com `var`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void  exemplosComVar() {
        System.out.println("###################################################");
        System.out.println("Método: exemplosComVar()");
        System.out.println("###################################################");

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 1 ■ Blocos de Construção
     * <p> » » Inicializando Variáveis
     * <p> » » » Exemplos com `var`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void doesThisCompile(boolean check) {
//        var question;   // DOES NOT COMPILE
//        question = 1;
//        var answer;   // DOES NOT COMPILE
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//        System.out.println(answer);
    }
}
