package com.jersey.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/jersy")
public class JersyService {
	@GET
	@Path("/client")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getCli() {
		Client cli = new Client();
		cli.setName("Ola mundo jersey");
		return cli;
	}
}