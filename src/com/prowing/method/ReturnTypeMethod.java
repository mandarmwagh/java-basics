package com.prowing.method;

public class ReturnTypeMethod {
	public int add(int a, int b) {
		int res = a + b;
		return res;
	}

	public static boolean isEvenMethod(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void print(int number) {
		System.out.println("number");
	}

	public static void main(String[] args) {
		ReturnTypeMethod obj = new ReturnTypeMethod();
		int res = obj.add(10, 5);

		System.out.println(res);

		int number = 8;

		if (isEvenMethod(number)) {
			print(number);
		}
	}
}
