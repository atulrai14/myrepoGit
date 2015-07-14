package com.sd.sync;

import com.sd.exp.MyData;

public class DemoSync {

	public static void main(String[] args) {
		final MyData md1=new MyData();
		UpdateThread rd2=new UpdateThread(md1);
		ReadThread rd1=new ReadThread(md1);
		try {
			Thread.sleep(2000);
		
		new Thread(new Runnable()
		{
			public void run()
			{
				md1.m1();
			}
		},"New thread").start();
		
		
		
	
			rd1.t.join();
			rd2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
