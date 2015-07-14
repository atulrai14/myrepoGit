package com.sd.sync;

import com.sd.exp.MyData;

public class ReadThread implements Runnable{
Thread t;
MyData md2;
	public ReadThread(MyData md1) {
	t=new Thread(this,"Read");
	md2=md1;
	t.start();
	}
	
	
	@Override
	public void run() {
	
	synchronized(md2)
	{
		md2.readForward();
	}
	}
}
