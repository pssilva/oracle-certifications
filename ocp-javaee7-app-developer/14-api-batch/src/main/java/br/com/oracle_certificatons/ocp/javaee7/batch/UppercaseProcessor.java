package br.com.oracle_certificatons.ocp.javaee7.batch;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

@Named
public class UppercaseProcessor implements ItemProcessor {

    @Override
    public Object processItem(Object item) {
        return item.toString().trim().toUpperCase();
    }
}
