package com.java.dsa;

public class ReverseNum {
	public static void main(String[] args) {
		int n=123456;
		int res=0;
		while(n>0) {
			int rem=n%10;
			res=res*10+rem;
			n/=10;
		}
		System.out.println(res);
	}

}
