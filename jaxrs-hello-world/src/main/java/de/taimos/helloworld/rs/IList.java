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

@Path("/list")
@Produces("application/json")
@Consumes("application/json")
public interface IList {
    
    @GET
    List<String> getList();

    @GET
    @Path("/{id}")
    String getItem(@PathParam("id") String id);

}
