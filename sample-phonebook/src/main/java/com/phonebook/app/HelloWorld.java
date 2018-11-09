package com.phonebook.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorld {

	@GET
	public String welcome(){
		return "Hello Worlda";
	}
}
