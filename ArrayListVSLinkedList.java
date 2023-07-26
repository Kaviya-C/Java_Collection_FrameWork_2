package com.collection.framework.continuation;

public class ArrayListVSLinkedList
{
	public static void main(String...args)
	{
		/*---------------------ARRAY LIST-------------------------
		 * arraylist index based data structure each element associated with index
		 * insertion removal of each element in arraylist is very slow
		 * bcoz after insert or remove element have to replace right or left
		 * insertion removal operation in arraylist O(n)
		 * retrieval of elements in arraylist is faster than linkedlist bcoz all the elements are index based
		 * retrieval operation of arraylist is O(1).
		 * arrayList is a type of random access so we can access the element randomly
		 * arraylist cannot be used as a stack or queue
		 * arraylist requires less memory it hold only actual date and index
		 * arraylist implements list interface
		 * it contains duplicate and null elements 
		 */
		
		
		/*
		 * --------------------------LINKED LIST-----------------------
		 * Each element in linked list are called nodes .each node contain 3 parts ,data and references to previous and next element
		 * insertion and removal is faster bcoz no need to shift the element only change the reference of previous and next element
		 * insertion and removal operation O(1)
		 * retrieval in linked list slower we have to traverse from begin to end
		 * retrieval operation in linkedlist is O(n)
		 * it is not a random access type
		 * we are not able to access the element randomly
		 * we have to traverse from begin to end for particular element
		 * contains duplicate and null element
		 * require more memory bcoz it hold 3 parts 
		 */
		
		/*
		 * --------------------SIMILARITIES---------------
		 * Linkedlist and Arraylist implements list interface
		 * insertion order both preserved
		 * both non-synchronized
		 * both are cloneable and serializable 
		 */
	}

}
