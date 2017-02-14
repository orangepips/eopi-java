package com.github.orangepips.eopi.ch7;

/**
 * Intercovert strings and integers
 * @author mlesko
 *
 */
public class Problem1 {
	public static String int2Str(int value) {
		StringBuilder sb = new StringBuilder();
		Boolean isNegative = (value < 0);
		value = (isNegative ? -value : value);
		
		while (value % 10 > 0) {
			sb.append(value % 10);
			value /= 10;
		}
		
		if (isNegative) sb.append("-");
		return sb.reverse().toString();
	}
	
	public static int str2Int(String value) {
		int result = 0;
		Boolean isNegative = value.startsWith("-");
		char[] chars = value.toCharArray();
		for (int pow = 0, i = chars.length - 1; i >= 0; i--, pow++) {
			if (isNegative && i == 0) break;
			result += Character.getNumericValue(chars[i]) * Math.pow(10, pow);			
		}
		return isNegative ? -result : result;		
	}
}
