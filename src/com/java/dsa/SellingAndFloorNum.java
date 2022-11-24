package com.java.dsa;

public class SellingAndFloorNum {

	public static void main(String[] args) {
		 int a[] = {2,3,5,9,14,16,18};
//		  selling(a,9);
		 floor(a, 10);

	}
	
	static void selling(int[] arr,int target) {
		 int start=0, end=arr.length-1,ans=-1;
	        while(start<end){
	         int mid=start+(end-start)/2;
	            if(arr[mid]<=target){
	            	start=mid+1;
	            }else{
	            	ans=mid;
	            	end=mid;
	                
	            }
	        }
	        System.out.println(arr[ans]); 
	}
	static void floor(int[] arr,int target) {
		 int start=0, end=arr.length-1,ans=-1;
	        while(start<end){
	         int mid=start+(end-start)/2;
	            if(arr[mid]<=target){
	            	start=mid+1;
	            	ans=mid;
	            }else{
//	            	ans=mid;
	            	end=mid;
	                
	            }
	        }
	        System.out.println(arr[ans]); 
	}

}
