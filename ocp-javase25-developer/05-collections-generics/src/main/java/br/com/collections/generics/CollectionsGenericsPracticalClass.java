package br.com.collections.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: collection-generics
 *
 * <ul>
 *     <li> Trabalhando com Arrays e Coleções</li>
 *     <ul>
 *          <li>
 *              Criar arrays, coleções List, Set, Map e Deque, e adicionar, remover, atualizar,
 *              recuperar e ordenar seus elementos.
 *           </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class CollectionsGenericsPracticalClass {

    public CollectionsGenericsPracticalClass() {
    }

    public static void main(String[] args){


    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface List
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void usandoInterfaceList() {

        System.out.println("###################################################");
        System.out.println("Método: usandoInterfaceList()");
        System.out.println("###################################################");
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface List
     * <p> » » » Criando uma Lista com um Método de Fábrica
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoListaMetodoFabrica() {
        System.out.println("###################################################");
        System.out.println("Método: criandoListaMetodoFabrica()");
        System.out.println("###################################################");
        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array);           // [a, b, c]
        List<String> copy = List.copyOf(asList);    // [a, b, c]

        array[0] = "z";

        System.out.println(asList);                 // [z, b, c]
        System.out.println(of);                     // [a, b, c]
        System.out.println(copy);                   // [a, b, c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface List
     * <p> » » » Criando uma `List` com um Construtor
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void criandoListContrutor() {
        System.out.println("###################################################");
        System.out.println("Método: criandoListContrutor()");
        System.out.println("###################################################");
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);
        System.out.println("===================================================");
        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface List
     * <p> » » » Trabalhando com Métodos de List
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void trabalhandoMetodosList() {
        System.out.println("###################################################");
        System.out.println("Método: trabalhandoMetodosList()");
        System.out.println("###################################################");
        List<String> list = new ArrayList<>();
        list.add("SD");                  // [SD]
        list.add(0, "NY");               // [NY,SD]
        list.set(1, "FL");               // [NY,FL]
        System.out.println(list.get(0)); // NY
        list.remove("NY");               // [FL]
        list.remove(0);                  // []
        list.set(0, "?");                // IndexOutOfBoundsException
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface List
     * <p> » » » Métodos `remove()` Sobrecarregados
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void metodosRemoveSobrecarregados() {
        System.out.println("###################################################");
        System.out.println("Método: metodosRemoveSobrecarregados()");
        System.out.println("###################################################");
         var list = new LinkedList<Integer>();
         list.add(3);
         list.add(2);
         list.add(1);
         list.remove(2);
         list.remove(Integer.valueOf(2));
         System.out.println(list);
        System.out.println("###################################################");
    }
}
