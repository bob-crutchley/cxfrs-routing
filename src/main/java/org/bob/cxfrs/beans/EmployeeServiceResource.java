package org.bob.cxfrs.beans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class EmployeeServiceResource {

    @Context
    private UriInfo uriInfo;

	public EmployeeServiceResource() { }

	@GET
	@Path("/employees/{name}")
	public String getCustomer(@PathParam("name") String name) {
		return null;
	}
}
