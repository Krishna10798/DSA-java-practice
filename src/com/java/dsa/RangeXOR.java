package com.java.dsa;

public class RangeXOR {
	
	public static void main(String[] args) {
		int a=3;
		int b=9;
		int ans=xorR(b)^xorR(a-1);
		System.out.println(ans);
	}

	private static int xorR(int a) {
		if(a%4==0) {
			return a;
		}else if(a%4==1) {
			return 1;
		}else if(a%4==2) {
			return a+1;
		}
		return 0;
	}

}
