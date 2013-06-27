package com.gilt.gittest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testApp() {
		final String message = "Hello";
		assertEquals(message, new App(message).toString());
	}
}
