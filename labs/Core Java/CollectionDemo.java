package Day3_collections;

import java.util.*;
import java.util.LinkedList;
public class CollectionDemo {
	public static void main(String args[]) {
		Vector countries=new Vector();
		countries.add("India");
		countries.add("Australia");
		countries.add("Nepal");
		countries.add("Bhutan");
		System.out.println(countries.size());
		for(Object o:countries) {
			System.out.println(o);
		}
		countries.remove("Nepal");
		countries.removeAll(countries);
		countries.forEach(o-> System.out.println(o));
		
		//linkedList
		
		LinkedList <String> Brand=new LinkedList<String>();
		
		Brand.add("Xiaomi");
		Brand.add("Lenovo");
		Brand.add("apple");
		Brand.add("Samsung");
		for(Object L:Brand) {
			System.out.println(L.toString().lastIndexOf('a'));
		}
		Brand.addFirst("Sony");
		Brand.addLast("Xolo");
		Brand.add(3, "Oppo");
		Iterator itr=Brand.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Enumeration E=countries.elements();
		
		while(E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}
		
		List <Integer> A=new ArrayList <Integer>();
		for(int i=0;i<=5;i++) {
			A.add(i);
		}
		
	}

}
