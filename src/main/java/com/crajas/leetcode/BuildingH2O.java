package com.crajas.leetcode;

import java.util.concurrent.Semaphore;

public class BuildingH2O {

	class H2O {
	    
	    private Semaphore hydrogensem = new Semaphore(0, false);    
	    private Semaphore oxygensem = new Semaphore(0, false);    
	    public H2O() {
	        
	    }

	    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

	        hydrogensem.release();
	        oxygensem.acquire();
	        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
	        releaseHydrogen.run();
	        
	    }

	    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

	        hydrogensem.acquire(2);
	        
	        // releaseOxygen.run() outputs "O". Do not change or remove this line.
			releaseOxygen.run();
	        oxygensem.release(2);
	    }
	}
}
