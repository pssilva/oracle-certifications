package br.com.exceptions;

import java.io.IOException;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: exceptions-localization
 * <ul>
 *     <li>Tratamento de Exceções</li>
 *     <ul>
 *          <li>
 *              Tratar exceções usando blocos try/catch/finally, try-with-resources e
 *              multi-catch, incluindo exceções personalizadas.
 *           </li>
 *          <li>
 *              Implementação de Localização
 *           </li>
 *          <li>
 *              Implementar localização usando localidades e pacotes de recursos. Analisar
 *              e formatar mensagens, datas, horas e números, incluindo valores monetários
 *              e percentuais.
 *           </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class ExceptionsPracticalClass {

    public ExceptionsPracticalClass() {
    }

    public static void main(String[] args){
        exibindoExcecao();
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Entendendo Exceções
     * <p> » » » Cenário do Mundo Real
     * <p> » » » » Códigos de Retorno vs. Exceções
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void codigosRetornoExcecoes() {

        System.out.println("###################################################");
        System.out.println("Método: codigosRetornoExcecoes()");
        System.out.println("###################################################");

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Entendendo Exceções
     * <p> » » » Cenário do Mundo Real
     * <p> » » » » Códigos de Retorno vs. Exceções
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) { return i; }
        }
        return -1;
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Entendendo Exceções
     * <p> » » » Entendendo os Tipos de Exceção
     * <p> » » » » Exceções Verificadas (Checked Exceptions)
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void checkedExceptions() {

        System.out.println("###################################################");
        System.out.println("Método: checkedExceptions()");
        System.out.println("###################################################");

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Entendendo Exceções
     * <p> » » » Entendendo os Tipos de Exceção
     * <p> » » » » Exceções Verificadas (Checked Exceptions)
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    void fall(int distance) throws IOException {
        if(distance> 10) {
            throw new IOException();
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Entendendo Exceções
     * <p> » » » Exibindo uma Exceção
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void exibindoExcecao() {

        System.out.println("###################################################");
        System.out.println("Método: exibindoExcecao()");
        System.out.println("###################################################");
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e + "\n");
            System.out.println(e.getMessage()+ "\n");
            e.printStackTrace();
        }
        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Entendendo Exceções
     * <p> » » » Exibindo uma Exceção
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void hop() {
        throw new RuntimeException("cannot hop");
    }

}
