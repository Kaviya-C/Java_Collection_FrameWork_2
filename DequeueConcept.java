package com.collection.framework.continuation;

public class DequeueConcept 
{
	public static void main(String...args)
	{
		/*
		 * Dequeue is double ended queue
		 * supports insertion and removal of elements from both the ends
		 * introduced in 6
		 * dequeue can use as both queue and stack
		 * queue-- first in first out
		 * 		-- null not allowed
		 * 		-- duplicates allowed
		 * 		-- element insert at one end tail
		 * 		-- element remove at another end head
		 * 		-- add()  offer()
		 * 		-- poll()  remove()
		 * 		-- peek()  element()
		 * 
		 * stack -- last in first out
		 * 
		 * Deque	--insertion frontend--addFirst offerFirst
		 * 			--insertion rearend -- addLast  offerLast
		 * 
		 * 			--retrieval front end--getFirst peekFirst 
		 * 			--retrieval rearend  --getLast peekLast
		 * 			
		 * 			--removal  front end --removeFirst pollfirst
		 * 			--removal rear end --removeLast    pollLast
		 * 
		 * 
		 * 
		 * null allowed duplicate allowed
		 * can't set get insert element at an arbitary positions
		 * 
		 * 
		 * 
		 * ------------------------ArrayDeque--------------------------
		 * 
		 * ArrayDequeue class abstract collection 
		 *  resizeable-array
		 *  capacity limit grow automatically
		 *  default  16
		 *  increased as 2(24,25,26...)
		 *  arrayDequeue stack as well as queue
		 *   arrayDequeue faster than stack class
		 *   arrayDequeue faster than linkedlist (queue).
		 *   not a thread safe
		 *   indexed based operations is not possible
		 *   insert remove retrieve  performance O(1). 
		 * 
		 */
	}

}
