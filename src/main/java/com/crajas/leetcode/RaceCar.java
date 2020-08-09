package com.crajas.leetcode;

public class RaceCar {

	class Solution {

		private int[] W = new int[] { 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383 };


		public int racecar(int target) {

			int steps = 0;
			
			while (target > 0 && steps < 100) {
				int i = 0;
				while (target >= W[i]) {
					steps ++;
					++i;
				}
				if(target - W[i] == -1) {
					steps ++;
//					System.out.printf("Reverse is quicker:  target: %d, W[i]; %d, W[i+1]: %d, i:%d, steps: %d\n", target, W[i], W[i+1], i, steps);
					return steps + 2;
				}
				
				if(target - W[i] == -2) {
					steps ++;
//					System.out.printf("Reverse 2 is quicker:  target: %d, W[i]; %d, W[i+1]: %d, i:%d, steps: %d\n", target, W[i], W[i+1], i, steps);
					return steps + 4;
				}
				
				i--;
//				System.out.printf("target: %d, W[i]; %d, W[i+1]: %d, steps: %d\n", target, W[i], W[i+1], steps);
				
				if(target == W[i]) return steps;
				target -= W[i];
				
				steps += 2;
//				System.out.printf("Target: %d, Used: %d, Steps: %d\n", target, W[i], steps);
			}
			
			return steps;
		}

	}

}
