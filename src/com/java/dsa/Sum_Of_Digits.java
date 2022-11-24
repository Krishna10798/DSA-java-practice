package com.java.dsa;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		System.out.println(sumDig(613452));
	}
	private static int sumDig(int n) {
		if(n==0) {
			return 0;
		}
		return sumDig(n/10)+(n%10);
	}
}
