package stringDemo;

import java.io.IOException;

public class MyString {

	public static void main(String[] args) {
		try {
			String s1=new String("Welcome");
			String s2=new String("Welcome");
					
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			
			
			String str1="Hello";
			String str2="Hello";
			System.out.println(str1==str2);
			System.out.println(str1.equals(str2));
		} catch (ArithmeticException | NumberFormatException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String st1=new String("aaa");
		A ob1=new A(10);
		A ob2=new A(10);
		System.out.println(ob1.equals(ob2));
//		System.out.println(st1);
//		System.out.println(ob1);
		
		
		
	}

}
