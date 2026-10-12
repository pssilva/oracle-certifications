package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Implementando Interfaces
 * <p> » » » Herdando uma interface
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
// public class CommonSeal extends HarborSeal {}  // DOES NOT COMPILE
public class CommonSeal extends HarborSeal {
    @Override
    public boolean isTailStriped() {
        return false;
    }

    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}
