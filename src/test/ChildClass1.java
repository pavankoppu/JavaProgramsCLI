package test;

public class ChildClass1 extends AbstractClass1{
	
	void m1()
	{
	System.out.println("m1 method");	
	}
	void m2()
	{
	System.out.println("m2 method");	
	}
	

	public static void main(String[] args) {
		
		ChildClass1 c = new ChildClass1();
		c.m1();
		c.m2();
		c.m3();
		

	}

}
