package com.sd.itc;

public class MyData {

	int buffer;
	boolean b;
	public synchronized void read()
	{
		if(!b)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("consumed:"+buffer);
		b=false;
		notify();
		
		
	}

	public synchronized void write(int x)
	{
		
		if(b)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		buffer=x;
		System.out.println("produced:"+buffer);
		b=true;
		notify();
		
		
		
		
		
	}

}
