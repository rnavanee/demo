package com.demo.ws.cxf.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2013-12-31T15:29:38.411-08:00
 * Generated source version: 2.7.8
 * 
 */
@WebService(targetNamespace = "http://www.demo.com/ws/cxf/HelloService", name = "HelloPortType")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HelloPortType {

    @WebResult(name = "greeting", targetNamespace = "", partName = "greeting")
    @WebMethod(action = "sayHello")
    public java.lang.String sayHello(
        @WebParam(partName = "firstName", name = "firstName", targetNamespace = "")
        java.lang.String firstName
    );
}
