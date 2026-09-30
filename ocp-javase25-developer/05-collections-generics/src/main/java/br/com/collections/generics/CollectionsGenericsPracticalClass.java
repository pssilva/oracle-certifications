package br.com.collections.generics;

import java.util.*;
import java.util.function.BiFunction;

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

        //iterandoSobreMap();
        //obtendoValoresFormaSegura();
        substituindoValores();
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

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Set
     * <p> » » » Trabalhando com métodos de Set
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void trabalhandoMetodosSet() {
        System.out.println("###################################################");
        System.out.println("Método: trabalhandoMetodosSet()");
        System.out.println("###################################################");

        Set<Character> letters = Set.of('c', 'a', 't');
        Set<Character> copy = Set.copyOf(letters);

        System.out.println("===================================================");

        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);  // true
        boolean b2 = set.add(10);  // true
        boolean b3 = set.add(66);  // false
        boolean b4 = set.add(8);   // true
        for (Integer value: set)
            System.out.print(value + ","); // 66,8,10,

        System.out.println("===================================================");

        Set<Integer> set2 = new LinkedHashSet<>();

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void usandoInterfaceMap() {
        System.out.println("###################################################");
        System.out.println("Método: usandoInterfaceMap()");
        System.out.println("###################################################");


        System.out.println("===================================================");


        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Map.of() e Map.copyOf()
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void mapOfMapCopyOf() {
        System.out.println("###################################################");
        System.out.println("Método: mapOfMapCopyOf()");
        System.out.println("###################################################");
        Map.of("key1", "value1", "key2", "value2");
        Map.ofEntries(
            Map.entry("key1", "value1"),
            Map.entry("key2", "value2")
        );
        System.out.println("###################################################");
    }


    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Chamando Métodos Básicos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    static void addElementsAndPrint(Map<String, String> map) {
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ",");

        System.out.println(map.containsKey("lion"));    // true
        System.out.println(map.containsValue("lion"));  // false
        System.out.println(map.size());     // 3
        map.clear();
        System.out.println(map.size());     // 0
        System.out.println(map.isEmpty());  // true
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Chamando Métodos Básicos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void chamandoMetodosBasicos() {
        System.out.println("###################################################");
        System.out.println("Método: chamandoMetodosBasicos()");
        System.out.println("###################################################");
        addElementsAndPrint(new HashMap<>());        // koala,giraffe,lion,
        addElementsAndPrint(new LinkedHashMap<>());  // koala,lion,giraffe,
        addElementsAndPrint(new TreeMap<>());        // giraffe,koala,lion,
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Iterando sobre um `Map`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void iterandoSobreMap() {
        System.out.println("###################################################");
        System.out.println("Método: iterandoSobreMap()");
        System.out.println("###################################################");
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.forEach((k, v) -> System.out.println(v));

        System.out.println("===================================================");

        map.values().forEach(System.out::println);

        System.out.println("===================================================");

        map.entrySet().forEach(e ->
            System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Obtendo valores de forma segura
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void obtendoValoresFormaSegura() {
        System.out.println("###################################################");
        System.out.println("Método: obtendoValoresFormaSegura()");
        System.out.println("###################################################");
        Map<Character, String> map = new HashMap<>();
        map.put('x', "spot");
        System.out.println("X marks the " + map.get('x'));
        System.out.println("X marks the " + map.getOrDefault('x', ""));
        System.out.println("Y marks the " + map.get('y'));
        System.out.println("Y marks the " + map.getOrDefault('y', ""));

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Substituindo valores
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void substituindoValores() {
        System.out.println("###################################################");
        System.out.println("Método: substituindoValores()");
        System.out.println("###################################################");
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);
        Integer original = map.replace(2, 10); // 4
        System.out.println(map);    // {1=2, 2=10}
        map.replaceAll((k, v) -> k + v);
        System.out.println(map);    // {1=3, 2=12}

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Inserindo se ausente
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void inserindoAusente() {
        System.out.println("###################################################");
        System.out.println("Método: inserindoAusente()");
        System.out.println("###################################################");
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 9 ■ Coleções e Genéricos
     * <p> » » Usando a Interface Map
     * <p> » » » Mesclando Dados
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void mesclandoDados() {
        System.out.println("###################################################");
        System.out.println("Método: mesclandoDados()");
        System.out.println("###################################################");
         BiFunction<String, String, String> mapper = (v1, v2)
            -> v1.length()> v2.length() ? v1: v2;

         Map<String, String> favorites = new HashMap<>();
         favorites.put("Jenny", "Bus Tour");
         favorites.put("Tom", "Tram");
        
         String jenny = favorites.merge("Jenny", "Skyride", mapper);
         String tom = favorites.merge("Tom", "Skyride", mapper);

         System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
         System.out.println(jenny);     // Bus Tour
         System.out.println(tom);       // Skyride
        System.out.println("###################################################");
    }

}
