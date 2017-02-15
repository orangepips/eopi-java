package com.github.orangepips.eopi.ch6;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Sample offline data
 * @author mlesko
 */
public class Problem11 {
	public static List<Integer> getSample(List<Integer> elements, int size) {
		Random gen = new Random();
		for (int i = 0; i < size; i++) {
			Collections.swap(elements, i, i + gen.nextInt(elements.size() - i));
		}
		return elements;
	}
	
	
}
