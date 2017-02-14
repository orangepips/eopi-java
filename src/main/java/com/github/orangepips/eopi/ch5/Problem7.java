package com.github.orangepips.eopi.ch5;

public class Problem7 {
	/**
	 * https://en.wikipedia.org/wiki/Exponentiation_by_squaring
	 * x^n 
	 * if (n % 2 == 1) x * (x^2)^( (n - 1) / 2)
	 * else (x^2)^(n/2)
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static double exponentiate(double x, int n) {		
		if (n == 0) return 1; 
		else if (n < 0) {
			x = 1 / x;
			n = -n; 
		}
		double y = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				x *= x;
				n = n / 2;
			} else {
				y *= x;
				x *= x;
				n = (n - 1) / 2;
			}
		}
		return x * y;		
	}
}
