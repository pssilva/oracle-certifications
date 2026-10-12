package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Encapsulando Dados com Registros
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public final class CraneV2 {
    private final int numberEggs;
    private final String name;

    public CraneV2(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs;  // guard
        else throw new IllegalArgumentException();
        this.name = name;
    }

    public int getNumberEggs() {         // getter
        return numberEggs;
    }

    public String getName() {            // getter
        return name;
    }
}
