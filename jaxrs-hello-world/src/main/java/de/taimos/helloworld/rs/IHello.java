package de.taimos.helloworld.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public interface IHello {
    
    @GET
    @Produces("text/plain")
    String sayHello();

    @GET
    @Path("/world")
    @Produces("text/plain")
    String sayHelloWorld();

}
