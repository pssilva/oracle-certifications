package br.com.oracle_certificatons.ocp.javaee7.batch;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.batch.api.BatchProperty;
import javax.batch.api.chunk.AbstractItemReader;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class WordReader extends AbstractItemReader {

    @Inject
    @BatchProperty(name = "words")
    String words;

    private Iterator<String> iterator;

    @Override
    public void open(Serializable checkpoint) {
        List<String> list = Arrays.asList((words == null ? "java,ee,sete" : words).split(","));
        iterator = list.iterator();
    }

    @Override
    public Object readItem() {
        return iterator.hasNext() ? iterator.next() : null; // null encerra o step
    }
}
