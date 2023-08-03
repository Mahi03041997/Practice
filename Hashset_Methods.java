package com.practice.Collection_Methods;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set se = new HashSet<>();
		se.add(22);
		se.add("mahi");
		se.add(46);
		se.add(11);
		se.add(22);
		se.add("mahi");
		System.out.println(se);
		Iterator<Hashset_Methods> hs = se.iterator();
		while(hs.hasNext()) {
			System.out.print(hs.next()+ " ");
		}
		System.out.println("------------------------------------");
		Set se1 = new HashSet<>();
		se1.add("Royal");
		se1.add("Kamala");
		se1.add("String");
		se1.addAll(se);
		System.out.println(se1);
		Iterator<Hashset_Methods> hss = se1.iterator();
		while(hss.hasNext()) {
			System.out.println(hss.next());
		}
		Set<String> hs1 = new HashSet<>();
		hs1.addAll(se1);
		System.out.println(hs1.contains("Kamala"));
		System.out.println(hs1.containsAll(se));
		System.out.println(se.containsAll(hs1));
		hs1.remove("Kamala");
		System.out.println(hs1);
	}
}
