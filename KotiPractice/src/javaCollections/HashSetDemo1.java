package javaCollections;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		
		hs1.add('a');
		hs1.add('b');
		hs1.add('c');
		hs1.add('d');
		hs1.add('e');
		System.out.println(hs1);
		
		HashSet hs2 = new HashSet();
		hs2.add('c');
		hs2.add('d');
		hs2.add('e');
		System.out.println(hs2);
		hs1.addAll(hs2);               //Union
		System.out.println(hs1);
		hs1.removeAll(hs2);
		System.out.println(hs1);      //Difference
		hs1.retainAll(hs2);
		System.out.println(hs1);
		
		

	}

}
