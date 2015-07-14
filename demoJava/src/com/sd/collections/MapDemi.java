package com.sd.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemi {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
hm.put("a", 112);
hm.put("g",543);
hm.put("q", 41);
hm.put("r", 23);
hm.put("t", 345);
System.out.println(hm);



Set<Map.Entry<String, Integer>> ss=hm.entrySet();

Iterator<Map.Entry<String, Integer>> itr=ss.iterator();
while(itr.hasNext())
{
	
	Map.Entry<String, Integer> mv=itr.next();
	System.out.println(mv.getKey()+"--"+mv.getValue());
}

	}

}
