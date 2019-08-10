
package com.up.ropa;

import javax.jws.WebService;

@WebService(endpointInterface = "com.up.ropa.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello UPA" + text;
    }
}

