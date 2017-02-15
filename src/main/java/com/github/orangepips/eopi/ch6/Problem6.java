package com.github.orangepips.eopi.ch6;

/**
 * Buy and Sell a Stock Once
 * @author mlesko
 *
 */
public class Problem6 {
	public static int maxProfit(int[] prices) {
		int profit = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int price: prices) {
			profit = Math.max(profit, price - minPrice);
			minPrice = Math.min(minPrice, price);
		}
		return profit;
	}
}
