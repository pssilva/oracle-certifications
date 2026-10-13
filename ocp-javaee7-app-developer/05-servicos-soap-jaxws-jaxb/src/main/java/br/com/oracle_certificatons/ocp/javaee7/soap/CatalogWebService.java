package br.com.oracle_certificatons.ocp.javaee7.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/** WSDL em: /05-servicos-soap-jaxws-jaxb/CatalogService?wsdl */
@WebService(serviceName = "CatalogService")
public class CatalogWebService {

    @WebMethod
    public BookXml findBook(@WebParam(name = "isbn") String isbn) {
        return new BookXml(isbn, "Beginning Java EE 7", 49.9f);
    }

    @WebMethod(exclude = true)
    public void reindex() {
        // não aparece no WSDL
    }
}
