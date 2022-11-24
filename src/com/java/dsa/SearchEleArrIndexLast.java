package com.java.dsa;

public class SearchEleArrIndexLast {
	public static void main(String[] args) {
		int[] arr= {3,2,4,6,5,7,88,5};
		int target=5;
		System.out.println(searchIndex(arr,target,arr.length-1));
	}

	private static int searchIndex(int[] arr,int target, int index) {
		if(index==-1) {
			return -1;
		}else if(arr[index]==target) {
			return index;
		}else {
		return searchIndex(arr, target, index-1);
		}
	}
}
