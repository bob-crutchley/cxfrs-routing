package org.bob.cxfrs.beans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class ServiceEndpoint {

    @Context
    private UriInfo uriInfo;

	public ServiceEndpoint() { }

	@POST @Consumes("application/json")
	@Path("/persist")
	public String getCustomer(@Valid Person person) {
		return null;
	}
}
