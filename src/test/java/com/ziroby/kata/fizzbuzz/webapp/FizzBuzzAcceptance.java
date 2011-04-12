package com.ziroby.kata.fizzbuzz.webapp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class FizzBuzzAcceptance {

	static String FIZZBUZZER_URL = "http://localhost:8081/fizzbuzz/";

	private WebResource getResponse(String param) {
		Client client = Client.create();
		return client.resource(FIZZBUZZER_URL + param);
	}

	@Test
	public void one_should_be_one() throws Exception {
		WebResource resource = getResponse("1");

		String result = resource.get(String.class);
		assertThat(result, is("1"));
	}

	@Test
	public void two_should_be_two() throws Exception {
		WebResource resource = getResponse("2");

		String result = resource.get(String.class);
		assertThat(result, is("2"));
	}

	@Test
	public void three_should_be_fizz() throws Exception {
		WebResource resource = getResponse("3");

		String result = resource.get(String.class);
		assertThat(result, is("fizz"));
	}

	@Test
	public void five_should_be_buzz() throws Exception {
		WebResource resource = getResponse("5");

		String result = resource.get(String.class);
		assertThat(result, is("buzz"));
	}

	@Test
	public void six_should_be_fizz() throws Exception {
		WebResource resource = getResponse("6");

		String result = resource.get(String.class);
		assertThat(result, is("fizz"));
	}

	@Test
	public void fifteen_should_be_fizzbuzz() throws Exception {
		WebResource resource = getResponse("15");

		String result = resource.get(String.class);
		assertThat(result, is("fizz buzz"));
	}
	@Test
	public void thirty_should_be_fizzbuzz() throws Exception {
		WebResource resource = getResponse("30");

		String result = resource.get(String.class);
		assertThat(result, is("fizz buzz"));
	}
}
