package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GroupAnagramsTest {
	
	GroupAnagrams.Solution s = new GroupAnagrams().new Solution();

	@Test
	void testHashcode() {
		assertEquals(s.hash("agcadsfa"), s.hash("caagfads"));
	}
	
	
	private static String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
	
	private static String[] strs2 = {"tin","ram","zip","cry","pus","jon","zip","pyx"};
	

	@Test
	void testAnas() {
		List<List<String>> val = s.groupAnagrams(strs);
		assertEquals(3, val.size());
		
		val = s.groupAnagrams(strs2);
		assertEquals(7, val.size());
	}
}
