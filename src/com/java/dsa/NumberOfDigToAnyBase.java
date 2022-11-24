package com.java.dsa;

public class NumberOfDigToAnyBase {
public static void main(String[] args) {
	int n=7;
	int base=2;
	System.out.println((int)(Math.log(n)/Math.log(base))+1);
}
}
