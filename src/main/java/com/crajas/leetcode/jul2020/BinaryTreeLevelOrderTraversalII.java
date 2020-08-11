package com.crajas.leetcode.jul2020;

import java.util.ArrayList;
import java.util.List;

import com.crajas.leetcode.TreeNode;

public class BinaryTreeLevelOrderTraversalII {

	class Solution {
	    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	        List<List<Integer>> nodes = new ArrayList<>();
	        
	        if(root != null) {
		        List<List<TreeNode>> lists = new ArrayList<>();
		        List<TreeNode> last = new ArrayList<>();
		        last.add(root);
		        lists.add(last);
	
		        populate(lists, nodes);
	        }
	        
	        return reverse(nodes);
	    }

		private List<List<Integer>> reverse(List<List<Integer>> nodes) {
			List<List<Integer>> ret = new ArrayList<>();
			for(int i = nodes.size() - 1; i >= 0; --i) {
				ret.add(nodes.get(i));
			}
			return ret;
		}

		private void populate(List<List<TreeNode>> qs, List<List<Integer>> ret) {
			List<TreeNode> r = null;
			do {
				List<Integer> l = new ArrayList<>();
				List<TreeNode> q = qs.get(qs.size() - 1);
				r = new ArrayList<TreeNode>(); 
				for(TreeNode tn : q) {
					if(tn.left != null) r.add(tn.left);
					if(tn.right != null) r.add(tn.right);
					l.add(tn.val);
				}
				qs.add(r);
				ret.add(l);
			} while(r != null && r.size() > 0);
		}
	}
}
