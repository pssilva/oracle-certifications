package br.com.exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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

    public static void main(String[] args) throws IOException {
        //exibindoExcecao();
        seguindoOrdemOperacoes();
        aplicandoConceitoEffectivelyFinal();
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

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Automatizando o Gerenciamento de Recursos
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myfile.txt");
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Automatizando o Gerenciamento de Recursos
     * <p> » » » Introdução ao Try-with-Resources
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void readFileV2(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Automatizando o Gerenciamento de Recursos
     * <p> » » » Introdução ao Try-with-Resources
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    private void seeAnimals() {
    }

    private void getUp() {
    }

    void fall() {  throw new RuntimeException(); }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Tratamento Exceções
     * <p> » » » Encadeando blocos `catch`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {  // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosed e) {       // second catch block
            System.out.print("not today");
        }
    }

    private void seeAnimal() {
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Tratamento Exceções
     * <p> » » » Encadeando blocos `catch`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void visitMonkeys() {
        try {
            seeAnimal();
        } catch (ExhibitClosedForLunch e) {  // Subclass exception
            System.out.print("try back later");
        } catch (ExhibitClosed e) {          // Superclass exception
            System.out.print("not today");
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Tratamento Exceções
     * <p> » » » Encadeando blocos `catch`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void visitMonkeysV2() {
        try {
            seeAnimal();
        } catch (ExhibitClosed e) {
            System.out.print("not today");
//        } catch (ExhibitClosedForLunch e) {  // DOES NOT COMPILE
//            System.out.print("try back later");
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Tratamento Exceções
     * <p> » » » Encadeando blocos `catch`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void visitSnakes() {
        try {
        } catch (IllegalArgumentException e) {
       // } catch (NumberFormatException e) {  // DOES NOT COMPILE
        }
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Tratamento Exceções
     * <p> » » » Encadeando blocos `catch`
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    public void visitManatees() {
        try {
        } catch (NumberFormatException e1) {
            System.out.println(e1);
        } catch (IllegalArgumentException e2) {
       //     System.out.println(e1);  // DOES NOT COMPILE
        }
    }


    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Tratamento Exceções
     * <p> » » » Aplicando um bloco Multi-catch
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void aplicandoBlocoMultiCatch() {

        System.out.println("###################################################");
        System.out.println("Método: aplicandoBlocoMultiCatch()");
        System.out.println("###################################################");
        String args[] = new String[0];
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        System.out.println("===================================================");
        System.out.println("Aplicando um bloco Multi-catch");
        System.out.println("===================================================");
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Automatizando o Gerenciamento de Recursos
     * <p> » » » Introdução ao Try-with-Resources
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    void exploreV2() {
        try {
            seeAnimals();
            fall();
        } catch (Exception e) {
            getHugFromDaddy();
        } finally {
            seeMoreAnimals();
        }
        goHome();
    }

    private void goHome() {
    }

    private void seeMoreAnimals() {
    }

    private void getHugFromDaddy() {
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Automatizando o Gerenciamento de Recursos
     * <p> » » » Noções básicas sobre Try-with-Resources
     * <p> » » » » Seguindo a Ordem de Operações
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void seguindoOrdemOperacoes() {

        System.out.println("###################################################");
        System.out.println("Método: seguindoOrdemOperacoes()");
        System.out.println("###################################################");
        try (MyFileClass bookReader = new MyFileClass(1);
             MyFileClass movieReader = new MyFileClass(2)) {
            System.out.println("Try Block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Automatizando o Gerenciamento de Recursos
     * <p> » » » Aplicando o Conceito de "Effectively Final"
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void aplicandoConceitoEffectivelyFinal() throws IOException {

        System.out.println("###################################################");
        System.out.println("Método: aplicandoConceitoEffectivelyFinal()");
        System.out.println("###################################################");
        final var bookReader = new MyFileClass(4);
        MyFileClass movieReader = new MyFileClass(5);
        try (bookReader;
             var tvReader = new MyFileClass(6);
             movieReader) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }

        System.out.println("===================================================");
        System.out.println("usando um recurso sem ser Efetivamente final");
        System.out.println("===================================================");

        Path path = null;
        var writer = Files.newBufferedWriter(path);
//        try (writer) {  // DOES NOT COMPILE
//            writer.append("Welcome to the zoo!");
//        }
        writer = null;

        System.out.println("###################################################");
    }
}
