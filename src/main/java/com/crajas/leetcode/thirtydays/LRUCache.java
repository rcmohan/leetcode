package com.crajas.leetcode.thirtydays;

public class LRUCache {

	int[] cache;
	int beginkey;
	int beginindex;
	
    public LRUCache(int capacity) {
        this.cache = new int[capacity];
    }
    
    public int get(int key) {
    	int val = -1;
        int pos = key - beginkey;
        if(pos <= cache.length) {
        	pos = (beginindex + pos) % cache.length;
        	val = cache[pos];
        }
        return val;
    }
    
    public void put(int key, int value) {
    	
    }
}

