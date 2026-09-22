package br.com.class_design;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> Capítulo 6 ■ Projeto de Classes
 * <p> » » Herdando Membros
 * <p> » » » Sobrescrita de Método
 * <p> » » » » Regra nº 3: Exceções Verificadas (*Checked Exceptions*)
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class GalapagosTortoise  extends Reptile {
    public void sleep() throws FileNotFoundException {}

   // public void hide() throws FileNotFoundException {} // DOES NOT COMPILE


    //public void exitShell() throws IOException {}      // DOES NOT COMPILE
}
