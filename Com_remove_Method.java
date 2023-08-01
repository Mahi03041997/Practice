package com.practice.Collection_Methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Com_remove_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List li = new ArrayList<>();
// add method
li.add(22);
li.add(24);
li.add(74);
li.add(32);
List<Integer> list = new ArrayList<>();
list.add(300);
list.add(400);
// add all method
list.addAll(li);
System.out.println(list);
// remove method
list.remove(3);
System.out.println(list);
// remove method
list.removeAll(li);
System.out.println(list);
// contains method
System.out.println(list.contains(300));
System.out.println(list.contains(20));
// contains all method
System.out.println(list.containsAll(list));
// is empty method
System.out.println(list.isEmpty());
// clear method
list.clear();
System.out.println(list);
System.out.println(list.isEmpty());



	}

}
