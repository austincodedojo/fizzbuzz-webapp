package com.ziroby.kata.fizzbuzz.engine;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class FizzBuzzTest {
	@Test
	public void three_should_be_fizz() throws Exception {
		String result= new FizzBuzz().fizzBuzz(3);		
		assertThat(result, is("fizz"));
	}
	@Test
	public void five_should_be_buzz() throws Exception {
		String result= new FizzBuzz().fizzBuzz(5);
		assertThat(result, is("buzz"));
	}
	@Test
	public void six_should_be_fizz() throws Exception {
		String result= new FizzBuzz().fizzBuzz(6);
		assertThat(result, is("fizz"));
	}
	@Test
	public void ten_should_be_buzz() throws Exception {
		String result= new FizzBuzz().fizzBuzz(10);
		assertThat(result, is("buzz"));
	}
	@Test
	public void fifteen_should_be_fizzbuzz() throws Exception {
		String result= new FizzBuzz().fizzBuzz(15);
		assertThat(result, is("fizz buzz"));
	}
}
