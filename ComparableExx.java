package com.practice.Collection_Methods;

import java.util.Comparator;

public class ComparableExx implements Comparator<Pojo_Class_Comparator> {

	@Override
	public int compare(Pojo_Class_Comparator o1, Pojo_Class_Comparator o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	

	

}
