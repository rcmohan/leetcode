package com.crajas.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

import org.junit.jupiter.api.Test;

public class ReaderWriterTest {

	@Test
	public void test1() {
		
		List<Integer> lists = new ArrayList<>();

		Thread t1 = new Thread(new Reader(lists, 3));
		Thread t2 = new Thread(new Writer(lists, 6));
		t1.start();
		t2.start();
		System.out.println("Threads started");
		try {t1.join();} catch(Exception e) {}
		try {t2.join();} catch(Exception e) {}
	}
	
	private Random r = new Random();
	private Semaphore s = new Semaphore(0);
	
	
	class Reader implements Runnable {

		private List<Integer> list;
		private int count;
		public Reader(List<Integer> name, int count) {
			this.list = name;
			this.count = count;
		}
		
		@Override
		public void run() {
			while(this.count-- > 0) {
				try {
					System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getName() + ":" +"is waiting to acquire:" + s.availablePermits());
					s.acquire(2);
					System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getName() + ":" +"After acquire:" + s.availablePermits());
					list.remove(0);
					list.remove(0);
				} catch (InterruptedException e) {
				}
			}
		}
	}

	class Writer implements Runnable {

		private List<Integer> list;
		private int count;
		public Writer(List<Integer> name, int count) {
			this.list = name;
			this.count = count;
		}
		
		@Override
		public void run() {
			while(this.count-- > 0) {
				if(Thread.currentThread().getId() % 2 == 0) {
					try { Thread.sleep(2000); } catch(Exception e) {}
					list.add(count);
					System.out.println(this.getClass().getSimpleName() + ":" + Thread.currentThread().getName() + ":" +"is releasing:" + s.availablePermits());
					s.release();
				}
				System.out.println(Thread.currentThread().getName() + ":" + list);
			}
		}
	}
}
