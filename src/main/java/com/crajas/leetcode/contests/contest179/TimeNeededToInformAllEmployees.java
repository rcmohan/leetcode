package com.crajas.leetcode.contests.contest179;

import java.util.ArrayList;
import java.util.List;

public class TimeNeededToInformAllEmployees {

	class Solution {
	    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

	    	Node[] nodes = new Node[n];

	    	for(int i = 0; i < n; ++i) {
	    		setNode(nodes, i, manager[i], informTime[i]);
	    	}
	    	
	    	Node root = nodes[headID];
	    	return count(nodes, root, informTime, 0);
	    	
	    }
	    

		private int count(Node[] nodes, Node root, int[] informTime, int sofar) {
			int forChildren = informTime[root.id] + sofar;
//			System.out.println(String.format("%d->: %d", root.id, sofar));
			int sum = sofar;
			for(Node c : root.children) {
				int l = count(nodes, c, informTime, forChildren);
				if(l > sum) sum = l;
			}
//			System.out.println(String.format("%d: <- %d", root.id, sum));
			return sum;
		}


		private void setNode(Node[] nodes, int i, int managerID, int depth) {
	    	Node node = createNode(nodes, i);
	    	if(managerID != -1) {
		    	Node parent = nodes[managerID];
		    	if(parent == null) {
		    		parent = createNode(nodes, managerID);
		    		nodes[managerID] = parent;
		    	}
	    		parent.children.add(node);
	    	}
		}


		private Node createNode(Node[] nodes, int i) {
			
			Node node = nodes[i];
			if(node == null) {
				node = new Node();
		    	node.id = i;
		    	node.children = new ArrayList<>();
		    	nodes[i] = node;
			}
			return node;
		}


		private class Node {
	    	int id; 
	    	List<Node> children;
	    	@Override
	    	public String toString() {
	    		StringBuilder s = new StringBuilder();
	    		for(Node c : children) s.append(c.id).append(";"); 
	    		return String.format("{%d:(%s)}", id, s);
	    	}
	    }
	}
}
