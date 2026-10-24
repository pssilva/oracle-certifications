package br.com.localization;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

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
public class LocalizacaoPracticalClass {

    public LocalizacaoPracticalClass() {
    }

    public static void main(String[] args){

    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Suportando Internacionalização e Localização
     * <p> » » » Escolhendo uma Localidade
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void escolhendoLocalidade() {

        System.out.println("###################################################");
        System.out.println("Método: escolhendoLocalidade()");
        System.out.println("###################################################");
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN);   // de
        System.out.println(Locale.GERMANY);  // de_DE

        System.out.println(Locale.of("fr"));        // fr
        System.out.println(Locale.of("hi", "IN"));  // hi_IN

        System.out.println("===================================================");

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        System.out.println("===================================================");

        System.out.println(Locale.getDefault());  // en_US
        Locale locale2 = Locale.of("fr");
        Locale.setDefault(locale2);
        System.out.println(Locale.getDefault());  // fr

        System.out.println("###################################################");
    }

    /**
     * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
     * <p> » Capítulo 11 ■ Exceções e Localização
     * <p> » » Suportando Internacionalização e Localização
     * <p> » » » Localizando Números
     * <p> » » » » Formatando Números
     * </ br>
     *
     * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
     */
    private static void FormatandoNumeros() {

        System.out.println("###################################################");
        System.out.println("Método: FormatandoNumeros()");
        System.out.println("###################################################");
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));  // 266,666

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));  // 266.666

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));  // 266 666

        System.out.println("===================================================");
        System.out.println("formatação de moeda ");
        System.out.println("===================================================");
        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));
        System.out.println("===================================================");


        System.out.println("###################################################");
    }

}
