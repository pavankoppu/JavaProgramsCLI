package test;

public class MethodOverloading {
	
		void m1(int a)
		{
			System.out.println(a);
		}
		void m1(int a, int b)
		{
			System.out.println(a);
			System.out.println(b);
		}
		
		void m1(int a, char ch)

		{
			System.out.println(a);
			System.out.println(ch);
		}
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.m1(10);
		m.m1(100, 200);
		m.m1(300, 'k');
		

	}

}
