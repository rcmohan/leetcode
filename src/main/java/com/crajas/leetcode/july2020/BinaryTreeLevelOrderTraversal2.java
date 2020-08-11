package com.crajas.leetcode.july2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.crajas.leetcode.TreeNode;

public class BinaryTreeLevelOrderTraversal2 {

	class Solution {
		
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {

	    	Map<Integer, List<TreeNode>> map = initialize(root);
	    	return toList(map);
	    	
	    }

		private List<List<Integer>> toList(Map<Integer, List<TreeNode>> map) {
			return null;
		}

		private Map<Integer, List<TreeNode>> initialize(TreeNode root) {
			
			Map<Integer, List<TreeNode>> map = new HashMap<Integer, List<TreeNode>>();
			
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			q.add(root);
			int depth = 0;
			while(q.size() > 0) {
				System.out.println(q);
				TreeNode t = null;
				depth ++;
				while(q.size() > 0 && (t = q.remove()) != null) {
					addToMap(map, depth, t);
				}
				q.addAll(map.get(depth));
			}
			return map;
			
		}

		private void addToMap(Map<Integer, List<TreeNode>> map, int depth, TreeNode t) {
			List<TreeNode> l = map.get(depth);
			
			if(l == null) {
				l = new ArrayList<>();
			}
			
			l.add(t);
			
		}
	}
	
}
