package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
	
		
		Queue<Integer>queue=new LinkedList<>();
		queue.add(10);
		queue.add(10);
		queue.offer(20);
		queue.offer(20);
		
		
		
		System.out.println(queue.offer(50));
		System.out.println(queue.add(60));
		System.out.println(queue);
		System.out.println("After Remove: ");
		queue.remove(); //10
		queue.remove(); //10
	    queue.poll(); //20
	    queue.poll();
	   
	    //queue.remove();
	
		System.out.println(queue);
		
//		int num=queue.element();
		queue.peek();
//		
//		System.out.println(num);
		System.out.println(	queue.peek());
		
	Queue<Integer>queue2=new LinkedList<Integer>();
	queue2.add(11);
	queue2.add(13);
	queue2.add(12);
	queue2.add(14);
	queue2.offer(20);
	System.out.println("queue2--->"+queue2);
	
	//queue2.clear();
	
	queue2.addAll(queue);
		System.out.println(queue2);
		
	
	System.out.println(queue2.contains(111));
	
  System.out.println(	 queue2.containsAll(queue));
  
   System.out.println(  queue2.size());
 
  
	
	
		
	}

}
