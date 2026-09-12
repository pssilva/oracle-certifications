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
}
