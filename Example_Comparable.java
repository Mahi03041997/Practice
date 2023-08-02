package com.comparable.and.comparator.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example_Comparable {

	public static void main(String[] args) {
		List <Pojo_Class> list = new ArrayList<>();
		Pojo_Class p1 = new Pojo_Class(22, "mahi", 21000f, 9110771054l);
		Pojo_Class p2 = new Pojo_Class(15, "vashi", 17000, 9145555555l);
		Pojo_Class p3 = new Pojo_Class(34, "vasu", 34000, 9555365124l);
		Pojo_Class p4 = new Pojo_Class(30, "Ramu", 62000, 99664141546l);
		
		list.add(p4);
		list.add(p3);
		list.add(p2);
		list.add(p1);
		Collections.sort(list);
		System.out.println(list);
	}
}
