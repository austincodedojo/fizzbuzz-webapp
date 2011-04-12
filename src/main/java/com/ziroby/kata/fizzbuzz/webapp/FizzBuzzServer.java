package com.ziroby.kata.fizzbuzz.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.ziroby.kata.fizzbuzz.engine.FizzBuzz;

@Path("/fizzbuzz")
public class FizzBuzzServer {
	
	@GET
	@Path("/{number}")
	public String buzz(@PathParam("number") int number)
	{
		return new FizzBuzz().fizzBuzz(number);
	}
}