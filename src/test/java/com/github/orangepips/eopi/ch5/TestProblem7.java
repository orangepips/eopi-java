package com.github.orangepips.eopi.ch5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Assert;
import org.junit.Test;


public class TestProblem7 {
	@Test
	public void testExponentiation() {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			double x = ThreadLocalRandom.current().nextDouble(-1000, 1000);
			int n = random.nextInt(8);

			double expected = Math.pow(x, n);
			double actual = Problem7.exponentiate(x, n);

			System.out.println(i + ":\t" + x + "^" + n + " = " + (actual - expected));			
			Assert.assertEquals(Double.doubleToLongBits(expected), Double.doubleToLongBits(actual));
		}
	}
}
