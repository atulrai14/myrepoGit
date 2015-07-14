package com.sd.io;

import java.io.Serializable;

public class Employee implements Serializable {
	transient static int x=10;
	String empId,empName;
	transient double salary;

	public Employee(String s1,String s2,double d)
	{
	empId=s1;
	empName=s2;
	salary=d;
	}

	
	@Override
	public String toString() {
	return "empname "+empName+" earns :"+salary+" amt..";
	}
	
	
	
	public void getDetail()
	{
	System.out.println(empId+"--"+empName+"--"+salary);
	}
	void m1(int...a)
	{
		
	}

}
