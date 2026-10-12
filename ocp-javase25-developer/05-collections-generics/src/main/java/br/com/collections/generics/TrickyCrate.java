package br.com.collections.generics;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 9 ■ Coleções e Genéricos
 * <p> » » Trabalhando com Genéricos
 * <p> » » » Entendendo a Erasure de Tipo (Type Erasure)
 * <p> » » » » Escrevendo Métodos Genéricos
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class TrickyCrate  {
    public <T> T tricky(T t) {
       return t;
    }
}
