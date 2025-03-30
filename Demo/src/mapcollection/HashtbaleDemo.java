package mapcollection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashtbaleDemo {
	
	public static void main(String[] args) {
		
		//Map<Integer, String>ht=new Hashtable<>();
		Hashtable<Integer, String>ht2=new Hashtable<>();
		
		ht2.put(11, "Raj");
		ht2.put(12, "Raj");
		
		ht2.put(13, "Ajay");
		//ht2.put(null, "Suraj");
		
		//ht2.put(13, null);
		System.out.println(ht2);
		
		
		System.out.println(ht2.keySet());
		
		System.out.println(ht2.keys());
		
		System.out.println(ht2.values());
		
		System.out.println(ht2.elements());
		
		Enumeration<String>enurators=ht2.elements();
		Enumeration<Integer>keyEnum=ht2.keys();
		
		while(enurators.hasMoreElements()) {
			System.out.println(enurators.nextElement());
		}
		
		while(keyEnum.hasMoreElements()) {
			System.out.println(keyEnum.nextElement());
		}
	
		
		if(ht2.containsKey(13)) {
			System.out.println(ht2.get(13));
		}
		
	
	}

}
