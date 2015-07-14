package com.sd.generics;

public class TestBoxSimple {

	public static void main(String[] args) {
		Integer i=10;
		String s="aaa";
		Box b1=new Box();
		b1.set(i);
//		Integer i1=(Integer)b1.get();
		String s1=(String)b1.get();
		System.out.println(s1);

	}

}
