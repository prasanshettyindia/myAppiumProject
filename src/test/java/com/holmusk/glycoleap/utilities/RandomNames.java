package com.holmusk.glycoleap.utilities;

import java.util.Random;

public class RandomNames {

	public static String randomNames(){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        return output;
		
	}
}
