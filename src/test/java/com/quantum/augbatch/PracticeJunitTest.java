package com.quantum.augbatch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PracticeJunitTest {
	@Test
	public void test() {
		PracticeJunit pj = new PracticeJunit();
		assertEquals(100,pj.mul(10, 10) );
	}

}
