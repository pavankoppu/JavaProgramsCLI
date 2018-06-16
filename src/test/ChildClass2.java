package test;

public class ChildClass2 extends AbstractClass2 {

	public static void main(String[] args) {
		
		ChildClass2 c = new ChildClass2();
		c.m1();
		c.m2();
		c.m3();
	}

	@Override
	void m1() {
		
		System.out.println("m1 method");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

}
