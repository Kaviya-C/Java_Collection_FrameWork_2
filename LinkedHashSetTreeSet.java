package com.collection.framework.continuation;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTreeSet {

	public static void main(String... args) 
	{
		/*
		 * insertion order is preserved in linkedhashSet
		 * constant time performance for insertion removal retrieval 
		 * performance less internally doubly linked list
		 * iterator returned by linkedhashset is fail-fast
		 * linked hash set modified at any time after the iterator is
		 *  created we get concurrentmodification exception
		 * 
		 * 
		 */
		LinkedHashSet<String> link=new LinkedHashSet<>();
		link.add("apple");link.add("guava");link.add("mango");
		link.add("orange");link.add("apple");
		
		System.out.println(link);
		Iterator<String> it=link.iterator();
		//link.add("banana");
	while(it.hasNext())
	{
		System.err.println(it.next());
	}

	}
	/*
	 * Treeset--
	 * order of elements placed according to supplied comparator
	 * null not allowed
	 * duplicate not allowed
	 * set---- sorted set---navigable set---- tree set(Class)
	 * it compare the elements by compare() or compareTo() not by equasls and hashCode()
	 * elements must be comparable type else class cast exception
	 * not synchronized
	 * fail-fast in nature after iteration if we modify the element we will get
	 * concurrent modification exception
	 * internally used treemap
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
