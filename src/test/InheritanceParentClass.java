package test;

public class InheritanceParentClass {
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		
		InheritanceParentClass P = new InheritanceParentClass();
		P.m1();
		P.m2();
		
	}

}
