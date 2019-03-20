package Day3_collections;
import java.util.*;
public class HashSetDemo {
	public static void main(String args[]) {
		HashSet <Integer> H=new <Integer> HashSet();
		for(int i=1;i<=5;i++) {
			H.add(i);
		}
		System.out.println(H.contains(4));
		for(Object o:H) {
			System.out.println(o);
			
		}
		H.add(1);
		H.add(2);
		H.add(6);
		H.remove(1);
		H.remove(2);
		/*Iterator it=H.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().hashCode());
		}*/
		H.forEach( o-> System.out.println(o.hashCode()));
		
	}

}
