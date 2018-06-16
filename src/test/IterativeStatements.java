package test;

import java.util.concurrent.SynchronousQueue;

public class IterativeStatements {

	public static void main(String[] args) {
		
		//int x = 10;
		//While loop
	/*	while(x<10)
		{
			System.out.println(x);
			x=x+1;
		}*/
		
		//Do while loop
	/*	do
		{
			System.out.println(x);
			x= x+1; //x++
		}while(x<10);*/
		
		for(int x =10; x<20; x++)
		{
			if(x==15)
				continue;
			System.out.println(x);
		}

	}

}
