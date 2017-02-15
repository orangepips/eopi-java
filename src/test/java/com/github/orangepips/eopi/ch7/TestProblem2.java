package com.github.orangepips.eopi.ch7;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem2 {
	@Test
	public void testBaseConvert() {
		Assert.assertEquals("1A7", Problem2.baseConvert("615", 7, 13));
	}
	
	@Test
	public void testBaseConvertNegative() {
		Assert.assertEquals("-1A7", Problem2.baseConvert("-615", 7, 13));
	}
}
