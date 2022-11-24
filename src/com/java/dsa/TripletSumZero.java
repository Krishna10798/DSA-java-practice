package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TripletSumZero {

	public static void main(String[] args) {
		  int[] nums = { 2, 7, 4, 0, 9, 5, 1, 3 };
	        int target = 6;
	 
	        System.out.println((threeSum(nums)));
	}
	static List<List> res = new ArrayList();
	public static List<List> threeSum(int[] nums) {
	Arrays.sort(nums);
	for(int i = 0; i<nums.length; i++){
	if(i == 0 || nums[i-1] != nums[i]){
	twosumsorted(i+1, nums.length-1,nums, 0-nums[i]);

	        }
	    }
	    return res;
	    
	}
	static void twosumsorted(int i, int j, int[] nums, int target){
	    int a1= nums[i-1];
	    while(i<j){
	        if(nums[i] + nums[j]> target){
	            j--;
	        }else if(nums[i] + nums[j]<target){
	            i++;
	        
	        }else{
	            List<Integer> list = new ArrayList();
	            list.add(a1); list.add(nums[i]); list.add(nums[j]);
	            res.add(list);
	             while(i<j && nums[i]== nums[i+1]) i++;
	             while(i<j && nums[j]== nums[j-1]) j--;
	            i++;
	            j--;
	        }
	    }
	}
//	public static int[][] Testing(int[]arr)
//    {
//        int[][]newArr=new int[arr.length][arr[0].length];
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr[0].length;j++)
//            {
//                newArr[i][j]=arr[i][arr[0].length-1-j];
//            }
////            return newArr;  
//        }
//		return newArr;      
//    }
	 public static int[][] printAllTriplets(int[] nums, int target)
	    {
	 Arrays.sort(nums);
	 
     int n = nums.length;

     // check if triplet is formed by nums[i] and a pair from
     // subarray nums[i+1…n)
     for (int i = 0; i <= n - 3; i++)
     {
         // remaining sum
         int k = target - nums[i];

         // maintain two indices pointing to endpoints of the subarray nums[i+1…n)
         int low = i + 1;
         int high = nums.length - 1;

         // loop if `low` is less than `high`
         while (low < high)
         {
             // increment `low` index if the total is less than the remaining sum
             if (nums[low] + nums[high] < k) {
                 low++;
             }

             // decrement `high` index if the total is more than the remaining sum
             else if (nums[low] + nums[high] > k) {
                 high--;
             }

             // triplet with the given sum is found
             else {
                 // print the triplet
//                 System.out.println("(" + nums[i] + ", " + nums[low] + ", " +
//                                     nums[high] + ")");
//            	 return new int[][]nums;  

                 // increment `low` index and decrement `high` index
                 low++;
                 high--;
             }
         }
     }
	return null;
	    }
}
