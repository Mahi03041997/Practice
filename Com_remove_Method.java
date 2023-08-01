package com.practice.Collection_Methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Com_remove_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List li = new ArrayList<>();
li.add(22);
li.add(24);
li.add(74);
li.add(32);
List<Integer> list = new ArrayList<>();
list.add(300);
list.add(400);
list.addAll(li);
System.out.println(list);
list.remove(3);
System.out.println(list);
list.removeAll(li);
System.out.println(list);
	}

}
