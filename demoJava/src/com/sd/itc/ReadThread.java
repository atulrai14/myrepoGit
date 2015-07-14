package com.sd.itc;


public class ReadThread implements Runnable{
Thread t;
MyData md2;
	public ReadThread(MyData md1) {
	t=new Thread(this,"consumer");
	md2=md1;
	t.start();
	}
	
	
	@Override
	public void run() {
	
	for(int i=1;i<=10;i++)
		md2.read();
	}
}
