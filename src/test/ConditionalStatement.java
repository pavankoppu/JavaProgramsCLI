package test;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = s.nextInt();
	/*	if(x%2 == 0)
		{
			System.out.println("The number is even");
		}
		else if (x%2 != 0)
		{
			System.out.println("The number is odd");
		}
		else
		{
			System.out.println("The input is not an integer");
		} */
		switch(x%2)
		{
		case 0 :
			System.out.println("the number is even");
			break;
		case 1 :
			System.out.println("The number is odd");
			break;
		default:
			System.out.println("The number is not an integer");
			break;
		}
		
	}

}
