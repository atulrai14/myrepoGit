package com.sd.threads;

public class Demo1
{
	public static void main(String []s)
	{
	MyThread1 mt1=new MyThread1("U1");
	MyThread1 mt2=new MyThread1("U2");
	
	Thread t1=Thread.currentThread();
	System.out.println(t1.getName());
	
	t1.setName("mymain");;
	System.out.println(t1.getName());
	
	
	System.out.println(t1);
	
	
	try {
		for(int i=1;i<=10;i++)
		{
		
				System.out.println(t1.getName()+"-->"+i);
				Thread.sleep(500);
		}
		
		mt1.t.join();
		mt2.t.join();
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("main terminating.....");
}
}
	
