package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class SubstringConcatTest {

	int [][] ans = {
			{},
			{ 0, 9 },
			{ 8 },
			{},
			{}
	};
	
	
	
	final String[][] tcs = {
			{""},
			{"foo","bar"},
			{"word","good","best","good"},
			{"word","good","best","word"},
			{"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"}
	};
	
	final String[] strs = {
			"",
			"barfoothefoobarman",
			"wordgoodgoodgoodbestword",
			"wordgoodgoodgoodbestword",
			"pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuunmqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktnwrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauampdpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesctufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvubnhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbikbkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtcvxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzshoyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjxountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefg"
			

	};
	
	SubstringConcat.Solution s = new SubstringConcat().new Solution();
	
	@Test
	void test() {
		int tcindex = strs.length;
		while(tcindex-- > 0)
		assertLists(Arrays.stream(ans[tcindex]).boxed().collect(Collectors.toList()), s.findSubstring(strs[tcindex], tcs[tcindex]));
	}

	private void assertLists(List<Integer> expected, List<Integer> actual) {
		assertNotNull(actual);
		int j = actual.size();
		int i = expected.size();
		assertEquals(j, i);
		Iterator<Integer> aitr = actual.iterator();
		Iterator<Integer> eitr = expected.iterator();
		while(aitr.hasNext()) {
			assertEquals(eitr.next(), aitr.next());
		}
		
	}
}
