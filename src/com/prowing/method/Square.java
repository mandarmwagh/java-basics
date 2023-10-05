package com.prowing.method;

class Square {
	public static int sq(int a) {
		int res = a * a;
		return res;
	}

	public static void main(String[] args) {
		int res = sq(2);
		System.out.println(res);
	}
}