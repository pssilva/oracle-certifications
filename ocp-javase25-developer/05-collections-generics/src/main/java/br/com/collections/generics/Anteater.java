package br.com.collections.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 9 ■ Coleções e Genéricos
 * <p> » » Trabalhando com Genéricos
 * <p> » » » Criando Classes Genéricas
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class  Anteater extends LongTailAnimal {
    //protected void chew(List<Double> input) {}  // DOES NOT COMPILE

    protected void chew(List<Object> input) {}
    protected void chew(ArrayList<Double> input) {}
}
