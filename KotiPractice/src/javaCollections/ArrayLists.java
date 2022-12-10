package javaCollections;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {

		//Declaration
		ArrayList al = new ArrayList();
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
		System.out.println("---------------------");
		
		for (int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));
			
		}
		System.out.println("---------------------");
		for (Object o : al) {
			
			System.out.println(o);
		}
		
		System.out.println("---------------------");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------");
		
		String st[] = {"Cycle", "Bike", "Car", "Lorry"};
		for (String string : st) {
			System.out.println(string);
			
		}
		 ArrayList al1 = new ArrayList(Arrays.asList(st));
		 System.out.println(al1);
		}
		

	}


