package com.sd.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put("a1", 120);
		hm.put("e1", 20);
		hm.put("q1", 520);
		hm.put("c1", 320);
		hm.put("g1", 420);
		
		System.out.println(hm);
		
		System.out.println(hm.get("q1"));
		
		Set<String> s=hm.keySet();
		
		Iterator<String> itr=s.iterator();
		
		
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println("key:"+str+"---values:"+hm.get(str));
		}
		
		
	Set<Map.Entry<String, Integer>> ss=hm.entrySet();
		
	Iterator<Map.Entry<String, Integer>> itr2=ss.iterator();
	
		while(itr2.hasNext())
		{
			Map.Entry<String, Integer> me=itr2.next();
			System.out.println(me.getKey()+":"+me.getValue());
		}
			
		
		
		
		
		

	}

}
