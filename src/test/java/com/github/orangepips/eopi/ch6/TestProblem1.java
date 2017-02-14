package com.github.orangepips.eopi.ch6;

import java.util.Arrays;

import org.junit.Test;

public class TestProblem1 {
	@Test
	public void testDutchFlagPartition() {
		int size = Problem1.nextInt(10, 20);
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = Problem1.nextInt(-10, 10);
		}
		int pivotIndex = Problem1.nextInt(0, size - 1);
		
		System.out.println(Arrays.toString(numbers) + "\tPivot Index: " + pivotIndex + "\tPivot: " + numbers[pivotIndex]);
		System.out.println(Arrays.toString(Problem1.dutchFlagPartition(pivotIndex, numbers)));		
	}
}
