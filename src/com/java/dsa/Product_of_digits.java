package com.java.dsa;

public class Product_of_digits {

	public static void main(String[] args) {
		System.out.println(product(34));

	}

	private static int product(int n) {
		if(n%10==n) {
			return n;
		}
		return product(n/10)*(n%10);
	}

}
