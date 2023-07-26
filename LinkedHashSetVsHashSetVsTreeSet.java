package com.collection.framework.continuation;

public class LinkedHashSetVsHashSetVsTreeSet 
{
	public static void main(String...args)
	{
		/*
		 * set interface
		 * sorted set interface
		 * navigable set interface
		 */
		
		
		
		/*--------------HashSet-------------------------class
		 * 
		 * internally used hashmap to store element
		 * order of element unpredicatable
		 * hashset better performance
		 * Insertion removal retrieval O(1)
		 * they compare elements by equals() and hashCode()
		 * less memory required 
		 * if we don't want to maintain order of elements  
		 */
		
		
		/*
		 *------------------------LinkedHashSet---------------class
		 *internally used linkedHashMap
		 *null allowed
		 *duplicate not allowed
		 *compare the elements by using equals and hashCode method
		 *more memory required
		 *insertion retrieval removal operation O(1)
		 *maintain order
		 *  
		 */
		
		
		
		/*
		 * ----------------------TreeSet---------------------class
		 * internally used treemap to store its element
		 * null not allowed
		 * duplicate not allowed 
		 * compare the elements using compare() or compareTo()
		 * elements must be comparable type
		 * more memory required
		 * insertion removal retrieval operation O(log (n))
		 * order of elements is to be according to supplied comparator
		 */
		
		
		/*
		 * --Similarities----
		 *   all three non synchronized
		 *   duplicate not allowed
		 *   implements cloneable and serializable
		 *   all three are fail-fast in nature
		 *   after iterator any modification done mean 
		 *   we got concurrent modification exception
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
