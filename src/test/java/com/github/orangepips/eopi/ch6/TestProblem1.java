package com.github.orangepips.eopi.ch6;

import java.util.Arrays;

import org.junit.Test;

public class TestProblem1 {
	@Test
	public void testDutchFlagPartition() {
		int[] numbers = TestUtility.randomNumbers(10, 20, -10, 10);
		int pivotIndex = TestUtility.nextInt(0, numbers.length - 1);
		
		System.out.println(Arrays.toString(numbers) + "\tPivot Index: " + pivotIndex + "\tPivot: " + numbers[pivotIndex]);
		System.out.println(Arrays.toString(Problem1.dutchFlagPartition(pivotIndex, numbers)));		
	}
}
