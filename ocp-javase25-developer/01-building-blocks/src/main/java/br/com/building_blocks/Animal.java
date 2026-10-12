package br.com.building_blocks;


/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: building-classes
 * <ul>
 *     <li>Utilizar Conceitos de Orientação a Objetos em Java</li>
 *     <ul>
 *          <li>Criar classes</li>
 *              <ul>
 *                  <li>Definir e usar campos e métodos de instância</li>
 *                  <li>Construtores, incluindo corpos de construtores</li>
 *              </ul>
 *     </ul>
 * </ul>
 * <p> Para mais detalhes veja em:
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class Animal {

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
