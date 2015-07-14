package com.sd.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<>();
//		HashSet<Employee> a1=new HashSet<>();
		Employee e1=new Employee("111", "aaaa", 200000);
		Employee e2=new Employee("123", "jjjj", 400000);
		Employee e3=new Employee("112", "bbb", 100000);
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(e1.hashCode());
		System.out.println(e3.hashCode());
		Employee e4=new Employee("112", "vvvv", 1200000);
//System.out.println(a1.contains(e4));
		System.out.println(e4.hashCode());
		a1.add(e4);
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		String s1=new String("aa");
		String s2=new String("ba");
		String s3=new String("ca");
		String s4=new String("ca");
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
//		HashSet<String> a2=new HashSet<>();

		ArrayList<String> a2=new ArrayList<>();
		
		a2.add(s2);
	a2.add(s4);
		a2.add(s3);
		a2.add(s1);
		System.out.println(a2);
		
		Collections.sort(a2);
		System.out.println(a2);
		
	}

}
