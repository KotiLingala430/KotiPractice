package javaCollections;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {

		//Declaration
		ArrayList<Comparable> al = new ArrayList<Comparable>();
		al.add(100);
		al.add("Koti");
		al.add(12.5);
		al.add('a');
		al.add(true);
		System.out.println(al);
		
		//Size
		System.out.println(al.size());
		
		//Remove element
		al.remove(3);
		System.out.println("Elements after removing :"+al);
		//Insert element
		al.set(3, "Lingala");
		System.out.println("Elements after inserting :"+al);
		//Retrieve element
		System.out.println(al.get(3));
		

	}

}
