package com.sd.exp;

public class Demo1 {

	public static void main(String[] args) throws NegNoException {
		CustomExceptionDemo cd=new CustomExceptionDemo();
		
		
		
		
			cd.m1(-10);
			cd.m1(3);
		
System.out.println("last stmt of main.....");
	}

}