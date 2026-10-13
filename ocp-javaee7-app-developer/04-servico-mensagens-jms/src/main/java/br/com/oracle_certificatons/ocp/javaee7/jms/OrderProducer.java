package br.com.oracle_certificatons.ocp.javaee7.jms;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.Queue;
import javax.annotation.Resource;

/** API simplificada do JMS 2.0: JMSContext injetado e gerenciado pelo container. */
@JMSDestinationDefinition(
        name = OrderProducer.ORDER_QUEUE,
        interfaceName = "javax.jms.Queue",
        destinationName = "OrderQueue")
@Stateless
public class OrderProducer {

    public static final String ORDER_QUEUE = "java:global/jms/OrderQueue";

    @Inject
    private JMSContext context;

    @Resource(lookup = ORDER_QUEUE)
    private Queue queue;

    public void send(String order) {
        context.createProducer().setProperty("origem", "lab-04").send(queue, order);
    }
}
