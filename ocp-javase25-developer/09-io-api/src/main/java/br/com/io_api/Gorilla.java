package br.com.io_api;

import java.io.Serial;
import java.io.Serializable;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 14 ■ Entrada/Saída I/O
 * <p> » » Serialização de Dados
 * <p> » » » Aplicando a Interface Serializable
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class Gorilla implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private Boolean friendly;
    private transient String favoriteFood;

    // Constructors/Getters/Setters/toString() omitted
}
