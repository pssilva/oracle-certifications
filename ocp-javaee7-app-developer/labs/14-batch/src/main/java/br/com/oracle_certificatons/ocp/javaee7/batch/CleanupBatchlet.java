package br.com.oracle_certificatons.ocp.javaee7.batch;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.BatchStatus;
import javax.batch.runtime.context.JobContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CleanupBatchlet extends AbstractBatchlet {

    @Inject
    JobContext jobContext;

    @Override
    public String process() {
        System.out.println("[CleanupBatchlet] job " + jobContext.getJobName());
        return BatchStatus.COMPLETED.toString(); // exit status
    }
}
