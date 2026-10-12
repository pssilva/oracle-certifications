package br.com.io_api;

import java.io.Serializable;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 14 ■ Entrada/Saída I/O
 * <p> » » Serialização de Dados
 * <p> » » » Serializando Records
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public record Record (String name) implements Serializable {}
