package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;


public class Hw8_1 {
	
	public static void main(String[] args) {
		Object obj = new Object();
		ArrayList list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(obj);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		Iterator objs = list.iterator();
			while(objs.hasNext())
				System.out.println(objs.next());
			
		for(int i =0 ; i<list.size(); i++) {
			Object item = list.get(i);
			System.out.println(item);
		}	
		for(Object items : list)
			System.out.println(items);
		
		list.remove(obj);
		list.remove("Kitty");
		list.remove("Snoopy");
		
		for(Object items : list)
			System.out.println(items);
		
	}
	

}
