
package it.sapienza.softeng.exam;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Interface", targetNamespace = "http://exam.softeng.sapienza.it/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Interface {


    /**
     * 
     * @param arg0
     * @return
     *     returns it.sapienza.softeng.exam.Professor
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDetails", targetNamespace = "http://exam.softeng.sapienza.it/", className = "it.sapienza.softeng.exam.GetDetails")
    @ResponseWrapper(localName = "getDetailsResponse", targetNamespace = "http://exam.softeng.sapienza.it/", className = "it.sapienza.softeng.exam.GetDetailsResponse")
    public Professor getDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
