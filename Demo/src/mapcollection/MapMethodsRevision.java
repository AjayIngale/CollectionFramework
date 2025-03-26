package mapcollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethodsRevision {

	public static void main(String[] args) {
		//How create Map
		//Put Method
		Map<Integer,String>hm=new HashMap<Integer,String>();
		
		//InsertData
		  hm.put(1,"Prajkta");
		   hm.put(2, "Sanika");
		   hm.put(3, "Tanuja");
		   hm.put(4, "Prajkta");
		   hm.put(5, "Anushka");
		   hm.put(6, "");
		   hm.put(null, "Ajay");
		   hm.put(7, null);
		   
		   //Hashmap 2
		   
		   Map<Integer, String>hm2=new HashMap<Integer,String>();
		   hm2.put(8, "Ram");
		   hm2.put(9, "Shyam");
		   hm2.put(10, "Dan");
		   
		   hm.putAll(hm2);
		   System.out.println("hashmap 2  : "+hm2);
		   System.out.println("hashmap 1  : "+hm);
		   
		   hm.putIfAbsent(7, "Suraj");
		   hm.putIfAbsent(11, "Suraj");
		   System.out.println("hashmap 1  : "+hm);
		   
		  String value=hm.get(12);
		  System.out.println(value);
		  
		  
		  String value1=hm.getOrDefault(12, "Vijay");
		  
		  System.out.println(value1);
		  
		  System.out.println(hm.containsKey(22));
		  System.out.println(hm.containsValue("Sanjay"));
		  		
		    hm.replace(7, "Mahesh");
		    hm.replace(6, "", "Sagar");
		    hm.replace(10, "Dan", "Jon");
		    
		    hm.remove(11);
		    hm.remove(10, "Jon");
		    
		    
		    
		    System.out.println("hashmap 1  : "+hm);
		    
		    System.out.println(hm.keySet());
		    
		    System.out.println(hm.values());
		    
		    System.out.println(hm.entrySet());
		    
		   //hm.clear();
		   // System.out.println("hashmap 1  : "+hm);
		    
		    System.out.println(hm.size());
		    
		    System.out.println(  hm.isEmpty());
		    //Iteration over Map
		    for (Entry<Integer, String> entry :hm.entrySet() ) {
		    	System.out.println(entry);
				
			}
		    
		    Set<Integer>set=new HashSet<>();
		    set.add(1);
		    set.add(2);
		    set.add(3);
		    System.out.println(set);
		    
		    for (Integer value2 : set) {
		    	System.out.println(value2);
				
			}
		    
		    
		    
	}

}
