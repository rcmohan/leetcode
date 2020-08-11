package com.crajas.fb.interview;

public class Fibonacci {

	public void fib() {
		
		long pt = 1;
		long ct = 1;

		int count = 0;
		while(ct > 0) {
			long nt = ct + pt;
			pt = ct;
			ct = nt;
			System.out.println(ct);
			count ++;
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {
		new Fibonacci().fib();
	}
	
}
