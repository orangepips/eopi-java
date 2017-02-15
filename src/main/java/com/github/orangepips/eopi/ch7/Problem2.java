package com.github.orangepips.eopi.ch7;

public class Problem2 {
	public static String baseConvert(String value, int b1, int b2) {
		int base10 = 0;
		boolean isNegative = value.startsWith("-");
		char[] elements = value.toCharArray();
		
		for (int pow = 0, i = value.length() - 1; i >= (isNegative ? 1 : 0) ; pow++, i--) {
			char element = elements[i];
			int iVal = 0;
			switch (element) {
				case 'A':
					iVal = 10;
					break;
				case 'B':
					iVal = 11;
					break;
				case 'C':
					iVal = 12;
					break;
				case 'D':
					iVal = 13;
					break;
				case 'E':
					iVal = 14;
					break;
				case 'F':
					iVal = 15;
					break;
				default:
					iVal = Character.getNumericValue(element);				
			}
			base10 += iVal * Math.pow(b1, pow);	
		}
		
		StringBuilder sb = new StringBuilder();
		do {
			int mod = base10 % b2;
			switch (mod) {
			case 10:
				sb.append("A");
				break;
			case 11:
				sb.append("B");
				break;
			case 12:
				sb.append("C");
				break;
			case 13:
				sb.append("D");
				break;
			case 14:
				sb.append("E");
				break;
			case 15:
				sb.append("F");
				break;
			default:
				sb.append(mod);	
			}
			base10 /= b2;
		} while (base10 > 0);
		
		if (isNegative) sb.append("-");
		
		return sb.reverse().toString();		
	}
}
