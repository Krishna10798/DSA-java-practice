package com.java.dsa;

public class CountNum {
	public static void main(String[] args) {
		int n=74237377;
		int count=0;
		while(n>0) {
			int lastDig=n%10;
			if(lastDig==7) {
				count++;
			}
			n/=10;
		}
		System.out.println(count);
	}

}
