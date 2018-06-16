package test;

public class ThrowExceptionProg {

	public static void main(String[] args) throws Exception {
		
		int age = 15;
		
		if (age>18)
		{
			System.out.println("eligible for vote");
			
		}
		else
		{
			throw new Exception ("Not eligible for vote");
		}
		System.out.println("test execution ");
		
	}

}
