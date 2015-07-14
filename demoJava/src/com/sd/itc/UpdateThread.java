package com.sd.itc;



public class UpdateThread extends Thread{
MyData md2;
	public UpdateThread(MyData md1) {
	super("producer");
	md2=md1;
		start();
	}
	
	@Override
		public void run() {
	for(int i=1;i<=10;i++)
		md2.write(i);
		}
	
}
