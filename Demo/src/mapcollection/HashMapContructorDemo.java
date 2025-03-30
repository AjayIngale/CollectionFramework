package mapcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapContructorDemo {
	

	
	public static void main(String[] args) {
		// create HashMap
		
		
		
		HashMap<Integer, String>hasmap=new HashMap<>();  //16  //0.75   // 12
		HashMap<String, Integer>hashmap2=new HashMap<>(20);//20  //0.75  // 15
		
		HashMap<Integer, String>hm=new HashMap<>(10, 0.5f); // 5
		

	    Map<Integer,String>hm3=new HashMap<Integer,String>();
	    
 		   hm3.put(1,"Prajkta");
		   hm3.put(2, "Sanika");
		   hm3.put(3, "Tanuja");
		   hm3.put(4, "Prajkta");
		   hm3.put(5, "Anushka");
		  
		   System.out.println(hm3);
		   
		   HashMap<Integer, String>hm4=new HashMap<>(hm3);
		   
		   System.out.println(hm4);
	    
		
	}
	
	
	
	

}
