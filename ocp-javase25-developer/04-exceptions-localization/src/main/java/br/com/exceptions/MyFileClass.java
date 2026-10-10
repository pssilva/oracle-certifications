package br.com.exceptions;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 11 ■ Exceções e Localização
 * <p> » » Automatizando o Gerenciamento de Recursos
 * <p> » » » Noções básicas sobre Try-with-Resources
 * <p> » » » » Seguindo a Ordem de Operações
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class MyFileClass implements AutoCloseable {
    private final int num;
    public MyFileClass(int num) { this.num = num; }
    @Override public void close() {
        System.out.println("Closing: " + num);
    }
}
