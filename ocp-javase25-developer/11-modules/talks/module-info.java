/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 12 ■ Módulos
 * <p> » » Atualizando Nosso Exemplo para Múltiplos Módulos
 * <p> » » » Criando o Módulo Talks
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
module zoo.animal.talks {
    exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;
    // no longer needed requires zoo.animal.feeding;
    // no longer needed requires zoo.animal.care;
    requires transitive zoo.animal.care;

    opens zoo.animal.talks.schedule;
    opens zoo.animal.talks.media to zoo.staff;
}