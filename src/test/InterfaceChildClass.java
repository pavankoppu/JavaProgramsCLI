package test;

public class InterfaceChildClass implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InterfaceChildClass I = new InterfaceChildClass();
		I.m1();
		I.m2();
		I.m3();
	}

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method");
	}

}
