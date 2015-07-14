package com.sd.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		try (
			FileInputStream fis=new FileInputStream("d:\\myjava\\Employee.java");
			FileOutputStream fos=new FileOutputStream("d:\\newjava\\Employee.java");
			)	
				
				{	
			int data=0;
			
			
			while((data=fis.read())!=-1)
			{
				System.out.print((char)data);
				fos.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
