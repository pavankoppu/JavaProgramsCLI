package test;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListProg2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("ArrayList size : " +al.size());
		System.out.println(al.get(2));
		
	/*	for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		} */
		
	/*	for(int i : al)
		{
			System.out.println(i);
		}*/
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}
		
		System.out.println("Test execution completed");
	}

}
