package com.java.dsa;

public class Armstrong {
public static void main(String[] args) {
	int n=370;
	int temp=n;
	int sum=0;
	while(n>0) {
		int rem=n%10;
		n/=10;
		int cube=rem*rem*rem;
		sum+=cube;
	}
	if(temp==sum) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
}
