/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 12 ■ Módulos
 * <p> » » Atualizando Nosso Exemplo para Múltiplos Módulos
 * <p> » » » Criando um Módulo de Cuidados
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
module zoo.animal.care {
    exports zoo.animal.care.medical;
    requires zoo.animal.feeding;
}