package com.prowing.method;

public class StaticDemo {
	public void m1() {
		System.out.println("method started");
		System.out.println("method ended");
	}

	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		s1.m1();
		System.out.println("main method started");

		System.out.println("main method ended");
	}
}
