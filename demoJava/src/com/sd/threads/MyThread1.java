package com.sd.threads;

import sun.applet.Main;

public class MyThread1 implements Runnable{
Thread t;
	public MyThread1(String s1)
	{
		t=new Thread(this,s1);
		System.out.println(t);
//		t.setDaemon(true);
		t.start();
	}
	
	
public void run() {
	try {
		for(int i=1;i<=10;i++)
		{
		
				System.out.println(t.getName()+"-->"+i);
				Thread.sleep(1000);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println(t.getName()+" terminating....");
}
}

