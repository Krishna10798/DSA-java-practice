package com.java.dsa;

import java.util.Arrays;


public class MergeSortRecursion {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
//		arr=mergeSort(arr);
//		System.out.println(Arrays.toString(arr));

		
		mergeSortInPlace(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] leftHalf=mergeSort(Arrays.copyOfRange(arr,0, mid));
		int[] rightHalf=mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
		return merge(leftHalf,rightHalf);
	}

	private static int[] merge(int[] firstHalf, int[] secondHalf) {
		int[] mixArr=new int[firstHalf.length+secondHalf.length];
		int i=0,j=0,k=0;
		while(i<firstHalf.length && j< secondHalf.length) {
			if(firstHalf[i]<secondHalf[j]) {
				mixArr[k]=firstHalf[i];
				i++;
				k++;

			}else {
				mixArr[k]=secondHalf[j];
				j++;
				k++;
			}
		}
		while(i<firstHalf.length) {
			mixArr[k]=firstHalf[i];
			i++;
			k++;
		}
		while(j<secondHalf.length) {
			mixArr[k]=secondHalf[j];
			j++;
			k++;
		}
		return mixArr;
	}
	
	
	
	//OR///
	private static void mergeSortInPlace(int[] arr,int s,int e) {
		if(e-s==1) {
			return;
		}
		int mid=s+(e-s)/2;
		mergeSortInPlace(arr,s, mid);
		mergeSortInPlace(arr, mid,e);
		mergeInPlace(arr,s,mid,e);
	}
	private static void mergeInPlace(int[] arr,int s,int m,int e) {
		int[] mixArr=new int[e-s];
		int i=s,j=m,k=0;
		while(i<m && j< e) {
			if(arr[i]<arr[j]) {
				mixArr[k]=arr[i];
				i++;

			}else {
				mixArr[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<m) {
			mixArr[k]=arr[i];
			i++;
			k++;
		}
		while(j<e) {
			mixArr[k]=arr[j];
			j++;
			k++;
		}
		System.arraycopy(mixArr, 0, arr, s,mixArr.length);
	}
}
