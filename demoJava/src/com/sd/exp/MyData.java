package com.sd.exp;

public class MyData {

	int []arr={1,2,3,4,5,6,7,8,9};
	
	public void readForward()
	{
		for(int x:arr)
			System.out.println("forward:"+x);
	}
	
	public void reverseUpdate()
	{
		try {
			for(int i=arr.length-1;i>=0;i--)
			{
				arr[i]+=20;
				
				System.out.println("reverse:"+arr[i]);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void m1()
	{
		System.out.println("hello...");
	}
}
