package br.com.lambdas.functional.interfaces;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: lambdas-funcional-interfaces
 * <ul>
 *     <li> Utilizando Conceitos de Orientação a Objetos em Java</li>
 *     <ul>
 *          <li>
 *              Compreender escopos de variáveis, aplicar encapsulamento e criar objetos imutáveis.
 *              Utilizar inferência de tipo de variável local.
 *           </li>
 *          <li>
 *              Criar e utilizar interfaces, identificar interfaces funcionais e utilizar métodos de
 *              interface privados, estáticos e padrão.
 *           </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class LambdasFuncionalInterfacesPracticalClass {

    public LambdasFuncionalInterfacesPracticalClass() {
    }

    public static void main(String[] args){

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
     * <p> » » Codificando Interfaces Funcionais
     * <p> » » » Definindo uma Interface Funcional
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void definindoInterfaceFuncional() {

        System.out.println("###################################################");
        System.out.println("Método: definindoInterfaceFuncional()");
        System.out.println("###################################################");

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
     * <p> » » Trabalhando com Interfaces Funcionais Integradas
     * <p> » » » Implementando `Supplier`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void implementandoSupplier() {

        System.out.println("###################################################");
        System.out.println("Método: implementandoSupplier()");
        System.out.println("###################################################");
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);  // 2025-02-20

        System.out.println("===================================================");

        Supplier<StringBuilder> s11 = StringBuilder::new;
        Supplier<StringBuilder> s22 = () -> new StringBuilder();

        System.out.println(s11.get());  // Empty string
        System.out.println(s22.get());  // Empty string

        System.out.println("===================================================");

        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1);  // []
        System.out.println(s3);
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
     * <p> » » Trabalhando com Interfaces Funcionais Integradas
     * <p> » » » Implementando Consumer e BiConsumer
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void implementandoConsumerBiConsumer() {

        System.out.println("###################################################");
        System.out.println("Método: implementandoConsumerBiConsumer()");
        System.out.println("###################################################");
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");  // Annie
        c2.accept("Annie");  // Annie

        System.out.println("===================================================");

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);  // {chicken=7, chick=1}

        System.out.println("===================================================");

        var map1 = new HashMap<String, String>();
        BiConsumer<String, String> b11 = map1::put;
        BiConsumer<String, String> b22 = (k, v) -> map1.put(k, v);

        b11.accept("chicken", "Cluck");
        b22.accept("chick", "Tweep");

        System.out.println(map1);  // {chicken=Cluck, chick=Tweep}
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 8 ■ Lambdas e Interfaces Funcionais
     * <p> » » Trabalhando com Interfaces Funcionais Integradas
     * <p> » » » Implementando Function e BiFunction
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void implementandoFunctionBiFunction() {

        System.out.println("###################################################");
        System.out.println("Método: implementandoFunctionBiFunction()");
        System.out.println("###################################################");
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));  // 5
        System.out.println(f2.apply("cluck"));  // 5
        System.out.println("===================================================");

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 =
                (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));  // baby chick
        System.out.println(b2.apply("baby ", "chick"));  // baby chick
        System.out.println("###################################################");
    }
}
