package com.practice.Collection_Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pojo_Class_Comparator p1 = new Pojo_Class_Comparator(22, "Mahi", 32000, 94946941);
Pojo_Class_Comparator p2 = new Pojo_Class_Comparator(1, "Raju", 120000, 94946416);
Pojo_Class_Comparator p3 = new Pojo_Class_Comparator(7, "Eshu", 23000, 949464116);
List<Pojo_Class_Comparator> li = new ArrayList<>();
li.add(p1);
li.add(p2);
li.add(p3);
Collections.sort(li);
System.out.println(li);
System.out.println("---------------------------------");
Iterator <Pojo_Class_Comparator>it = li.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
Collections.sort(li, new ComparableExx());
System.out.println("______________________________________");
System.out.println(li);
Iterator<Pojo_Class_Comparator> pi = li.iterator();
while(pi.hasNext()) {
	System.out.println(pi.next());
}

	}

}
