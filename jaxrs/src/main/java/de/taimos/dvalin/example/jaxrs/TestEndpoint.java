/*
 * Copyright (c) 2017. Taimos GmbH http://www.taimos.de
 */

package de.taimos.dvalin.example.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import de.taimos.dvalin.jaxrs.JaxRsComponent;

@JaxRsComponent
@Path("/")
public class TestEndpoint {
	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String sayHello() {
		return "Hello, World!";
	}
	
}
