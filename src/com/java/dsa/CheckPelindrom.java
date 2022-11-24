package com.java.dsa;

public class CheckPelindrom {
	public static void main(String[] args) {
		System.out.println(checkP("abba"));
		
	}
	static boolean checkP(String str) {
		int i = 0,j=str.length();
		while(i<j/2) {
			if(str.charAt(i)==str.charAt(j-1)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
		
	}

}
