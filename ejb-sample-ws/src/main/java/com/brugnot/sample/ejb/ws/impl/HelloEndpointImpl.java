package com.brugnot.sample.ejb.ws.impl;

import com.brugnot.sample.ejb.core.HelloStateless;
import com.brugnot.sample.ejb.ws.HelloEndpoint;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Created by Antonin on 15/12/2016.
 */
@Stateless
public class HelloEndpointImpl implements HelloEndpoint {

   @EJB
   private HelloStateless helloStateless;

    public String sayHello() {
        return helloStateless.sayHelloTo("Antonin");
    }

}
