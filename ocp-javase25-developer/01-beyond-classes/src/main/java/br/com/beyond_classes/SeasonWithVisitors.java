package br.com.beyond_classes;
/**
 * <p>Código presente no Ebook: <a href="https://a.co/d/0alQOByp" >OCP Oracle® Certified Professional Java® SE 21 Developer</a>
 * <p> » Capítulo 7 ■ Além das Classes
 * <p> » » Trabalhando com Enums
 * <p> » » » Trabalhando com Enumerações Complexas
 * </ br>
 *
 * <p>Escute o áudio explicativo do propósito da questão na Evidência de Estudo: [TRABALHO EM PROGRESSO]
 */
public enum SeasonWithVisitors implements Visitors {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String visitors;
    public static final String DESCRIPTION = "Weather enum";
    private SeasonWithVisitors(String visitors) {
        System.out.print("constructing,");
        this.visitors = visitors;
    }
    @Override public void printVisitors() {
        System.out.println(visitors);
    }
}
