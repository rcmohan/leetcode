package com.crajas.fb.interview;

import java.util.Stack;


public class ConvertTernaryExpressionToBinaryTree {

	class Node {
		String var;
		Node left, right; @Override
		public String toString() {
			return var; // + " " + (left != null ? left.toString() : "x") + " " + (right != null ? right.toString() : "x");
		}
	}
	
	public Node teTobt(String exp) {
		System.out.println(exp);
		Node root = new Node();
		
		Stack<Node> stk = new Stack<>();
		Stack<String> toks = new Stack<>();
		
		StringBuilder var = new StringBuilder();
		
		for(char c: exp.toCharArray()) {
			
			switch(c) {
			case '?':
				toks.push(var.toString());
				toks.push("?");
				var = new StringBuilder();
				break;
			case ':':
				toks.push(var.toString());
				toks.push(":");
				var = new StringBuilder();
				break;
			default:
				var.append(c);
			}
		}
		
		toks.push(var.toString());
		
		while(!toks.isEmpty()) {
			String x = toks.pop();
			if(x == "?") {
				Node l = stk.pop();
				Node r = stk.pop();
				x = toks.pop();
				Node p = new Node();
				p.var = x;
				p.left = l;
				p.right = r;
				stk.push(p);
			} else if(!":".equals(x)){
				Node nd = new Node();
				nd.var = x;
				stk.push(nd);
			}
		}
		root = stk.pop();
		return root;
	}

	private void compress(Stack<Node> stk) {
		Node r = stk.pop();
		Node l = stk.pop();
		Node par = stk.pop();
		par.left = l;
		par.right = r;
		stk.push(par);
	}

	public String print(String string) {
		Node t = this.teTobt(string);
		return preorder(t);
	}

	private String preorder(Node t) {
		StringBuilder s = new StringBuilder();
		s.append(t.var).append(" ");
		if(t.left != null) s.append(preorder(t.left));
		if(t.right != null) s.append(preorder(t.right));
		return s.toString();
		
	}
}
