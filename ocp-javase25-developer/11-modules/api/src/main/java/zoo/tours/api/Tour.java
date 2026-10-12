package zoo.tours.api;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 12 ■ Módulos
 * <p> » » Criando um Serviço
 * <p> » » » Declarando a Interface do Provedor de Serviço
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public interface Tour {
    String name();
    int length();
    Souvenir getSouvenir();
}
