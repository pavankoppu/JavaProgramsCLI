package test;

public class InterfaceChildClass2 implements Interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChildClass2 I = new InterfaceChildClass2();
		I.m1();
		I.m2();
		I.m3();
	}

	@Override
	public void m1() {
		System.out.println(10+12);
		
	}

	@Override
	public void m2() {
	System.out.println("Hello Java");
		
	}

	@Override
	public void m3() {
		System.out.println("Hello C#");
		
	}

}
