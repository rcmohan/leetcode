package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;

import org.junit.jupiter.api.Test;

class BitwiseANDTest {

	BitwiseAND band = new BitwiseAND();
	BitwiseAND.Solution s = band.new Solution();
	
	@Test
	void test() {
		
		for(int i = 1; i < 1024; ++i) {
			int l = i;
			int m = i * i + 1;
//			Instant beg = Instant.now();
			int regular = band.rangeBitwiseAnd1(l, m);
//			Instant reg = Instant.now();
			int opt = s.rangeBitwiseAnd(l, m);
//			Instant end = Instant.now();
//			long regT = Duration.between(beg, reg).toNanos();
//			long optT = Duration.between(reg, end).toNanos();
			
//			if(regT > optT) {
//				System.out.println("\nRegular is slower at " + l + " and " + m);
//				break;
//			} else {
//				System.out.print(l + ",");
//			}
			
			assertEquals(regular, opt);
//			System.out.printf("%d, %d, %d", l, m, s.rangeBitwiseAnd(l, m));
			
//			assertEquals(regular, opt);
		}

		assertEquals(5, band.bitlength(16));
		assertEquals(7, band.bitlength(87));
		assertEquals(10, band.bitlength(1023));
		assertEquals(0, band.bitlength(0));
		assertEquals(1, band.bitlength(1));
	}

}
