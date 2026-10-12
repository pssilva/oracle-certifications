package br.com.oracle_certificatons.ocp.javaee7.batch;

import java.io.IOException;
import java.util.Properties;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/batch/start")
public class BatchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        JobOperator operator = BatchRuntime.getJobOperator();
        long executionId = operator.start("uppercase-job", new Properties()); // não bloqueia
        resp.getWriter().println("executionId=" + executionId
                + " status=" + operator.getJobExecution(executionId).getBatchStatus());
    }
}
