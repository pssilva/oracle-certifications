package br.com.oracle_certificatons.ocp.javaee7.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/** JPA 2.1: grava o enum como um código de 1 letra. */
@Converter
public class BookFormatConverter implements AttributeConverter<BookFormat, String> {

    @Override
    public String convertToDatabaseColumn(BookFormat attribute) {
        return attribute == null ? null : attribute.getCode();
    }

    @Override
    public BookFormat convertToEntityAttribute(String dbData) {
        return dbData == null ? null : BookFormat.fromCode(dbData);
    }
}
