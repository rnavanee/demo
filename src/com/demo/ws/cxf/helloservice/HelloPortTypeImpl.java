
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.demo.ws.cxf.helloservice;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-31T15:29:38.360-08:00
 * Generated source version: 2.7.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "HelloService",
                      portName = "HelloPort",
                      targetNamespace = "http://www.demo.com/ws/cxf/HelloService",
                      wsdlLocation = "DemoHello.wsdl",
                      endpointInterface = "com.demo.ws.cxf.helloservice.HelloPortType")
                      
public class HelloPortTypeImpl implements HelloPortType {

    private static final Logger LOG = Logger.getLogger(HelloPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.demo.ws.cxf.helloservice.HelloPortType#sayHello(java.lang.String  firstName )*
     */
    public java.lang.String sayHello(java.lang.String firstName) {
        LOG.info("Executing operation sayHello");
        System.out.println(firstName);
        try {
            java.lang.String _return = "Hello "+firstName+"!";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
