package com.sd.threads;

import sun.applet.Main;

public class MyThread2 extends Thread{

	public MyThread2(String s1)
	{
		super(s1);
		start();
	}
	
	
public void run() {
	try {
		for(int i=1;i<=10;i++)
		{
		
				System.out.println(getName()+"-->"+i);
				Thread.sleep(1000);
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println(getName()+" terminating....");
}
}

