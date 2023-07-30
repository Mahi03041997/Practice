package com.practice.Collection_Methods;

import java.util.ArrayList;
import java.util.List;

public class Collection_Methods_AddAllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add("mahi");
		li.add("nikki");
		li.add("Pavan");
		List l1 = new ArrayList();
		l1.addAll(li);
		System.out.println(l1);
	}

}
