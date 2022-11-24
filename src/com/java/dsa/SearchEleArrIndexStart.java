package com.java.dsa;

public class SearchEleArrIndexStart {
public static void main(String[] args) {
	int[] arr= {3,2,4,6,5,7,88};
	int target=22;
	System.out.println(searchIndex(arr,target,0));
}

private static int searchIndex(int[] arr,int target, int index) {
	if(index==arr.length) {
		return -1;
	}else if(arr[index]==target) {
		return index;
	}else {
	return searchIndex(arr, target, index+1);
	}
}

}
