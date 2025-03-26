package mapcollection;

import java.util.HashMap;
import java.util.Map;

public class MapMehtodsDemo {
	public static void main(String[] args) {
		//creating map
		Map<Integer, String>hm=new HashMap<Integer,String>();
		// V put(K key,V value)
		   hm.put(1,"Prajkta");
		   hm.put(2, "Sanika");
		   hm.put(3, "Tanuja");
		   hm.put(4, "Prajkta");
		   hm.put(5, "Anushka");
		   hm.put(6, "");
		   hm.put(null, "Ajay");
		   hm.put(7, null);
		   
		Map<Integer, String>hm1=new HashMap<>();
		     hm1.put(8, "Vaibhavi");
		     hm1.put(9, "Sanchita");
		     hm1.put(10,"Samurudhi");
		     System.out.println(hm1.put(10,"Samurudhi"));
		 
		 // void putAll(Map<? extends K,? extends V> m)
		     hm.putAll(hm1);
		     
		  System.out.println(  hm.putIfAbsent(7, "Raj"));
		   
		   System.out.println(hm);
		 //  System.out.println(hm1);
		   
		   String keyvalue=hm.get(2);
		   System.out.println(keyvalue);
		   
		   String keyString=hm.get(16);
		   System.out.println(keyString);
		   
		   System.out.println(hm.getOrDefault(11, "Suraj"));
		   
		   System.out.println(hm.containsKey(111));
		   System.out.println(hm.containsValue("Mahesh"));
		   hm.replace(7, "Prashant");
		   System.out.println(hm);
		   hm.replace(7, "Prashant", "Sushant");
		   System.out.println(hm);
		   hm.remove(6);
		   hm.remove(7,"Sushant");
		   System.out.println(hm);
		   
		   System.out.println(hm.keySet());
		   System.out.println(hm.values());
		   System.out.println(hm.entrySet());
		   
		 
		    
		   
		
	}

}
