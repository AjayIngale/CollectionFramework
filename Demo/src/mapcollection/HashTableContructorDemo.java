package mapcollection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableContructorDemo {
	public static void main(String[] args) {
		
		Map<Integer, String>hm=new HashMap<>();
		
		Hashtable<Integer, String>ht1=new Hashtable<>();  // 11 // 0.75
		
		Hashtable<Integer, String>ht2=new Hashtable<>(5);  // 5  // 0.75
		
		Hashtable<Integer, String>ht3=new Hashtable<>(10, 0.5f);  // 10 // 0.5
		
		Hashtable<Integer, String>ht4=new Hashtable<>(hm);
		
	}

}
