package com.github.orangepips.eopi.ch7;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem1 {
	@Test
	public void TestInt2Str() {
		Assert.assertEquals("123", Problem1.int2Str(123));
	}
	
	@Test
	public void TestInt2StrNegative() {
		Assert.assertEquals("-321", Problem1.int2Str(-321));
	}
	
	@Test
	public void TestStr2Int() {
		Assert.assertEquals(123, Problem1.str2Int("123"));
	}
	
	@Test
	public void TestStr2IntNegative() {
		Assert.assertEquals(-321, Problem1.str2Int("-321"));
	}
}
