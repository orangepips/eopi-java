package com.github.orangepips.eopi.ch6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Problem11 {
	public List<Integer> getSample(List<Integer> elements, int size) {
		List<Integer> sample = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			sample.add(elements.remove(nextInt(0, elements.size() - 1)));
		}
		return sample;
	}
	
	public static int nextInt(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
}
