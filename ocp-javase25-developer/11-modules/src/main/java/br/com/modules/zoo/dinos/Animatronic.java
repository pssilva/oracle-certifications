package br.com.modules.zoo.dinos;

import java.time.*;
import java.util.*;
import sun.misc.Unsafe;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 12 ■ Módulos
 * <p> » » Descobrindo Módulos
 * <p> » » » Aprendendo sobre Dependências com o jdeps
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Animatronic {
    private List<String> names;
    private LocalDate visitDate;

    public Animatronic(List<String> names, LocalDate visitDate) {
        this.names = names;
        this.visitDate = visitDate;
    }
    public void unsafeMethod() {
        Unsafe unsafe = Unsafe.getUnsafe();
    }
}
