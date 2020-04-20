package PolymarphismDemo;

public class Child extends Parent
{

	public void parentMethod1()
	{
		System.out.println("parentMethod1 overridden in childMethod");
	}
	public void parentMethod2()
	{
		System.out.println("parentMethod2 overridden in childMethod");
	}
	public void childMethod()
	{
		System.out.println("child class method");
	}
}
