package com.crajas.fb;

public class SpiralPrint {

	public int[][] spiral(int n) {
		int[][] arr = new int[n][];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= new int[n];
		}
		
		int l = 0;
		int t = 1;
		int r = n - 1;
		int b = n - 1;
		int x = 0;
		int y = 0;
		int d = 0;
		for(int i = 0; i < n * n; ++i) {
			arr[y][x] = i + 1;
			switch(d) {
			case 0: if(x < r) x ++; else { d ++; y ++; r --; } break;
			case 1: if(y < b) y ++; else { d ++; x --; b --; } break;
			case 2: if(x > l) x --; else { d ++; y --; l ++; } break;
			case 3: if(y > t) y --; else { d = 0; x ++; t ++; } break;
			}
			System.out.printf("[%d, %d] = %d  - limits: [%d-%d][%d-%d]\n", x, y, i, l, r, t, b);
		}
		
		return arr;
	}
}
