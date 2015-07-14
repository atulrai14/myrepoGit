package com.sd.collections;

import java.util.Collections;
import java.util.TreeSet;

public class Demo3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>(new MyComparator());
		
		ts.add("d");
		ts.add("w");
		ts.add("e");
		ts.add("a");
		ts.add("c");
		System.out.println(ts);
		
		
		

	}

}
