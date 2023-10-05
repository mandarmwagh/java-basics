package com.prowing.method;

public class AddSubMulDiv {
	public int man(int a, int b) {
		int res = a + b;
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		AddSubMulDiv a = new AddSubMulDiv();
		a.man(30, 20);
	}

}
