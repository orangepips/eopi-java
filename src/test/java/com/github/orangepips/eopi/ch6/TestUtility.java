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

}
