package com.crajas.leetcode.thirtydays;

import com.crajas.leetcode.TreeNode;

public class TreeDiameter {
	class Solution {
		class Vals {
			int ldepth, rdepth, max;
			public Vals(int a, int b, int c) { ldepth = a; rdepth = b; max = c; };
			@Override
			public String toString() { return String.format("[%d, %d, %d]", ldepth, rdepth, max);}
		}
	    public int diameterOfBinaryTree(TreeNode root) {
	    	Vals vals = new Vals(0,0,0);
	    	vals = deepest(root, vals);
	    	return vals.max;
	    }
	    
		private Vals deepest(TreeNode root, Vals vals) {
			if(root == null ) return vals;
			Vals leftval = null;
			Vals rightval = null;
			if(root.left != null) {
	    		leftval = deepest(root.left, vals);
	    	}
			if(root.right != null) {
	    		rightval = deepest(root.right, vals);
	    	}
			Vals v = new Vals(0, 0, 0);
			if(leftval != null) {
				v.ldepth = leftval.ldepth > leftval.rdepth ? leftval.ldepth + 1 : leftval.rdepth + 1;
				v.max = leftval.max;
			}
			if(rightval != null) {
				v.rdepth = rightval.ldepth > rightval.rdepth ? rightval.ldepth + 1 : rightval.rdepth + 1;
				if(v.max < rightval.max) v.max = rightval.max;
			}
			int depths = v.ldepth + v.rdepth;
			if(v.max < vals.max) v.max = vals.max;
			if(v.max < depths) v.max = depths;

			System.out.println(root.val + ":  " + v + "(in " + vals + ")");
			return v;
			
		}
	}
}
