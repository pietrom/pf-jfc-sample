package it.unibs.ing.fp.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testSayHello() throws Exception {
		final String result = new Hello().sayHello();
		assertEquals("Hello, World!", result);
	}
	
	
}
