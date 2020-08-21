package com.quantum.augbatch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExceptionPracticeTest {
	
	@Test 
	(expected = ArithmeticException.class)
	public void dividebyzeroExceptionTest()
	{
		ExceptionPractice ep = new ExceptionPractice();
	  ep.divide(9, 0);
		//assertEquals(10, ep.divide(100,10));
		
	}
}
