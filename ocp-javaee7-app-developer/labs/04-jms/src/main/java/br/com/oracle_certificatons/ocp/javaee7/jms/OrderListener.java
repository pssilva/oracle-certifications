package br.com.oracle_certificatons.ocp.javaee7.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = OrderProducer.ORDER_QUEUE),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class OrderListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.printf("[OrderListener] %s (redelivered=%s)%n",
                    message.getBody(String.class), message.getJMSRedelivered());
        } catch (JMSException e) {
            throw new IllegalStateException(e);
        }
    }
}
