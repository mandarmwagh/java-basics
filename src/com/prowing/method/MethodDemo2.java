package com.prowing.method;

public class MethodDemo2 {
	public static int addition(int a, int b) {
		int res = a + b;
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		addition(10, 20);
		//System.out.println(addition);
	}
}