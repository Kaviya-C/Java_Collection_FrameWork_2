package com.collection.framework.continuation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMapConcept
{
	public static void main(String...args)
	{
		/*
		 * 
		 * HashMap
		 * order not preserved
		 * duplicate keys not allowed
		 * duplicate values allowed
		 * key-value pair
		 * multiple null are allowed but only one null keys allowed
		 * not synchronized
		 * constant time performance for the operations like get() and put()
		 * initial capacity 16
		 * 
		 */
		HashMap<String,Integer> map=new HashMap<String,Integer>();
        map.put("Jagan", 89);
        map.put("raghu", 93);
        map.put("heena", 99);
        map.put("meena", 63);
        map.put("bhuvan", 99);
        map.put("vinay", 83);
        
        System.out.println(map);
        map.put(null, null);
        map.put("jivan", null);
        map.put(null, null);
        System.out.println(map);
        
        Set<String> keys=map.keySet();
        for(String k:keys)
        {
        	System.out.println(k+"  "+map.get(k));
        }
        
        System.out.println(map.size());
	
         Iterator<String> it=keys.iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
	
	/*
	 * 
	 * bucket---array
	 * initial capacity ---16
	 * load factor --0.75
	 * hashing
	 * 
	 * 
	 * key --- hashfunction--- hash code
	 * hashcode --- %capacity-1 --index
	 * key value placed 
	 * next-- incase same index repeated for two keys then it make as linked list
	 * from java 8 it change as balanced tree based on treefy threshold value
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ---------------Hash set---------------------
	 * internally uses hashmap
	 * insertion element need one object
	 * constant time perfomance O(1) insert remove retrieve
	 * hash set implement set interface
	 * store data as object
	 * duplicate not allowed
	 * one null allowed
	 * fail-fast
	 * not synchronized 
	 * 
	 * 
	 * -----------hashMap  ----------------
	 * implements map interface
	 * key value pair
	 * internally uses Entry<k,v>
	 * duplicate key not allowed
	 * fail-fast
	 * not synchronized
	 * slightly faster than hashset
	 * insertion need two object key and value
	 * one null key multiple null values allowed 
	 * 
	 */

	}

}
