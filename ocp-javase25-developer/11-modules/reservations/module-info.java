/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 12 ■ Módulos
 * <p> » » Criando um Serviço
 * <p> » » » Criando um Localizador de Serviço
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
module zoo.tours.reservations {
    exports zoo.tours.reservations;
    requires zoo.tours.api;
    uses zoo.tours.api.Tour;
}