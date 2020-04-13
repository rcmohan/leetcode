package com.crajas.leetcode;

public class StringToInteger_atoi {

	class Solution {
		public int myAtoi(String str) {
			if(str == null || str.length() == 0 || str.trim().length() == 0) return 0;
			str = filter(str);
			str = limitCheck(str);
			switch(str) {
			case " 0": return 0;
			case " N": return Integer.MIN_VALUE;
			case " X": return Integer.MAX_VALUE;
			default:
				return Integer.parseInt(str);
			}
		}

		public String limitCheck(String str) {
			if("0".equals(str)) {
				return " 0";
			}
			String s = str.split("\\.|e")[0];
			if(s == null || s.length() == 0 || !s.matches("(\\+|\\-)?[0-9]+")) return "0";
			s = s.length() > 1 ? removeLeadingZeroes(s) : s;
			int MAX_LENGTH = String.valueOf(Integer.MAX_VALUE).length();
			if(s.charAt(0) == '-' || s.charAt(0) == '+') MAX_LENGTH ++;
			if(s.length() > MAX_LENGTH) {
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
				} else {
					break;
				}
			}
			if(prefix.length() == 1 && i == 1) {
				return "0";
			}
			str = prefix + str.substring(start, i);
			if (str.matches("(\\+|\\-)?[0-9\\.]+")) {
				return str;
			} else
				return "0";
		}

	}

}
