package com.brugnot.sample.ejb.core;

import javax.ejb.Remote;

/**
 * Created by Antonin on 15/12/2016.
 */
@Remote
public interface HelloStateless {

    /**
     *
     * @param name
     */
    String sayHelloTo(String name);
}
