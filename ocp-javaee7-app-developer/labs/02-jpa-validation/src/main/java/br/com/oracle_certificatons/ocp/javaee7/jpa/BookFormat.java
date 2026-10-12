package br.com.oracle_certificatons.ocp.javaee7.jpa;

public enum BookFormat {
    PAPERBACK("P"), HARDCOVER("H"), EBOOK("E");

    private final String code;

    BookFormat(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static BookFormat fromCode(String code) {
        for (BookFormat format : values()) {
            if (format.code.equals(code)) {
                return format;
            }
        }
        throw new IllegalArgumentException("Formato desconhecido: " + code);
    }
}
