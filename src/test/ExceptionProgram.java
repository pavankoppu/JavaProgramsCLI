package test;

public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		try
		{
			System.out.println(4/0);
		}
		catch(Exception ae)
		{
		System.out.println(4/2);	
		}
		finally
		{
			System.out.println("Hello final");
		}
		System.out.println("Hello java");

	}

}
