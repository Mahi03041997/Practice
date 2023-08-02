package com.practice.Collection_Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pojo_Class_Comparator p1 = new Pojo_Class_Comparator(2, "mahi", 32000, 956155161);
Pojo_Class_Comparator p2 = new Pojo_Class_Comparator(4, "Raju", 17000, 95964646);
Pojo_Class_Comparator p3 = new Pojo_Class_Comparator(3, "Eswar", 22000, 94949494);
Pojo_Class_Comparator p4 = new Pojo_Class_Comparator(1, "Kumar", 44000, 99496419);
Pojo_Class_Comparator p5 = new Pojo_Class_Comparator(5, "Kamal", 11000, 9949649);
List<Pojo_Class_Comparator> li = new ArrayList<>();
li.add(p1);
li.add(p2);
li.add(p3);
li.add(p4);
li.add(p5);
Collections.sort(li, new Comparatorr());
System.out.println(li);

	}

}
