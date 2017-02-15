package com.github.orangepips.eopi.ch6;

import java.util.concurrent.ThreadLocalRandom;

public class TestUtility {

	/**
	 * http://stackoverflow.com/questions/363681/generating-random-integers-in-a-specific-range
	 * nextInt is normally exclusive of the top value,
	 * so add 1 to make it inclusive
	 * @param min inclusive
	 * @param max inclusive 
	 * @return random value between [min, max]
	 */
	public static int nextInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
		
	public static int[] randomNumbers(int minSize, int maxSize, int minVal, int maxVal) {
		int size = TestUtility.nextInt(minSize, maxSize);
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = TestUtility.nextInt(minVal, maxVal);
		}
		return numbers;
	}
}
