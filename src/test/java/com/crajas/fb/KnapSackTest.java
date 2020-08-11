package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KnapSackTest {

	static int WS[][] = {
			{1,2,5,6,7}
	};
	static int VS[][] = {
			{1, 6, 18, 22, 28}
	};
	
	static int TS[] = {
			15
	};
	
	static int A[] = {
			57
	};
	
	KnapSack ks = new KnapSack();
	
	@Test
	void test() {
		for (int i = 0; i < VS.length; i++) {
			assertEquals(A[i], ks.solve(WS[i], VS[i], TS[i]));
		}
		
	}

}
