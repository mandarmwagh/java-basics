package com.prowing.method;

public class ReturnTypeMethod2 {
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}

	public int square(int a) {
		int res = a * a;
		return res;
	}

	public static void main(String[] args) {
		ReturnTypeMethod2 obj = new ReturnTypeMethod2();

		int addRes = obj.add(10, 20);
		System.out.println(addRes);

		int sqResult = obj.square(addRes);
		System.out.println(sqResult);
	}
}
