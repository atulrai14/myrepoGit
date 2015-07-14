package com.org.sd.en;

public class EnumDemo1 {
	
	public static void main(String args[]){
		PaperSize ps=PaperSize.A4;
		System.out.println(ps.getDim1());
		System.out.println(ps.getDim2());
		ps.setDim1(211);
		System.out.println(ps.getDim1());
	}
}