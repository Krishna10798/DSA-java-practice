package com.java.dsa;

public class ArraySorted {
	public static void main(String[] args) {
		int[] arr= {2,3,33,5,6,7,88,99};
		System.out.println(isSorted(arr,0));
	}
	private static boolean isSorted(int[] arr, int index) {
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1] && isSorted(arr, index+1);
	}
}
