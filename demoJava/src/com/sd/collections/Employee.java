package com.sd.collections;

import java.io.Serializable;

public class Employee implements Serializable,Comparable {
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
	public int compareTo(Object arg0) {

		return empId.compareTo(((Employee)arg0).empId);
	}


	@Override
	public String toString() {
//	return "empname "+empName+" earns :"+salary+" amt..";
		return empId;
	}
	
	@Override
	public boolean equals(Object arg0) {
	return ((Employee)arg0).empId.equals(empId); 
			}
	
	public void getDetail()
	{
	System.out.println(empId+"--"+empName+"--"+salary);
	}
	void m1(int...a)
	{
		
	}
	
	@Override
	public int hashCode() {
	return empId.hashCode();
	}

}
