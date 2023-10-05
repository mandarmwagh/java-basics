package com.prowing.method;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int size = 40;

		switch (size) {
		case 28:
			System.out.println("small");
			break;

		case 32:
			System.out.println("medium");
			break;

		case 40:
			System.out.println("extra large");

			break;

		default:
			System.out.println("invalid size");
		}
	}
}