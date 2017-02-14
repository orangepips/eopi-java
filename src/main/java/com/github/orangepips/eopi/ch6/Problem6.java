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
		for (int i = 0; i < prices.length; i++) {
			int price = prices[i];
			if (price < minPrice) {
				minPrice = price;
				continue;
			}
			if ((price - minPrice) > profit) {
				profit = price - minPrice;
			}
		}
		return profit;
	}
}
