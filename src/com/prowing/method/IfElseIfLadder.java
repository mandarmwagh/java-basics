package com.prowing.method;
public class IfElseIfLadder
{
	public static void main(String[] args)
	{
		int marks=118;
		if((marks>=50)&&(marks<=60))
		{
			System.out.println("c grade");
		}
		else if((marks>=61)&&(marks<=70))
		{
			System.out.println("B grade");
		}
		else if((marks>=71)&&(marks<=100))
		{
			System.out.println("A Grade");
		}
		else
		{
			System.out.println("invalid marks");
		}
		
	}
}