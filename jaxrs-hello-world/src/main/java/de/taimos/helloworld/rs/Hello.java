package de.taimos.helloworld.rs;

import de.taimos.dvalin.jaxrs.JaxRsComponent;

@JaxRsComponent
public class Hello implements IHello {
    
    @Override
    public String sayHello() {
        return "Hello, you!";
    }

    @Override
    public String sayHelloWorld() {
        return "Hello, world!";
    }

}
