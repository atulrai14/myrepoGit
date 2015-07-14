package com.sd.annt.full;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test 
{
   String info() default "";
}



class Annotated 
{
   public void foo(String myParam) {
      System.out.println("This is " + myParam);
   }
}


class TestAnnotationParser 
{
   public void parse(Class clazz) throws Exception 
   {
      Method[] methods = clazz.getMethods();
      for (Method method : methods) 
      {
         if (method.isAnnotationPresent(Test.class)) 
         {
            Test test = method.getAnnotation(Test.class);
            String info = test.info();
            if ("AWESOME".equals(info)) 
            {
                System.out.println("info is awesome!");
                // try to invoke the method with param
                method.invoke(Annotated.class.newInstance(),info);
            }
 
         }
         else if(method.getName().equals("foo"))
         {
        	 System.out.println("no annotation defined..");
         }
      }
   }
}

public class TestAnnotation 
{
   public static void main(String[] args) throws Exception 
   {
      TestAnnotationParser parser = new TestAnnotationParser();
      parser.parse(Annotated.class);
   }
}