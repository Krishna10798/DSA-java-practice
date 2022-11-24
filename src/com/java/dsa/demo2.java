package com.java.dsa;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class demo2 {
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		//		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		int val=2;
		System.out.println((removeDuplicates(nums)));
		//		duplicateZeros(nums);
	}
	public static void duplicateZeros(int[] arr) {
		ArrayList<Integer> al =new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0){
				al.add(0);
				al.add(0);
			}else {
				al.add(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=al.get(i);
		}   
	}

	public static int removeElement(int[] nums, int val) {
		int count=1,index=0;
		if(nums.length==1 && nums[0]==val)return 0;
		else if(nums.length==1)return 1;
		for(int i=0; i<nums.length; i++){
			if(nums[i]!=val){
				nums[index]=nums[i];
				index++;
				count++;
			}
		}
		return count-1;
	}
	public static int removeDuplicates(int[] nums) {
		int count=1,index=0;
		if(nums.length==1 && nums[0]==nums[1])return 0;
		else if(nums.length==1)return 1;
		for(int i=0; i<nums.length-1; i++){
			if(nums[i]!=nums[i+1]){
				nums[index]=nums[i];
				index++;
				count++;
			}
		}
		return count;
	}
}