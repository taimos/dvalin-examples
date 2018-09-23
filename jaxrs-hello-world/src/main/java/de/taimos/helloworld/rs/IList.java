/*
 * Copyright (c) 2018. Taimos GmbH http://www.taimos.de
 */

package de.taimos.helloworld.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/list")
@Produces("application/json")
@Consumes("application/json")
public interface IList {

	@GET
	@Operation(summary = "Get the list of items")
	List<String> getList();

	@GET
	@Path("/{id}")
	@Operation(summary = "Get a single item by id")
	String getItem(@PathParam("id") @Parameter(description = "the item id") String id);

}
