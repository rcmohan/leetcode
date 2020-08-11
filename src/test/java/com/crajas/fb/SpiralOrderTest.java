package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.crajas.fb.SpiralPrint;

class SpiralOrderTest {

	SpiralPrint sp = new SpiralPrint();
	
	@Test
	void test() {
		print2D(sp.spiral(5));
		
	}

	private void print2D(int[][] spiral) {
		
		for(int i = 0; i < spiral.length; ++i) {
			System.out.println(Arrays.toString(spiral[i]));
		}
		
	}

}
