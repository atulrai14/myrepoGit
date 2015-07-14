package com.sd.generics;

public class TestBoxG {

	public static void main(String[] args) {
		Integer i=10;
		String s="aaa";
		BoxG<String> b1=new BoxG<>();
		b1.set(s);
//		Integer i1=(Integer)b1.get();
		String s1=b1.get();
		System.out.println(s1);

	}

}
