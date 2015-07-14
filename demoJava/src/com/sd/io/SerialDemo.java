//package com.sd.io;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//
//import com.sd.collections.Employee;
//
//public class SerialDemo {
//
//	public static void main(String[] args) {
//		
//		
//		Employee e1=new Employee("101", "abc", 32000);
//		System.out.println("before serialization...."+e1);
//		try(
//				FileOutputStream fos=new FileOutputStream("d:\\myjava\\emp.txt");
//				ObjectOutputStream oos=new ObjectOutputStream(fos);
//				
//				FileInputStream fis=new FileInputStream("d:\\myjava\\emp.txt");
//				ObjectInputStream ois=new ObjectInputStream(fis);
//				
//				)
//				{
//			oos.writeObject(e1);
//			e1.salary=490000;
//			
//			System.out.println("after serialization...."+e1);
//			
//			
//			e1=(Employee)ois.readObject();
//			
//			System.out.println("after De-serialization...."+e1);
//			System.out.println(e1.x);
//				}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		
//
//	}
//
//}
