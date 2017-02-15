package com.github.orangepips.eopi.ch6;

import java.util.Arrays;

/**
 * Danish Flag
 * @author mlesko
 */
public class Problem1 {
	public static int[] dutchFlagPartition(int pIdx, int[] numbers) {
		int tmp = numbers[numbers.length - 1];
		numbers[numbers.length - 1] = numbers[pIdx];
		numbers[pIdx] = tmp;
		
		int pivot = numbers[numbers.length - 1];
		int ltIdx = -1;
		int gteIdx = numbers.length - 1;
		while (ltIdx < gteIdx - 1) {
			int idx = ltIdx + 1;
			int v = numbers[idx];
			if (v < pivot) {
				ltIdx++;
			} else {
				int gtV = numbers[idx];
				numbers[idx] = numbers[--gteIdx];
				numbers[gteIdx] = gtV;
			}
			System.out.println(Arrays.toString(numbers) + "\tltIdx: " + ltIdx + "\tgteIdx: " + gteIdx);
		}
		int swap = numbers[gteIdx];
		numbers[gteIdx] = numbers[numbers.length - 1];
		numbers[numbers.length - 1] = swap;
		
		return numbers;
	}
}
