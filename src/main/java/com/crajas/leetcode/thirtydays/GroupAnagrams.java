package com.crajas.leetcode.thirtydays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	class Solution {

		private Map<Character, Integer> positions = new HashMap<>();

		public Solution() {
			positions = init(positions);
		}

		public List<List<String>> groupAnagrams(String[] strs) {
			Map<String, List<String>> map = new HashMap<String, List<String>>();
			for (String str : strs) {
				String hash = hash(str);
				List<String> list = map.get(hash);
				if (list == null) {
					list = new ArrayList<String>();
					map.put(hash, list);
				}
				list.add(str);
			}
			List<List<String>> ret = new ArrayList<List<String>>();
			ret.addAll(map.values());
			return ret;
		}

		public String hash(String s) {
			int[] counts = new int[26];
			for (char c : s.toCharArray()) {
				int x = positions.get(c) - 1;
				counts[x]++;
			}
			return Arrays.toString(counts);
		}

		public Map<Character, Integer> init(Map<Character, Integer> positions) {
			int i = 1;
			for (char c = 'a'; c <= 'z'; ++c) {
				positions.put(c, i);
				i++;
			}
			return positions;
		}

	}

}
