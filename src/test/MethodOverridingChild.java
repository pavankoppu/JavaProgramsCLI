package test;

public class MethodOverridingChild extends MethodoverridingParent{
	
	public void m1()
	{
		System.out.println("Child class m1 method");
	}
	

	public static void main(String[] args) {
		MethodOverridingChild c = new MethodOverridingChild();
		c.m1();
		c.m2();

	}

}
