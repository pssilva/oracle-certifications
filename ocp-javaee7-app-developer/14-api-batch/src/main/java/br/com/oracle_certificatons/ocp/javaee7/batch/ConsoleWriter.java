package br.com.oracle_certificatons.ocp.javaee7.batch;

import java.util.List;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.inject.Named;

@Named
public class ConsoleWriter extends AbstractItemWriter {

    @Override
    public void writeItems(List<Object> items) {
        System.out.println("[ConsoleWriter] chunk = " + items);
    }
}
