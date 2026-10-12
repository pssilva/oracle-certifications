package br.com.class_design;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Criando Classes
 * <p> » » » Declarando Construtores
 * <p> » » » Criando um Construtor
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight, String color) {  // First constructor
        this.weight = weight;
        this.color = color;
    }
    public Hamster(int weight) {                // Second constructor
        this.weight = weight;
        color = "brown";
    }
}
