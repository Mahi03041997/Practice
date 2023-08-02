package com.practice.Collection_Methods;
import java.util.*;

public class ComparableClass implements Comparator<ComparableEx>{

    private int id;

    @Override
    public int compare(ComparableEx o1, ComparableEx o2) {
        return o1.getName().compareTo(o2.getName());
    }

   
    
}
