package test;

public class Variables {
	
	int x = 10;  //Instance variables
	int y = 20;
	static int a = 100; //static variables
	static int b = 200;
	
	void m1() //Instance method
	{
		int z = 300; //local variable
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m2() //Static method
	{
		Variables v = new Variables();
		System.out.println(v.x);
		System.out.println(v.y);
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Variables v1 = new Variables();
		v1.m1();
		
		//v1.m2();
		//Variables.m2();
		m2();
	}

}
