package com.ziroby.kata.fizzbuzz.webapp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;


public class FizzBuzzAcceptance {
	@Test
	public void one_should_be_one() throws Exception {
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8081/fizzbuzz/1");
		
		String result = resource.get(String.class);
		assertThat(result, is("one"));
	}
}
