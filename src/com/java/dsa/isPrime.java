package com.java.dsa;

import java.util.Iterator;

public class isPrime {

//	public static void main(String[] args) {
//		int num=36;
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i+" "+isPrime(i));
//
//		}
//	}
//
//	private static boolean isPrime(int num) {
//		if(num<=1) {
//			return false;
//		}
//		int c=2;
//		while(c*c<=num) {
//			if(num%c==0) {
//				return false;
//			}
//			c++;
//		}
//		return true;
//	}
	
	
	
	// lessComplexity=> O(N*log(log*N))//
	
	
	public static void main(String[] args) {
		int n=40;
		boolean[] primes=new boolean[n+1];
		sieve(n, primes);
	}
	static void sieve(int n,boolean[] primes) {
		for (int i = 2; i*i <= n; i++) {
			if(!primes[i]) {
				for (int j = i*2; j <=n; j+=i) {
					primes[j]=true;
					
				}
			}
		}
			for (int i = 2; i <= n; i++) {
				if(!primes[i]) {
					System.out.println(i+" ");
				}
				
			}
			
		
	}

}
