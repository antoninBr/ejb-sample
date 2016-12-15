package com.brugnot.sample.ejb.core.impl;

import com.brugnot.sample.ejb.core.HelloStateless;

import javax.ejb.Stateless;

/**
 * Created by Antonin on 15/12/2016.
 */
@Stateless
public class HelloStatelessBean implements HelloStateless {

    public String sayHelloTo(String name) {
        return "Hello "+name;
    }
}
