package test;

public class InheritanceChildClass extends InheritanceParentClass{

	void m3()
	{		
	System.out.println("m3 method");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceChildClass c = new InheritanceChildClass();
		c.m1();
		c.m2();
		c.m3();

	}

}
