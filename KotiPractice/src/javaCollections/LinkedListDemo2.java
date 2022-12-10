package javaCollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add('a');
		ll.add('b');
		ll.add('x');
		ll.add('y');
		ll.add('c');
		ll.add('z');
		System.out.println(ll);
		
		LinkedList ll1 = new LinkedList();
		ll1.addAll(ll);
		
		ll1.removeAll(ll);
		System.out.println("LinkedList After Removing :"+ll);
		Collections.sort(ll);
		System.out.println(ll);
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println("Collection after reverse order :"+ll);
	}

}
