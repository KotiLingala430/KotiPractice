package javaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	
public static void main(String[] args) {
	//Declaration of LinkedList
	
	//LinkedList<String> ll= new LinkedList<String>();
	//LinkedList<Integer> ll= new LinkedList<Integer>();
	
	LinkedList ll = new LinkedList();
	ll.add(100);
	ll.add("Koti");
	ll.add(12.5);
	ll.add('K');
	ll.add(true);
	ll.add(null);
	
	System.out.println(ll);
	System.out.println("Size of LinkedList :"+ll.size());
	System.out.println("LinkedList After removing the element :"+ll.remove(3));
	ll.add(2, "Lingala");
	System.out.println("LinkedList after inserting elements :"+ll);
	System.out.println("REtrieved element :"+ll.get(2));
	ll.set(4, "Java");
	System.out.println("LinkedList after inserting elements :"+ll);
	System.out.println("LinkedList contains element :"+ll.contains("Koti"));
	System.out.println(ll.isEmpty());
	
	System.out.println("---------------------");
	
	for (int i = 0; i <ll.size(); i++) {
		System.out.println(ll.get(i));
		
	}
	System.out.println("---------------------");
	for (Object o : ll) {
		
		System.out.println(o);
	}
	
	System.out.println("---------------------");
	Iterator it = ll.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
}
}
