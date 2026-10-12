package zoo.tours.agency;

import zoo.tours.api.*;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 12 ■ Módulos
 * <p> » » Criando um Serviço
 * <p> » » » Adicionando um Provedor de Serviço
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class TourImpl  implements Tour {

    public String name() {
        return "Behind the Scenes";
    }

    public int length() {
        return 120;
    }

    public Souvenir getSouvenir() {
        return new Souvenir("stuffed animal");
    }
}