package com.practice.Collection_Methods;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Example_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new LinkedList<>();
		li.add(9);
		li.add(7);
		li.add(8);
		li.add(4);
		li.add(1);
		li.add(2);
		li.add(6);
		li.add(3);
		li.add(5);
		
		System.out.println(li);
		Iterator<Example_LinkedList> it =  li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator<Example_LinkedList> iit = li.listIterator();
		while(iit.hasPrevious()) {
			System.out.println(iit.previous());
		}
	}
}
