package gom.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer>cons=(num)->System.out.println(num);
		cons.accept(10);
		List<Integer>list= new ArrayList<>();
		list.add(10);
		list.add(14);
		list.add(13);
		list.add(12);
		list.add(102);
		list.add(102);
		list.add(102);
		
		Predicate<Integer> isEven=s->s%2==0;
	
		
		
		list.forEach(cons);
		list.forEach((num)->System.out.println(num));
		
		for (Integer integer : list) {
			cons.accept(integer);
			
		}
		
		list.forEach(num->System.out.println(num*num));
		
		list.removeIf(num->num>=10);
		
		System.out.println(list);
		
		String s="Helll1o";
		
	boolean st1=s.chars().allMatch(s1->Character.isLetter(s1));
		System.out.println(st1);
		
		
	}
	
	
	

}
