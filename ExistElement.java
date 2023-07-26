package com.collection.framework.continuation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExistElement {
	public static void main(String... args) {

//Element exist?
		LinkedList<String> list = new LinkedList<>();
		list.addLast("Developer");
		list.add("software");
		list.add("java");

		System.out.println(list);

		String s = "JDBC";

		if (list.contains(s)) {
			System.out.println("yes it is there: " + list.lastIndexOf(s));
		}

//traverse the element of linked list in a reverse direction

		Iterator<String> it = list.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

//join an arraylist at the end of linkedlist

		List<String> array = Arrays.asList("mango", "grapes", "fruit", "apple");
		list.addAll(array);
		System.out.println(list);

// implements linkedlist as a queue --FIFO

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(19);
		list2.add(29);
		list2.add(39);
		list2.add(49);
		System.out.println(list2);

		LinkedList<Integer> queue = new LinkedList<>();
		queue.offer(100);
		queue.offer(90);
		queue.offer(80);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.pollFirst());
		System.out.println(queue);

//insert an element at the head and tail of a linkedlist

		LinkedList<Integer> list3 = new LinkedList<>();
		list3.addFirst(100);
		list3.addFirst(45);
		list3.addFirst(20);
		list3.offerFirst(40000);

		list3.add(10);
		list3.offerLast(10000);
		list3.offer(20000);
		list3.addLast(90000);

		System.out.println(list3);

//add an element or collection of element at a specified position of linkedlist

		LinkedList<Integer> list4 = new LinkedList<>();
		list4.add(10);
		list4.add(50);
		list4.add(90);
		list4.add(80);
		System.out.println(list4);

		list4.add(0, 111);
		System.out.println(list4);

		list4.addAll(0, list2);
		System.out.println(list4);

// remove the elements of a linked  list from both the ends:
		LinkedList<String> list5 = new LinkedList<>();
		list5.addAll(list);

		System.out.println(list5);
		list5.removeLast();
		list5.removeFirst();
		System.out.println(list5);

//replace an element at a specific position of linkedlist with the given element
		LinkedList<Integer> list6 = new LinkedList<>();
		list6.addAll(list2);
		System.out.println(list6);
		list6.set(list6.lastIndexOf(39), 800);
		System.out.println(list6);

//retrieve but not remove the elements of linkedlist from both the ends
		LinkedList<String> list7 = new LinkedList<>();
		list7.addAll(list);
		System.out.println(list7);
		System.out.println(list7.getFirst());
		System.out.println(list7.peek());
		System.out.println(list7.peekFirst());

		System.out.println(list7.element());

		// last retrieve
		System.out.println(list7.peekLast());
		System.out.println(list7.getLast());

//retrieve and remove and only retrieve an element from specific position

		LinkedList<Integer> list8 = new LinkedList<>();
		list8.addAll(list2);
		System.out.println(list8);

		System.out.println(list8.get(3));
		System.out.println(list8.remove(1));
		System.out.println(list8);

//NUmber of elements in the linkedlist

		System.out.println(list8.size());

//remove first occurence and last occurence of a given element
		LinkedList<String> lists = new LinkedList<>();
		lists.add("mango");
		lists.add("guva");
		lists.add("mango");
		lists.add("badham");
		lists.add("mango");
		LinkedList<String> list9 = new LinkedList<>();
		list9.addAll(lists);
		System.out.println(list9);
		list9.removeFirstOccurrence("mango");
		System.out.println(list9);
		list9.removeLastOccurrence("mango");
		System.out.println(list9);

//linkedlist as stack  last in first out		

		LinkedList<Integer> list10 = new LinkedList<>();
		list10.add(67);
		list10.add(80);
		list10.add(54);
		System.out.println(list10);
		list10.push(7);
		list10.push(8);
		list10.push(9);
		System.out.println(list10);
		list10.pop();
		System.out.println(list10);
// clone of linkedlist

		LinkedList<Integer> list11 = new LinkedList<>();
		list11 = (LinkedList<Integer>) list10.clone();
		System.out.println(list11);

//get the position of last occurence of the given element

		LinkedList<Integer> list12 = new LinkedList<>();
		list12.addAll(list10);
		// System.out.println(list12.getLast());
		System.out.println(list12.lastIndexOf(list12.getLast()));

	}

}
