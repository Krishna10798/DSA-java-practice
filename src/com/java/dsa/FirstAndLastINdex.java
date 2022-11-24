package com.java.dsa;

public class FirstAndLastINdex {
public static void main(String[] args) {
	 int a[] = {2,9,3,5,9,14,9,9,16,18};
  System.out.println(searchRange(a, 9));
}
public static int[] searchRange(int[] arr, int target) {
    int[] ans={-1,-1};
    int start=search(arr,target,true);
    int end=search(arr,target,false);
    arr[0]=start;
    arr[1]=end;
    return ans;
}
static int search(int[] arr, int target,boolean findIndex){
    int ans=-1;
     int start=0, end=arr.length-1;
        while(start<=end){
         int mid=start+(end-start)/2;
            if(arr[mid]>target){
            	end=mid-1;
            }else if(arr[mid]<target){
            	start=mid+1;
                
            }else{
                ans=mid;
                if(findIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
    return ans;
}
}
