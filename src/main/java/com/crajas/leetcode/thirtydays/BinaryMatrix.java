package com.crajas.leetcode.thirtydays;

import java.util.List;

public interface BinaryMatrix {

	List<Integer> dimensions();

	int get(int i, int j);

	void set(int[][] x);
}
