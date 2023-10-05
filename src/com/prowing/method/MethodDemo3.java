package com.prowing.method;

public class MethodDemo3 {
	public void sub(int a, int b) {
		int res = a - b;
		System.out.println(res);

	}

	public static void main(String[] args) {
		MethodDemo3 obj = new MethodDemo3();
		obj.sub(10, 5);

	}
}
