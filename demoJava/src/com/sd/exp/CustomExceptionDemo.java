package com.sd.exp;

public class CustomExceptionDemo {
void m1(int x) throws NegNoException
{
	
	
		if(x<0)
			throw new NegNoException();
		else
			System.out.println(x);
	
	
}
}
