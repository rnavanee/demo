package com.demo.jaxrs.server;
 
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.demo.jaxrs.to.Customer;
import com.demo.jaxrs.to.Order;

@Path("/customerservice/")
@Produces("application/xml")
public class CustomerService {
 
    public CustomerService() {
    }
 
    @GET
    public List<Customer> getCustomers() {
        //......
    	return null;
    }
 
    @GET
    @Path("/customers/{id}")
    @Produces("application/json")
    public Customer getCustomer(@PathParam("id") String id) {
        //......
    	return null;
    }
 
    @PUT
    @Path("/customers/{id}")
    @Consumes("application/xml")
    public Response updateCustomer(@PathParam("id") Long id, Customer customer) {
        //......
    	return null;
    }
 
    @POST
    @Path("/customers")
    public Response addCustomer(Customer customer) {
        //......
    	return null;
    }
 
    @DELETE
    @Path("/customers/{id}/")
    public Response deleteCustomer(@PathParam("id") String id) {
        //......
    	return null;
    }
 
    @Path("/orders/{orderId}/")
    public Order getOrder(@PathParam("orderId") String orderId) {
       //......
    	return null;
    }
}