package com.java.dsa;

public class Pattern4 {

	public static void main(String[] args) {
    pattern4(4);
	}
  static void pattern4(int n) {
	  for (int row = 1; row <= n; row++) {
		  int col = 1, num=col;
		  for (; col <= row; col++) {
			  System.out.print(num);
			  num++;
		}
		  System.out.println();
		
	}
  }
}
