package com.crajas.fb;

public class LookAndSay {
	
	public void lookAndSay(int i) {
		
		System.out.println(1);
		System.out.println(11);
		String s = "11";
		
		while(i-->0) {
			
			StringBuffer sb = new StringBuffer();
			int k = 0;
			Character lc = s.charAt(0);
			for (int k2 = 0; k2 < s.toCharArray().length; k2++) {
				char c = s.charAt(k2);
				if(c == lc) {
					k ++;
				} else {
					sb.append(k).append(lc);
					lc = c;
					k = 1;
				}
			}
			sb.append(k).append(lc);
			System.out.println(sb);
			s = sb.toString();
		}
	}

}
