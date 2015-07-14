package com.sd.sync;

import com.sd.exp.MyData;

public class UpdateThread extends Thread{
MyData md2;
	public UpdateThread(MyData md1) {
	super("update");
	md2=md1;
		start();
	}
	
	@Override
		public void run() {
	
		synchronized (md2) {
			
		
		md2.reverseUpdate();	
		}
	}
	
}
