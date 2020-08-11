package com.crajas.fb.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConvertTernaryExpressionToBinaryTreeTest {

	private String[] T =  {
			"2\r\na?b?c:d:e\\r\\na?b:c"
	};
	
	ConvertTernaryExpressionToBinaryTree ctetbt = new ConvertTernaryExpressionToBinaryTree();
	
	@Test
	void test() {
		System.out.println(ctetbt.print("a?b:c"));
		System.out.println(ctetbt.print("a?b?c:d:e"));
		System.out.println(ctetbt.print("a?b?c:f?g:h:d"));
	}

}
