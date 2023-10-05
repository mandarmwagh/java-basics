package com.prowing.method;

public class Return1 {
	public int addition(int a, int b) {
		System.out.println(" method started");
		int res = a + b;
		System.out.println(" method ended");
		return res;
	}

	public int square(int d) {
		System.out.println(" method started");

		int res = d * d;

		System.out.println(" method ended");
		return res;
	}

	public static void main(String[] args) {
		Return1 obj = new Return1();
		System.out.println(" main method started");

		int add_res = obj.addition(10, 20);
		System.out.println(add_res);

		int square_res = obj.square(10);

		System.out.println(square_res);

		System.out.println(" method ended");
	}
}
