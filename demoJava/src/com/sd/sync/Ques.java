//package com.sd.sync;
//
//import java.util.Scanner;
//
//public class Ques {
//
//	public static void main(String[] args) {
//		String []ar={"a","b","c"};
//		String ans=null;
//		Scanner sc=new Scanner(System.in);
//		Answer a1=new Answer();
//		for(int i=0;i<ar.length;i++)
//		{
//		System.out.println("ques no "+i+" : "+ar[i]);
//		ans=sc.next();
//		
//		if (ans!=null)
//			a1.t.interrupt();
//		}
//	}
//
//}
//	
//	class Answer implements Runnable
//	{
//		Thread t;
//		Answer()
//		{
//			t=new Thread(this,"AAA");
//			t.start();
//		}
//		@Override
//		public void run() 
//		{
//		try
//		{
//			System.out.println("waiting for answer.....");
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("welcome...");
//		}
//		}
//	}
