package com.java.dsa;

public class MostFrequentEven {

	public static void main(String[] args) {
		int[] intArray = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
//		int[] intArray = {0,1,2,2,4,4,1};
		mostFrequentEven(intArray);
	}
	public static void mostFrequentEven(int[] nums) {
		int [] freq = new int[100001];
	    for(int el : nums){
	        freq[el]++;
	    }
	    
	    int max =0;
	    int ans =-1;
	    
	    for(int i=0; i<freq.length; i++){
	        if(i%2==0 && freq[i]>max){
	            max=freq[i];
	            ans=i;
	        }
	    }
		System.out.println(ans);
	}
}
