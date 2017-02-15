package com.github.orangepips.eopi.ch6;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class TestProblem6 {
	@Test
	public void TestExample() {
		int[] prices = new int[] {310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
		
		Assert.assertEquals(30, Problem6.maxProfit(prices));
	}
	
	@Test
	public void TestRandom() {
		int[] prices = TestUtility.randomNumbers(8, 12, 75, 125);
		System.out.println(Arrays.toString(prices));
		System.out.println(Problem6.maxProfit(prices));
	}
	
	@Test
	public void TestZeroProfit() {
		int[] prices1 = new int[] {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		Assert.assertEquals(0, Problem6.maxProfit(prices1));
		
		int[] prices2 = new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		Assert.assertEquals(0, Problem6.maxProfit(prices2));
	}
	
	@Test
	public void TestOneProfit() {
		int[] prices1 = new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 101};
		Assert.assertEquals(1, Problem6.maxProfit(prices1));
	}
}
