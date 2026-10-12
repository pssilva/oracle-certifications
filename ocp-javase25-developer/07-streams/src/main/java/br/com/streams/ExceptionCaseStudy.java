package br.com.streams;
import java.io.*;
import java.util.*;

/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 10 ■ Streams
 * <p> » » Trabalhando com Conceitos Avançados de Pipeline de Streams
 * <p> » » » Cenário do Mundo Real
 * <p> » » » » Exceções Verificadas (Checked Exceptions) e Interfaces Funcionais
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public class ExceptionCaseStudy {
    private static List<String> create() throws IOException {
        throw new IOException();
    }
}
