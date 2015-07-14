package com.sd.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) {
//		ArrayList a1=new ArrayList();
		Vector<String> a1=new Vector<>();
//		LinkedList a1=new LinkedList();
//		HashSet a1=new HashSet();
//	LinkedHashSet a1=new LinkedHashSet();
//		TreeSet a1=new TreeSet();
		a1.add("d");
		a1.add("e");
		a1.add("a");
		a1.add("s");
		a1.add("d");
		a1.add("q");
		a1.add("f");
		
		System.out.println(a1);
		
		System.out.println("basic for loop for all list type...");
		
		for(int i=0;i<a1.size();i++)
			System.out.print(a1.get(i)+",");

		
		System.out.println("\nfor each for any collection type...");
		
		for(Object ob:a1)
			System.out.print(ob+",");
		
		
		System.out.println("\nusing Iterator for all collection type...");
		
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+",");
		
		
		System.out.println("\nListIterator for only List type....");
		
		ListIterator<String> litr=a1.listIterator(a1.size());
		
		
//		System.out.println("\nfor forward...");
//		
//		while(litr.hasNext())
//			System.out.print(litr.next()+",");
		
		System.out.println("\n backward...");
		while(litr.hasPrevious())
			System.out.print(litr.previous()+",");
		
		
		
		System.out.println("\nEnumeration with Vector...");
		
		Enumeration<String> emr=a1.elements();
		
		while(emr.hasMoreElements())
			System.out.print(emr.nextElement()+",");
		
	}

}
