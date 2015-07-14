package com.sd.itc;
public class DemoSync {

	public static void main(String[] args) {
		MyData md1=new MyData();
		UpdateThread rd2=new UpdateThread(md1);
		ReadThread rd1=new ReadThread(md1);
		try {
			
	
			rd1.t.join();
			rd2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
