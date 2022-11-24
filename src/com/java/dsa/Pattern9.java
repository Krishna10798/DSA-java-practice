package com.java.dsa;

public class Pattern9 {

	public static void main(String[] args) {
    pattern9(5);
	}
  static void pattern9(int n) {
	  
	  int originalN=n;
	  n=2*n;
	  for (int row = 1; row < n; row++) {
			  for (int col = 1; col <= n-1 ; col++){
				  int num=col==row && n-row==n-col ? 1 : originalN-Math.min(Math.min(row, col), Math.min(n-row, n-col));
				  System.out.print(num);
			  }
		  System.out.println();

		  }
		
	}
  }

