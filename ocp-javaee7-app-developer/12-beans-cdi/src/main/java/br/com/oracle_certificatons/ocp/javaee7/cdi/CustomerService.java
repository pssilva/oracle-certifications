package br.com.oracle_certificatons.ocp.javaee7.cdi;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.logging.Logger;

@Transactional
public class CustomerService {

    @Inject
    private EntityManager em;
    @Inject
    private Logger logger;

    public void createCustomer(Customer customer) {
        em.persist(customer);
    }

    public Customer findCustomerById(Long id) {
        return em.find(Customer.class, id);
    }

    @AroundInvoke
    private Object logMethod( InvocationContext ic ) throws Exception {
        logger.entering( ic .getTarget().toString(), ic .getMethod().getName());
        try {
            return ic.proceed() ;
        } finally {
            logger.exiting( ic .getTarget().toString(), ic .getMethod().getName());
        }
    }
}
