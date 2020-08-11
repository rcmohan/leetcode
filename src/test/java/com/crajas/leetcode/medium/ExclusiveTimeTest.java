package com.crajas.leetcode.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class ExclusiveTimeTest {

	ExclusiveTime.Solution s = new ExclusiveTime().new Solution();

	static int[] N = new int[] {2, 99};
	static String[][] LOGS = new String[][] {
		{"0:start:0","1:start:2","1:end:5","0:end:6"},
		{"0:start:0","1:start:3","2:start:4","3:start:9","4:start:14","5:start:19","6:start:21","7:start:22","8:start:26","9:start:31","10:start:35","11:start:36","12:start:40","13:start:44","14:start:46","15:start:49","16:start:52","17:start:57","18:start:59","19:start:60","20:start:62","21:start:64","22:start:66","23:start:71","24:start:76","25:start:81","26:start:82","27:start:87","28:start:91","29:start:94","30:start:95","31:start:100","32:start:102","33:start:106","34:start:111","35:start:112","36:start:117","37:start:120","38:start:122","39:start:123","40:start:124","41:start:127","42:start:128","43:start:130","44:start:131","45:start:134","46:start:136","47:start:139","48:start:141","49:start:145","50:start:146","51:start:150","52:start:153","53:start:154","54:start:156","55:start:159","56:start:162","57:start:165","58:start:170","59:start:172","60:start:174","61:start:176","62:start:179","63:start:180","64:start:183","65:start:185","66:start:189","67:start:194","68:start:198","69:start:203","70:start:206","71:start:209","72:start:212","73:start:215","74:start:217","75:start:219","76:start:222","77:start:225","78:start:230","79:start:235","80:start:240","81:start:243","82:start:247","83:start:248","84:start:252","85:start:255","86:start:256","87:start:257","88:start:260","89:start:263","90:start:265","91:start:270","92:start:271","93:start:276","94:start:279","95:start:281","96:start:285","97:start:288","98:start:292","94:start:302","94:end:303","25:start:304","56:start:308","6:start:311","63:start:314","63:start:319","63:end:324","88:start:328","88:end:333","63:end:337","22:start:339","22:end:342","80:start:343","36:start:348","36:end:352","6:start:356","8:start:360","8:end:361","6:end:362","37:start:365","3:start:370","3:end:374","37:end:379","80:end:383","76:start:385","76:end:390","6:end:394","56:end:399","30:start:401","30:end:405","58:start:409","58:end:412","25:end:416","98:end:418","97:end:421","96:end:423","95:end:425","94:end:429","93:end:432","91:start:437","91:end:439","75:start:443","75:end:444","92:end:449","44:start:450","44:end:452","91:end:453","90:end:455","86:start:459","86:end:461","89:end:463","88:end:467","1:start:469","1:end:473","87:end:478","86:end:480","22:start:484","22:end:488","85:end:492","84:end:496","83:end:497","82:end:502","52:start:506","3:start:507","3:end:509","57:start:513","57:end:517","52:end:521","41:start:525","41:end:529","81:end:531","80:end:532","18:start:536","37:start:541","60:start:544","60:end:545","37:end:546","18:end:551","79:end:553","78:end:556","77:end:560","51:start:563","51:end:567","76:end:569","75:end:571","97:start:576","97:end:578","74:end:583","73:end:586","35:start:589","35:end:592","72:end:593","71:end:596","70:end:601","97:start:606","97:end:611","69:end:613","68:end:615","9:start:617","9:end:618","67:end:622","66:end:624","65:end:625","64:end:629","63:end:633","62:end:634","54:start:639","52:start:642","52:end:644","28:start:649","28:end:650","54:end:651","61:end:654","60:end:659","29:start:662","29:end:666","59:end:671","66:start:675","66:end:676","58:end:677","57:end:682","16:start:683","27:start:688","27:end:693","16:end:695","79:start:700","79:end:703","52:start:705","52:end:709","56:end:712","55:end:713","54:end:714","53:end:717","52:end:720","51:end:722","50:end:726","49:end:730","87:start:731","11:start:733","11:end:735","87:end:740","59:start:744","59:end:746","48:end:750","78:start:755","78:end:758","47:end:761","46:end:763","45:end:767","44:end:769","65:start:771","65:end:775","43:end:778","35:start:781","95:start:783","53:start:788","53:end:793","16:start:796","55:start:801","55:end:805","16:end:810","95:end:815","35:end:817","52:start:819","15:start:820","43:start:822","43:end:825","15:end:828","52:end:831","42:end:835","47:start:836","47:end:839","41:end:840","43:start:843","43:end:846","91:start:850","91:end:852","40:end:855","76:start:858","76:end:861","39:end:864","38:end:869","37:end:872","36:end:876","86:start:881","86:end:884","77:start:886","64:start:887","55:start:890","55:end:891","64:end:895","77:end:896","35:end:898","34:end:899","14:start:903","14:end:907","33:end:910","32:end:913","31:end:918","30:end:922","81:start:925","81:end:926","29:end:931","17:start:935","56:start:936","56:end:940","37:start:945","37:end:946","17:end:950","69:start:954","69:end:959","28:end:963","27:end:967","55:start:972","83:start:976","83:end:981","55:end:983","26:end:987","25:end:992","24:end:995","23:end:998","22:end:1002","21:end:1006","20:end:1011","19:end:1016","18:end:1020","17:end:1023","16:end:1024","15:end:1025","8:start:1030","8:end:1032","14:end:1037","23:start:1039","23:end:1044","13:end:1046","70:start:1047","70:end:1050","12:end:1054","23:start:1057","28:start:1062","28:end:1064","23:end:1067","11:end:1068","10:end:1073","9:end:1075","8:end:1076","7:end:1078","6:end:1082","89:start:1083","89:end:1086","5:end:1090","4:end:1093","3:end:1097","47:start:1101","47:end:1106","2:end:1109","24:start:1114","24:end:1118","1:end:1119","83:start:1123","83:end:1126","0:end:1128"}
	};

	static int[][] A = new int[][] {
		{3, 4},
		{}
	};
	
	@Test
	void test() {
		for(int i = 0; i < N.length; ++i) {
			assertArrayEquals(A[i], s.exclusiveTime(N[i], Arrays.asList(LOGS[i])));
		}
	}

}
