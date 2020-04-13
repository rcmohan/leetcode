package com.crajas.leetcode.thirtydays;

public class BestTimeToBuyAndSellStock2 {

	class Solution {

		public int maxProfit(int[] prices) {
//			int profit = 0;
//			for (int i = 0; i < prices.length - 1; i++) {
//				profit = Math.max(profit, profit + prices[i + 1] - prices[i]);
//			}
//			return profit;
//		}
//
//		public int maxProfits(int[] prices) {
//
			if (prices.length <= 1) {
				return 0;
			}

			int startprice = 0;
			int profit = 0;
			boolean holding = false;

			for (int i = 0; i < prices.length - 1; ++i) {
				if (prices[i] < prices[i + 1]) {
					if (!holding) {
						startprice = i;
						holding = true;
					}
				} else {
					if (holding) {
						profit += prices[i] - prices[startprice];
						holding = false;
					}
				}
			}
			if (holding) {
				profit += prices[prices.length - 1] - prices[startprice];
			}
			return profit;

		}

	}

}
