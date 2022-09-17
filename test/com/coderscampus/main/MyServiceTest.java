package com.coderscampus.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	private MyService myService = new MyService();

	@Test
	void testMultiply() {
		assertEquals(34, myService.multiply(2, 17));
	}

}
