package com.crajas.leetcode.august20;


public class MyHashSet {
	
	boolean isDebug = false;
	
	class Entry {
		Integer value;
		Entry next;
		public Entry(Integer value, Entry next) { this.value = value; this.next = next; }
		@Override
		public String toString() { return String.format("[%d]->%s", value, next); }
	}
	
	Entry[] keys;
	int entries = 0;
	int size = 11;
	
	public MyHashSet() {
		keys = new Entry[size];
	}

	public void add(int key) {
		int pos = this.findPos(key);
		if(!this.contains(key, pos)) {
			entries ++;
			if (entries * 2 > size) {
				this.resize();
				pos = this.findPos(key);
			}
			insert(key, pos);
		}
	}

	private void insert(int key, int pos) {
		Entry entry = keys[pos];
		if(entry == null) {
			entry = new Entry(key, null);
			keys[pos] = entry;
		} else {
			while(entry.next != null) entry = entry.next;
			entry.next = new Entry(key, null);
		}
	}
	
	protected void resize() {
		if(isDebug) System.out.println(this);
		if(isDebug) System.out.println("Resizing for " + size);
		int newSize = (int)(size * 1.5);
		newSize = findPrime(newSize);
		

		Entry[] oldKeys = keys;
		
		keys = new Entry[newSize];
		size = newSize;
		for(Entry e : oldKeys) {
			while(e != null) { int k = findPos(e.value); insert(e.value, k);  e = e.next; }
		}
	}

	public boolean contains(int key) {
		int i = findPos(key);
		if(isDebug) System.out.println(keys[i]);
		return contains(key, i);
	}
	
	public boolean contains(int key, int pos) {
		if(keys[pos] == null) {
			return false;
		} else {
			Entry e = keys[pos];
			while(e != null && e.value != key) e = e.next;
			return e != null;
		}
	}

	private int findPos(int key) {
		int i = key % size;
		if(isDebug) System.out.println(String.format("%d %% %d = %d", key, size, i));
		return i;
	}
	
	public void remove(int key) {
		int p = findPos(key);
		Entry e = keys[p];
		if(e != null) {
			if(e.value == key) {
				keys[p] = e.next;
			} else {
				while(e.next != null && e.next.value != key) e = e.next;
				if(e.next != null && e.next.value == key) {
					e.next = e.next.next;
				}
			}
		}
	}
	
	protected int findPrime(int newSize) {
		boolean isPrime = true;
		while(isPrime) {
			isPrime = true;
			for(int j = 2; j * j <= newSize; ++j) {
				if(newSize % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(!isPrime) {
				newSize ++;
				isPrime = true;
			} else {
				break;
			}
		}
		return newSize;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < keys.length; i++) {
			if(keys[i] != null) sb.append(i).append(":").append(keys[i]).append("; ");
		}
		return sb.toString();
	}
	
}
