package com.crajas.leetcode;

import java.util.Arrays;

public class StringToInteger_atof {

	class Solution {
		public int myAtoi(String str) {
			if(str == null || str.length() == 0 || str.trim().length() == 0) return 0;
			str = filter(str);
			str = limitCheck(str);
			switch(str) {
			case " 0": return 0;
			case " N": return Integer.MIN_VALUE;
			case " X": return Integer.MAX_VALUE;
			}
			String[] parts = toParts(str);
			switch (parts.length) {
			case 1:
				return Integer.parseInt(parts[0]);
			case 2:
				int exp = 1;
				if (str.contains("e")) {
					exp = toExponent(parts[1]);
				}
				return parts[0].equals("-") ? 0 : Integer.parseInt(parts[0]) * exp;
			case 3:
				int dec = Integer.parseInt(parts[0]);
				int sign = (dec == 0 && parts[0].indexOf('-') >= 0) ? -1 : 1;
				int frac = Integer.parseInt(parts[1]);
				double d = Double.parseDouble(String.format("%d.%d", dec, frac));
				System.out.printf("str = %s: parts = %s: dec = %d, frac = %d, d = %g\n", str, Arrays.toString(parts), dec, frac, d);
				d = d * toExponent(parts[2]) * sign;
				return (int) d;
			}
			throw new RuntimeException(str);
		}

		public String limitCheck(String str) {
			if("0".equals(str)) {
				return " 0";
			}
			// MAXINT = 2147483647 MIN_INT = -2147483648
			String s = str.split("\\.|e")[0];
			if(s == null || s.length() == 0 || !s.matches("(\\+|\\-)?[0-9]+")) return "0";
			s = s.length() > 1 ? removeLeadingZeroes(s) : s;
			int maxlength = "2147483647".length();
			if(s.charAt(0) == '-' || s.charAt(0) == '+') maxlength ++;
			if(s.length() > maxlength) {
				return s.charAt(0) == '-' ? " N" : " X";
			} else {
				if(s != null && s.length() > 0 && !s.equals("-")) {
					long l = Long.parseLong(s);
					if(l > Integer.MAX_VALUE) return " X";
					if(l < Integer.MIN_VALUE) return " N";
				}
			}
			return str;
		}

		public String removeLeadingZeroes(String str) {
			int i = 0;
			String prefix = "";
			if(str.charAt(0) == '-') {
				prefix += str.charAt(0);
				i++;
			}
			while(str.charAt(i) == '0' && i < str.length() - 1) i ++;
			return i < str.length() ? prefix + str.substring(i, str.length()) :  prefix + "0";
		}

		public String filter(String str) {
			int i = 0;
			str = str.trim();
			boolean efound = false;
			boolean dotfound = false;
			int start = 0;
			String prefix = "";
			if(str.charAt(0) == '-' || str.charAt(0) == '+') {
				prefix += str.charAt(0);
				i++;
				start++;
			}
			while(i < str.length()) { 
				if(Character.isDigit(str.charAt(i))) {
					i ++;
				} else if(str.charAt(i) == 'e') {
					if(efound) return "0";
					i ++; efound = true;
				} else if(str.charAt(i) == '.') {
					if(dotfound)  return "0";
					i ++; dotfound = true;
				} else {
					break;
				}
			}
			if(prefix.length() == 1 && i == 1) {
				return "0";
			}
			str = prefix + str.substring(start, i);
			if (str.matches("(\\+|\\-)?[0-9\\.]+e[0-9]+|"
									+ "(\\+|\\-)?[0-9\\.]+")) {
				return str;
			} else
				return "0";
		}

		public String[] toParts(String str) {
			return str.split("\\.|e");
		}

		public int toExponent(String string) {
			int x = Integer.parseInt(string);
			int y = 1;
			while (x > 0) {
				y = y * 10;
				x--;
			}
			return y;
		}
	}

}
