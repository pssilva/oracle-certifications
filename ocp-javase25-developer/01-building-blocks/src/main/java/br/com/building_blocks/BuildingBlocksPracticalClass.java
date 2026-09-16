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

}
