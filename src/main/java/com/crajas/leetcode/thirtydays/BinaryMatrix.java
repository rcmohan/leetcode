package com.crajas.leetcode.thirtydays;

import java.util.List;

public interface BinaryMatrix {
	
	public int get(int x, int y);
	public List<Integer> dimensions();
	void set(int[][] x);
}
