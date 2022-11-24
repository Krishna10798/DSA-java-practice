package com.java.dsa;

public class SearchEleArr {
public static void main(String[] args) {
	int[] arr= {3,2,4,6,5,7,88};
	int target=6;
	System.out.println(search(arr,target,0));
}

private static boolean search(int[] arr,int target, int index) {
	if(index==arr.length) {
		return false;
	}
	return arr[index]==target || search(arr, target, index+1);
}

}
