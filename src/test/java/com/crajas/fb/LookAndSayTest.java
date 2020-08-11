package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LookAndSayTest {

	LookAndSay las = new LookAndSay();
	
	@Test
	void test() {
		las.lookAndSay(10);
	}

}
