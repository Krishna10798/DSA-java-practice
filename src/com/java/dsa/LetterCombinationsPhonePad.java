package com.java.dsa;

import java.util.ArrayList;

public class LetterCombinationsPhonePad {
	public static void main(String[] args) {
   letterCombinations("", "12");
   System.out.println(letterCombinationsReturn("", "12"));
   System.out.println(letterCombinationsCount("", "12"));
	}
	static void letterCombinations(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		int digit=up.charAt(0)-'0';
		for (int i = (digit-1)*3; i < digit*3; i++) {
			char ch=(char)('a'+i);
			letterCombinations(p+ch, up.substring(1));
			
		}
	}
	static ArrayList<String> letterCombinationsReturn(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit=up.charAt(0)-'0';
		ArrayList<String> list=new ArrayList<>();
		for (int i = (digit-1)*3; i < digit*3; i++) {
			char ch=(char)('a'+i);
			list.addAll(letterCombinationsReturn(p+ch, up.substring(1)));
		}
		return list;
	}
	static int letterCombinationsCount(String p,String up) {
		if(up.isEmpty()) {
			return 1;
		}
		int count=0;
		int digit=up.charAt(0)-'0';
		for (int i = (digit-1)*3; i < digit*3; i++) {
			char ch=(char)('a'+i);
			count+=letterCombinationsCount(p+ch, up.substring(1));
		}
		return count;
	}
}
