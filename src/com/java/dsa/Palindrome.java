package com.java.dsa;

public class Palindrome {
	private static int reverse(int n) {
		int digit=(int)(Math.log10(n))+1;
		return healper(n,digit);
	}
  private static int healper(int n, int digit) {
		if(n%10==n) {
		   return n;
		}
		int rem=n%10;
		return rem*(int)(Math.pow(10, digit-1))+healper(n/10, digit-1);
	}
  private static Boolean palindrome1(int n) {
	  return n==reverse(n);
  }
  
  

public static void main(String[] args) {
	  System.out.println(palindrome1(1234321));
}
}
