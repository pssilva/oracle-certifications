package br.com.methods;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 5 ■ Métodos
 * <p> » » Sobrecarga de Métodos
 * <p> » » » Juntando Tudo
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Glider {
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String ... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void main(String[] args) {
        System.out.println(glide("a"));
        System.out.println(glide("a", "b"));
        System.out.println(glide("a", "b", "c"));
    }
}
