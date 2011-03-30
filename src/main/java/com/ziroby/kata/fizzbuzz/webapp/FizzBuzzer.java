package com.ziroby.kata.fizzbuzz.webapp;

import javax.ws.rs.Path;

@Path("/fizzbuzz")
public class FizzBuzzer {
	
	@GET
	@Path("/1")
	public String buzz()
	{
		return "one";
	}
}