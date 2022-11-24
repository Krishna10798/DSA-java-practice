package com.java.dsa;

public class PowerA_B {
public static void main(String[] args) {
	int base=3,power=3,ans=1;
	while(power>0) {
		if((power & 1)==1) {
			ans*=base;
		}
		base*=base;
		power=power>>1;
	}
	System.out.println(ans);
}
}
