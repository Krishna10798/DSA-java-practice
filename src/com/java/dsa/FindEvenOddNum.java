package com.java.dsa;

public class FindEvenOddNum {

	public static void main(String[] args) {
   int n=123;
   System.out.println(isEven(n));
	}
	static boolean isEven(int n) {
		return (n & 1)!=1;
	}

}
