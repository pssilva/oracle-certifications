package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Encapsulando Dados com Registros
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public record CraneDTO(int numberEggs, String name) {
    public CraneDTO(int numberEggs, String name) {
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}
