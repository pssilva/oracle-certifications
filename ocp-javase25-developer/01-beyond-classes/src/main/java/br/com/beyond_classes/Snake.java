package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Selando Classes
 * <p> » » » Declarando uma Classe Selada
 *
 * <p> » » Implementando Interfaces
 * <p> » » » Escrevendo um Método de Interface *Default*
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public sealed class Snake  implements IsColdBlooded permits Cobra {
    public boolean hasScales() {       // Required override
        return true;
    }
    public double getTemperature() {   // Optional override
        return 12.2;
    }
}
