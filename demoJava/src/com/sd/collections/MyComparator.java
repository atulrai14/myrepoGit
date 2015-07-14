package com.sd.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	
	public int compare(String s1, String s2) {
		
	return s2.compareTo(s1);
	
	}

}
