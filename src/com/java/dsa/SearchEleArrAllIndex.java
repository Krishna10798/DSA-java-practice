package com.java.dsa;

import java.util.ArrayList;


public class SearchEleArrAllIndex {
	public static void main(String[] args) {
		int[] arr= {3,2,4,6,5,7,88,5};
		int target=5;
		searchIndex(arr, target, 0);
		System.out.println(list);
		
		System.out.println(searchIndexReturn(arr,target,0,new ArrayList<Integer>()));
		
		
		System.out.println(searchIndexReturnWithoutArg(arr,target,0));

	}
	static ArrayList<Integer> list=new ArrayList<>();
	private static void searchIndex(int[] arr,int target, int index) {
		if(index==arr.length) {
			return;
		}else if(arr[index]==target) {
		 list.add(index);
		}
		 searchIndex(arr, target, index+1);
		
	}
	private static ArrayList<Integer> searchIndexReturn(int[] arr,int target, int index,ArrayList<Integer> list) {
		if(index==arr.length) {
			return list;
		}else if(arr[index]==target) {
		 list.add(index);
		}
		return searchIndexReturn(arr, target, index+1,list);
		 
		
	}
	
	private static ArrayList<Integer> searchIndexReturnWithoutArg(int[] arr,int target, int index) {
		ArrayList<Integer> list=new ArrayList<>();
		if(index==arr.length) {
			return list;
		}else if(arr[index]==target) {
		 list.add(index);
		}
		ArrayList<Integer> ansfromabovecalls=searchIndexReturnWithoutArg(arr, target, index+1);
		list.addAll(ansfromabovecalls);
		return list;
		 
		
	}
}