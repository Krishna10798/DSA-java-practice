package com.java.dsa;

import java.util.ArrayList;

public class SubSequenceRecursion {
	public static void main(String[] args) {
//		subseq("","abc");
		System.out.println(subseqReturn("", "abc"));
//		subseqAscii("", "abc");
		System.out.println(subseqAsciiReturn("", "abc"));

	}
	static void subseq(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		subseq(p+ch,up.substring(1));
		subseq(p,up.substring(1));
	}
	
	static ArrayList<String> subseqReturn(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> left=subseqReturn(p+ch,up.substring(1));
		ArrayList<String> right=subseqReturn(p,up.substring(1));
		left.addAll(right);
		return left;
		
	}
	
	static void subseqAscii(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		subseq(p+ch,up.substring(1));
		subseq(p,up.substring(1));
		subseq(p+(ch+0),up.substring(1));
	}
	
	static ArrayList<String> subseqAsciiReturn(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> first=subseqAsciiReturn(p+ch,up.substring(1));
		ArrayList<String> second=subseqAsciiReturn(p,up.substring(1));
		ArrayList<String> third=subseqAsciiReturn(p+(ch+0),up.substring(1));
		first.addAll(second);
		second.addAll(third);
		return first;
		
	}


}
