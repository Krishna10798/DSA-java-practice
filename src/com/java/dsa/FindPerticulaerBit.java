package com.java.dsa;

public class FindPerticulaerBit {
public static void main(String[] args) {
	int num=100,i=2;
	System.out.println(findBit(num,i));
}
static int findBit(int n,int i) {
	i=(1<<(n-1));
	return n&(i);
	}
}
