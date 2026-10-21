package br.com.operators;

import java.util.Arrays;
import java.util.List;

/**
 * <p> OBJETIVOS DO EXAME OCP ABORDADOS NESTE PACOTE: operators
 * <ul>
 *     <li> Manipulação de valores de data, hora, texto, numéricos e booleanos</li>
 *      <ul>
 *           <li>
 *               Utilizar tipos primitivos e classes wrapper. Avaliar expressões aritméticas
 *               e booleanas, utilizando a API Math e aplicando regras de precedência, conversões
 *               de tipo e casting.
 *           </li>
 *     </ul>
 * </ul>
 *
 * <p> Para mais detalhes veja em:
 *
 * @see <a href="https://github.com/pssilva/oracle-certifications/tree/main/ocp-javase25-developer#t%C3%B3picos-da-certifica%C3%A7%C3%A3o" >Oracle Certifications: OCP Java SE 25 Developer :: Tópicos da Certificação</a>
 */
public class OperadoresPracticalClass {

    public OperadoresPracticalClass() {
    }

    public static void main(String[] args){
        operadoresComplementoNegacao();
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 2 ■ Operadores
     * <p> » » Aplicando Operadores Unários
     * <p> » » » Operadores de Complemento e Negação
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void operadoresComplementoNegacao() {

        System.out.println("###################################################");
        System.out.println("Método: operadoresComplementoNegacao()");
        System.out.println("###################################################");

        System.out.println("===================================================");
        System.out.println(" O operador de complemento lógico (!) ");
        System.out.println("===================================================");
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);  // false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep);  // true
        System.out.println("===================================================");

        System.out.println("===================================================");
        System.out.println(" operador de negação bit a bit (~) ");
        System.out.println("===================================================");
        int number = 70;
        int negated = ~number;
        System.out.println(negated);   // -71
        System.out.println(~negated);  // 70
        System.out.println("===================================================");

        System.out.println("===================================================");
        System.out.println(" o operador de negação (-) ");
        System.out.println("===================================================");
        double zooTemperature = 1.21;
        System.out.println(zooTemperature);  // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);  // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);  // -1.21
        System.out.println("===================================================");

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 2 ■ Operadores
     * <p> » » Aplicando Operadores Unários
     * <p> » » » Operadores de incremento e decremento
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void operadoresIncrementoDecremento() {

        System.out.println("###################################################");
        System.out.println("Método: operadoresIncrementoDecremento()");
        System.out.println("###################################################");

        int parkAttendance = 0;
        System.out.println(parkAttendance);    // 0
        System.out.println(++parkAttendance);  // 1
        System.out.println(parkAttendance);    // 1
        System.out.println(parkAttendance--);  // 1
        System.out.println(parkAttendance);    // 0

        System.out.println("###################################################");
    }


}
