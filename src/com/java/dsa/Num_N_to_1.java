package com.java.dsa;

public class Num_N_to_1 {
	public static void main(String[] args) {
//      System.out.println(nToOne(7));
//      nToOneReverse(7);
		nToOneBothAboveSol(7);
	}

	private static int nToOne(int n) {
		if(n==1) {
			return 1;
		}
		System.out.println(n);
		return nToOne(n-1);
		
	}
	private static void nToOneReverse(int n) {
		if(n==0) {
			return;
		}
		nToOneReverse(n-1);
		System.out.println(n);
	}
	private static void nToOneBothAboveSol(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		nToOneBothAboveSol(n-1);
		System.out.println(n);
	}
}
