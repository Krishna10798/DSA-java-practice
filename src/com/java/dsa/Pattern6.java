package com.java.dsa;

public class Pattern6 {

	public static void main(String[] args) {
    pattern6(5);
	}
  static void pattern6(int n) {
	  for (int row = 1; row <= 2*n; row++) {
		  int star=row>n ? 2*n-row : row;
		  int space=n-star;
		  for (int s = 1; s <= space; s++) {
			  System.out.print(" ");
		}
		  for (int col = 1; col <= star; col++) {
			  System.out.print("* ");
		  }
		  System.out.println();

		  }
		
	}
  }

