package test;

public class MethodoverridingParent {

	public void m1()
	{
		System.out.println("Parent class m1 method");
	}
	public void m2()
	{
		System.out.println("Parent class m2 method");
	}
	
	public static void main(String[] args)
	{
		MethodoverridingParent P = new MethodoverridingParent();
		P.m1();
		P.m2();
	}

}
