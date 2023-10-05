package com.prowing.method;

public class IfDemo2 {
	public static void main(String[] args) {
		int i = 10;
		if (isEven(i)) {
			System.out.println("even");
		} else {
			System.out.println("even");
		}

	}

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
		// return(num%2==0)?true:false;
	}
}
