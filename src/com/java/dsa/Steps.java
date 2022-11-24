package com.java.dsa;

public class Steps {
public static void main(String[] args) {
	System.out.println(numberOfSteps(14));
}

private static int numberOfSteps(int num) {
	return healper(num,0);
}
private static int healper(int num, int steps) {
	if(num==0) {
		return steps;
	}
	if(num%2==0) {
		return healper(num/2, steps+1);
	}
	return healper(num-1, steps+1);
}
}
