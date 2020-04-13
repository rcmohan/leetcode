package com.crajas.leetcode.thirtydays;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	class Solution {
		public boolean isHappy(int n) {

			Set<Integer> list = new HashSet<>();
			boolean isDecided = false;
			boolean isHappy = false;
			int n1 = n;
			while (!isDecided) {
				n1 = digitAdd(n1);
//				System.out.println(n1); try { Thread.sleep(1000); } catch (Exception e) { }
				if (n1 != 1) {
					if (!list.contains(n1)) {
						list.add(n1);
					} else {
						isDecided = true;
						isHappy = false;
					}

				} else {
					isDecided = true;
					isHappy = true;
				}
			}
			return isHappy;
		}

		private int digitAdd(int n) {
			int sum = 0;
			while (n > 0) {
				int dig = n % 10;
				n = n / 10;
				sum += dig * dig;
			}
			return sum;
		}
	}
}
