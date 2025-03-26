package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer>que=new PriorityQueue<>();
		que.add(11);
		que.add(12);
		que.add(10);
		que.add(15);
		que.add(9);
		que.add(14);
		
		System.out.println(que);
		
//		Queue<Integer>que1=new LinkedList<>();
//		que1.add(11);
//		que1.add(12);
//		que1.add(10);
//		que1.add(15);
//		que1.add(9);
//		que1.add(14);
//		System.out.println(que1);
//	
//	
		
	}

}
