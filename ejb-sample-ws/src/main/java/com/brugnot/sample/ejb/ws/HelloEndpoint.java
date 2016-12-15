package com.brugnot.sample.ejb.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Antonin on 15/12/2016.
 */
@Path("api/Hello")
public interface HelloEndpoint {

    @Path("/sayHello")
    @GET
    String sayHello();
}
