package de.taimos.helloworld.rs;

import de.taimos.dvalin.jaxrs.JaxRsComponent;

@JaxRsComponent
public class Hello implements IHello {
    
    @Override
    public String sayHello() {
        return "Hello, world!";
    }
    
}
