package javaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	//Default capacity is 16 and Load Factor is 0.75
	//HashSet hs = new HashSet(100);
	//HashSet hs = new HashSet(100, (Double) 0.75);
	HashSet hs = new HashSet();
	hs.add(100);
	hs.add("Koti");
	hs.add(12.5);
	hs.add(true);
	hs.add(null);
	System.out.println(hs);
	hs.remove(null);
	System.out.println(hs);
	System.out.println(hs.contains("Koti"));
	System.out.println(hs.contains("koti"));
	System.out.println(hs.isEmpty());
	System.out.println("---------------------");
    
	for (Object o : hs) {
		
		System.out.println(o);
	}
	
	System.out.println("---------------------");
	Iterator it = hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
}	

}
