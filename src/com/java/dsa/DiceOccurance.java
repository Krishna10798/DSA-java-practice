package com.java.dsa;

import java.util.ArrayList;

public class DiceOccurance {
	public static void main(String[] args) {
   dice("", 4);
   System.out.println(diceReturn("", 4));
   System.out.println(diceReturnCount("", 4));
   diceFace("", 4,1);

	}
	static void dice(String p,int target) {
		if(target==0) {
			System.out.println(p);
			return;
		}
		for (int i = 1; i <= 6 && i<=target; i++) {
			dice(p+i, target-i);
			
			
		}
	}
	static ArrayList<String> diceReturn(String p,int target) {
		if(target==0) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;		}
		ArrayList<String> list=new ArrayList<>();
		for (int i = 1; i <= 6 && i<=target; i++) {
			list.addAll(diceReturn(p+i, target-i));
		}
		return list;
	}
	static int diceReturnCount(String p,int target) {
		if(target==0) {
			return 1;	
			}
        int count=0;
		for (int i = 1; i <= 6 && i<=target; i++) {
			count+=(diceReturnCount(p+i, target-i));
		}
		return count;
	}
	
	
	//////////Face of dice/////////
	static void diceFace(String p,int target,int face) {
		if(target==0) {
			System.out.println(p);
			return;
		}
		for (int i = face; i <= 6 && i<=target; i++) {
			diceFace(p+i, target-i,face);
			
			
		}
	}
}
