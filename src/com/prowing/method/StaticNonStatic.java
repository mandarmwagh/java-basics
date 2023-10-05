package com.prowing.method;

public class StaticNonStatic {
	public void m1() {
		System.out.println("inside m1 method");
		m2();
		m3();
	}

	public static void m2() {
		System.out.println("inside m2 method");

	}

	public void m3() {
		System.out.println("inside m3 method");
	}

	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
		obj.m1();

	}
}
