package test;

import java.util.ArrayList;

public class ArrayListProg1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add('h');
		al.add(100);
		al.add(null);
		al.add(10.6f);
		System.out.println(al);
		System.out.println("ArrayList size : " +al.size());
		al.add(1, "A1");
		System.out.println(al);
		System.out.println("ArrayList size : " +al.size());
		al.remove(2);
		System.out.println(al);
		System.out.println("ArrayList size : " +al.size());
		al.remove("A");
		System.out.println(al);
		System.out.println("ArrayList size : " +al.size());
		

	}

}
