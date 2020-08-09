package com.crajas.leetcode.august20;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyHashSetTest {

	MyHashSet mhs;
	
	@BeforeEach
	void init() {
		mhs = new MyHashSet();
	}
	
	@Test
	void testPrime() {
		assertEquals(13, mhs.findPrime(12));
		assertEquals(17, mhs.findPrime(16));
		assertEquals(29, mhs.findPrime(25));
		
	}
	
	String[] COMMAND = {"contains","remove","add","add","contains","remove","contains","contains","add","add","add","add","remove","add","add","add","add","add","add","add","add","add","add","contains","add","contains","add","add","contains","add","add","remove","add","add","add","add","add","contains","add","add","add","remove","contains","add","contains","add","add","add","add","add","contains","remove","remove","add","remove","contains","add","remove","add","add","add","add","contains","contains","add","remove","remove","remove","remove","add","add","contains","add","add","remove","add","add","add","add","add","add","add","add","remove","add","remove","remove","add","remove","add","remove","add","add","add","remove","remove","remove","add","contains","add"};
	Integer[] VALS = {72,91,48,41,96,87,48,49,84,82,24,7,56,87,81,55,19,40,68,23,80,53,76,93,95,95,67,31,80,62,73,97,33,28,62,81,57,40,11,89,28,97,86,20,5,77,52,57,88,20,48,42,86,49,62,53,43,98,32,15,42,50,19,32,67,84,60,8,85,43,59,65,40,81,55,56,54,59,78,53,0,24,7,53,33,69,86,7,1,16,58,61,34,53,84,21,58,25,45,3};

	@Test
	void testSpect() {
		for (int i = 0; i < COMMAND.length; i++) {
			if(COMMAND[i] == "contains") {
				mhs.contains(VALS[i]);
			} else if (COMMAND[i] == "add") {
				mhs.add(VALS[i]);
			} else if (COMMAND[i] == "remove") {
				System.out.println(mhs);
				System.out.println("Removing " + VALS[i]);
				mhs.remove(VALS[i]);
			} else {
				System.err.println(COMMAND[i]);
			}
		}
	}
	
	
	
	@Test
	void testMHS() {
		Random r = new Random();
		int max =  10000;
		Set<Integer> set = new HashSet<Integer>();
		for(int key = 0; key < max; key++) {
		  int nextInt = r.nextInt(10000);
		  mhs.add(nextInt);
		  set.add(nextInt);
		}
		System.out.println(mhs);
		for(Integer key : set) {
			assertTrue(mhs.contains(key));
		}

		for(Integer key : set) {
		  mhs.remove(key);
		}

		for(Integer key : set) {
		  assertFalse(mhs.contains(key));
		}
	}

	/**
	 * Your MyHashSet object will be instantiated and called as such:
	 * MyHashSet obj = new MyHashSet();
	 * obj.add(key);
	 * obj.remove(key);
	 * boolean param_3 = obj.contains(key);
	 */
}
