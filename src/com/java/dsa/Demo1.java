package com.java.dsa;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		int[] nums= {4,2,5,7,4};
//				System.out.println(sortArrayByParityII(nums));
		System.out.println(Arrays.toString(sortArrayByParityII(nums)));
	}
	public static int[] sortArrayByParityII(int[] nums) {
        int n=nums.length-1;
	    int oddInd = 1;
	    int evenInd = 0;
	    while (true)
	    {
	        while (evenInd < n && nums[evenInd] % 2 == 0)
	            evenInd += 2;
	             
	        while (oddInd < n && nums[oddInd] % 2 == 1)
	            oddInd += 2;
	             
	        if (evenInd < n && oddInd < n)
	            {
	                int temp = nums[evenInd];
	                nums[evenInd] = nums[oddInd];
	                nums[oddInd] = temp;
	            }
	             
	        else
	            break;
	    }
		return nums;
	}
}
