package com.prowing.method;

public class Employee
{
	int id;
	String name;
	String dept;
	
	public Employee()
	{
		
	}
	public Employee(int id)
	{
	this.id=id;
	}
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public Employee(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public static void main(String[]args)
	{
	
	Employee e1=new Employee();
	
	e1.id=10;
	
	System.out.println(e1.id);
	
	Employee e2=new Employee();
	
 	e2.id=20;
	e2.name="mandar";
	
	System.out.println(e2.id);
	System.out.println(e2.name);
	
	Employee e3=new Employee();
	
	e3.id=30;
	e3.name="ram";
	e3.dept="hr";
	
	System.out.println(e3.id);
	System.out.println(e3.name);
	System.out.println(e3.dept);
	
	}
}