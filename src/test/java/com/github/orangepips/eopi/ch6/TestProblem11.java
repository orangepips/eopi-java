package com.github.orangepips.eopi.ch6;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestProblem11 {
	@Test
	public void TestExample() {
		List<Integer> elements = Arrays.asList(3, 7, 5, 11);
		System.out.println(Problem11.getSample(elements, 3));
	}
}
