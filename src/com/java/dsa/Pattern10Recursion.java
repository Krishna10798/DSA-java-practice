package com.java.dsa;

public class Pattern10Recursion {
public static void main(String[] args) {
	int row=4,col=0;
	trianglePattern(row,col);
	trianglePattern2(row,col);
}

private static void trianglePattern(int row, int col) {
 if(row==0)	{
	 return;
 }
 if(col<row) {
	 System.out.print("*");
	 trianglePattern(row, col+1);
 }else {
	 System.out.println();
	 trianglePattern(row-1, 0);
 }
}
private static void trianglePattern2(int row, int col) {
	 if(row==0)	{
		 return;
	 }
	 if(col<row) {
		 trianglePattern2(row, col+1);
		 System.out.print("*");
	 }else {
		 trianglePattern2(row-1, 0);
		 System.out.println();

	 }
	}
}
