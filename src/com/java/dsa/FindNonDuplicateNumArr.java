package com.java.dsa;

public class FindNonDuplicateNumArr {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,4,3,2};
   System.out.println(nonDup(arr));
	}
	static int nonDup(int[] arr) {
		int num=0;
		for (int i = 0; i < arr.length; i++) {
			num=num^arr[i];
		}
		return num;
	}
}
