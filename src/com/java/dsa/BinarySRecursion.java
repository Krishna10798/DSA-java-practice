package com.java.dsa;

public class BinarySRecursion {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int target=9;
//		String s=" hhah -46";
		String s = "   -4193 with words";
		System.out.println(myAtoi(s));

//		String digits = text.replaceAll("[^0-9.]", "");
//		System.out.println(digits);
	}
	 public static int myAtoi(String str) {
//		 s=s.trim();
//		 
//		 String digits = s.replaceAll("[^0-9.]", "");
//	      int i=Integer.parseInt(digits);  
//			return i; 
		 String numericString = null;
	        String temp;
	      if(str.startsWith("-")){ //checks for negative values
	          temp=str.substring(1);
	          if(temp.matches("[+]?\\d*(\\.\\d+)?")){
	              numericString=str;
	          }
	      }
	        if(str.matches("[+]?\\d*(\\.\\d+)?")) {
	            numericString=str;
	        }
	        int i=Integer.parseInt(numericString);
	        return i;
	        
	    }

}
