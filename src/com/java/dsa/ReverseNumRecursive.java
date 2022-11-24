package com.java.dsa;

public class ReverseNumRecursive {
	static int sum=0;
	private static void reverse1(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		sum=sum*10+rem;
		reverse1(n/10);
	}
	private static int reverse2(int n) {
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
public static void main(String[] args) {
	  reverse1(1234);
	  System.out.println(sum);
	  System.out.println(reverse2(1234));
	  
}

}