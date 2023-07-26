package com.collection.framework.continuation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetConcept 
{
	public static void main(String...args)
	{
		Set<String> set=new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set);
		/*
		 * set contains only unique elements
		 * does not allow duplicates
		 * it is not a type of random access
		 * order of elements in set-- implementation dependent
		 * 						   -- hashset elements are ordered on hash code
		 * 						   -- treeset elements are ordered according to supplied comparator
		 * 						   -- linkedhashset  maintains insertion order
		 * set interface contains method which is inherited from collection interface
		 * set strong contract equals() hashCode()   hashset treeset linkedhashset
		 * 
		 * two set instances irrespective of their implementation types are said to be equal if they contains same element
		 */
		
		/*
		 * HashSet  class
		 * internally uses hashMap to store the object
		 * elements as keys
		 * values will be constant called PRESENT
		 * private static final Object PRESENT=new Object()
		 * hashSet implements cloneable and serializable
		 * can have null elements
		 * it does not maintain any order
		 * constant time performance of insertion removal retrieval
		 * 
		 */
		
		
		HashSet<String> set1=new HashSet<>();
		set1.add("Java");set1.add("JDBC");set1.add("Java");
		System.out.println(set1);
		set1.add(null);set1.add(null);
		System.out.println(set1);
		
		Set<String> s=Collections.synchronizedSet(set1);
		System.out.println(s);
		
		/*
		 * HashSet<>-----new HashMap<>
		 * add() HashSet---- HashMap --- new Hashmap.put(element,PRESENT)
		 * remove()  Hashset--- HashMap remove(element)==PRESENT
		 * 
		 */
		
	}

}
