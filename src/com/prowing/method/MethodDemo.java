package com.prowing.method;

public class MethodDemo {
	public static void print() {

		System.out.println(" print method started");
		System.out.println("hii");
		System.out.println(" print method ended");

		print2();
	}

	public static void print2() {

		System.out.println(" print2method started");
		System.out.println("hello");
		System.out.println(" print2method ended");
	}

	public static void main(String[] args) {
		System.out.println(" main method started");
		print();
		System.out.println(" main method ended");
	}
}
