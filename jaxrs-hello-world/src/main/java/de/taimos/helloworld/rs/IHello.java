package de.taimos.helloworld.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.swagger.v3.oas.annotations.Operation;

@Path("/hello")
public interface IHello {

	@GET
	@Produces("text/plain")
	@Operation(summary = "Say hello")
	String sayHello();

	@GET
	@Path("/world")
	@Produces("text/plain")
	@Operation(summary = "Say hello to the world")
	String sayHelloWorld();

}
