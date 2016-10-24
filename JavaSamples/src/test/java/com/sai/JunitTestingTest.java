/**
 * 
 */
package com.sai;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author UJM4
 *
 */
public class JunitTestingTest {

	
	/**
	 * Test method for {@link com.sai.JunitTesting#square(int)}.
	 */
	@Test
	public final void testSquare() {
		JunitTesting test = new JunitTesting();
		int output = test.square(5);
		assertEquals(25, output);
	}

	/**
	 * Test method for {@link com.sai.JunitTesting#countNoOfAs(java.lang.String)}.
	 */
	@Test
	public final void testCountNoOfAs() {
		JunitTesting test = new JunitTesting();
		int output = test.countNoOfAs("aa");
		assertEquals(2, output);
	}

}
