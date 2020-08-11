package com.crajas.fb.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LargestHistogramArea {

	int largestArea(Integer[] hs) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		List<Integer> lst = new ArrayList<>();
		lst.addAll(Arrays.asList(hs));
		lst.add(0);
		
		for (int i = 0; i < lst.size(); i++) {
			if(!st.empty()) {
				System.out.println(String.format("%d, %d : %d, %d", i, st.peek(), lst.get(i), lst.get(st.peek())));
			} else {
				System.out.println(i + " : " +  lst.get(i) + ": Empty stack");
			}
			while(!st.empty() && lst.get(st.peek()) > lst.get(i)) {
				int top = lst.get(st.pop());
				int ran = st.empty() ? -1 : st.peek();
				ans = Math.max(ans,  top * (i - ran - 1));
				System.out.println(String.format("Top = %d, ran = %d, ans = %d", top, ran, ans));
			}
			st.push(i);
			System.out.println(st);
			System.out.println();
		}
		return ans;
		
	}
}
