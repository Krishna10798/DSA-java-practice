package com.java.dsa;

public class SplitArray {
	public static void main(String[] args) {
		
	}
 int splitArray(int[] arr,int m) {
	 int start=0,end=0;
	 for (int i = 0; i < arr.length; i++) {
		 start=Math.max(start, arr[i]);
		 end+=arr[i];
		 while(start<end) {
			 int mid=start+(end-start)/2,sum=0,pieces=1;
			 for (int j : arr) {
				 if(sum+j>mid) {
					 sum=j;
					 pieces++;
				 }else {
					 sum+=j;
				 }

			 }if(pieces>m) {
				 start=mid+1;
			 }else {
				 end=mid;
			 }
		 }
	 }
	 return end;
	 
 }
}
