package com.crajas.fb.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MergeSequencesTest {

	MergeSequences.Solution s = new MergeSequences().new Solution();
	
	
	@Test
	void test() {
		ArrayList<Interval> t = s.insert(toList(Arrays.asList(new Interval(6037774, 6198243), new Interval(6726550, 7004541), new Interval(8842554, 10866536), new Interval(11027721, 11341296), new Interval(11972532, 14746848), new Interval(16374805, 16706396), new Interval(17557262, 20518214), new Interval(22139780, 22379559), new Interval(27212352, 28404611), new Interval(28921768, 29621583), new Interval(29823256, 32060921), new Interval(33950165, 36418956), new Interval(37225039, 37785557), new Interval(40087908, 41184444), new Interval(41922814, 45297414), new Interval(48142402, 48244133), new Interval(48622983, 50443163), new Interval(50898369, 55612831), new Interval(57030757, 58120901), new Interval(59772759, 59943999), new Interval(61141939, 64859907), new Interval(65277782, 65296274), new Interval(67497842, 68386607), new Interval(70414085, 73339545), new Interval(73896106, 75605861), new Interval(79672668, 84539434), new Interval(84821550, 86558001), new Interval(91116470, 92198054), new Interval(96147808, 98979097))), new Interval(36210193, 61984219));
		assertArraysEquals( Arrays.asList(new Interval(6037774, 6198243), new Interval(6726550, 7004541), new Interval(8842554, 10866536), new Interval(11027721, 11341296), new Interval(11972532, 14746848), new Interval(16374805, 16706396), new Interval(17557262, 20518214), new Interval(22139780, 22379559), new Interval(27212352, 28404611), new Interval(28921768, 29621583), new Interval(29823256, 32060921), new Interval(33950165, 64859907), new Interval(65277782, 65296274), new Interval(67497842, 68386607), new Interval(70414085, 73339545), new Interval(73896106, 75605861), new Interval(79672668, 84539434), new Interval(84821550, 86558001), new Interval(91116470, 92198054), new Interval(96147808, 98979097)), t);
		t = s.insert(toList(Arrays.asList(new Interval(2141136, 6363582), new Interval(49844342, 69670172), new Interval(75717793, 86352601))), new Interval(72706854, 87016111)); 
		assertArraysEquals( Arrays.asList(new Interval(2141136, 6363582), new Interval(49844342, 69670172)), t);
		
	}


	private ArrayList<Interval> toList(List<Interval> l) {
		ArrayList<Interval> ret = new ArrayList<Interval>();
		ret.addAll(l);
		return ret;
		
	}


	private void assertArraysEquals(List<Interval> t, ArrayList<Interval> lst) {
		
		System.out.println("Comparing \n" + t + "\nwith\n" + lst);
		
		for (int i = 0; i < t.size(); i++) {
			Interval l = t.get(i);
			Interval r = lst.get(i);
			
			if(l.start != r.start || l.end != r.end) {
				System.err.println("Mismatch: " + l + " != " + r);
			}
			
		}
	}

}
