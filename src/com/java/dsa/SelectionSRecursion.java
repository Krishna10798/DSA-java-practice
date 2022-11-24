package com.java.dsa;

import java.util.Arrays;

public class SelectionSRecursion {
	public static void main(String[] args) {
		int[] arr= {2,3,4,6,3,7,6,5};
		selection(arr, arr.length, 0,0);
		System.out.println(Arrays.toString(arr));
	}
	private static void selection(int[] arr,int row, int col,int max) {
		 if(row==0)	{
			 return;
		 }
		 if(col<row) {
		 if(arr[col]>arr[max]) {
			 selection(arr, row, col+1, col);
		 }else {
			 selection(arr, row, col+1, max);
		 }
		 }else {
			 int temp=arr[max];
			 arr[max]=arr[row-1]; 
			 arr[row-1]=temp;
			 selection(arr, row-1, 0, 0);
		 }
		}

}
