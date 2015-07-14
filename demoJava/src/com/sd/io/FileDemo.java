package com.sd.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		File f1=new File("d:\\myjava");
		File f2=new File(f1,"Demo2.java");
		
		System.out.println("Name:"+f1.getName());
		System.out.println("Parent dir:"+f2.getParent());
		System.out.println("File:"+f1.isFile());
		System.out.println("File:"+f2.isFile());
		System.out.println("File:"+f1.isDirectory());
		System.out.println("File:"+f2.isDirectory());
		
		System.out.println("Can read:"+f2.canRead());
		System.out.println("can write:"+f2.canWrite());
		
		System.out.println("absolute path:"+f2.getAbsolutePath());
		
		System.out.println("size:"+f2.length());
		System.out.println("last modified at:"+ new Date(f2.lastModified()));
		
		
		String[] str=f1.list();
		int dcnt=0,fcnt=0;
		
		for(int i=0;i<str.length;i++)
		{
			
			File f11=new File(f1,str[i]);
			if(f11.isFile())
				fcnt++;
			else
				dcnt++;
			
					
		}
		
		System.out.println("total files:"+fcnt+"\ntotal directories:"+dcnt);
		
		
		File f4=new File("d:\\myjava\\newjava\\day6");
		
		if(!f4.exists())
			f4.mkdirs();
		
		
		File f5=new File("d:\\myjava\\newjava\\day6","Exp1.java");
		
		try {
//			if(!f5.exists())
//				f5.createNewFile();
//			
//			f5.deleteOnExit();
//			
//			Thread.sleep(9000);
			
			
//			f2.renameTo(f5);
			
//			f5.setReadable(false);
			
			File []froot=File.listRoots();
			for(File f44:froot)
				System.out.println(f44);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
