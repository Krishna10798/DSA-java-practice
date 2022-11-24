package com.java.dsa;

public class CountZeros {
public static void main(String[] args) {
	System.out.println(check0(1206703,0));
}

private static int check0(int n,int count) {
	if(n==0) {
		return count;
	}
	if(n%10==0) {
		return check0(n/10, count+1);
	}
	return check0(n/10, count);
	
}
}
