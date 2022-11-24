package com.java.dsa;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// Using normal looping
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int count=2;
		while(count<=n) {
			int temp=b;
			b+=a;
			a=temp;
			count++;
		}
		System.out.println(b);
		//     System.out.println(fibo(n));


	}
	// using recursion
	static int fibo(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);

	}

}
