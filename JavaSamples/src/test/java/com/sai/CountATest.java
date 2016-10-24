package com.sai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountATest {
	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countNoOfAs("aa");
		assertEquals(2, output);
	}

}
