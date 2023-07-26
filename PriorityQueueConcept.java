package com.collection.framework.continuation;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * same as normal queue first in first out
 * Elements in priority queue -- placed according to specified comparator
 * if comparator is not supplied elements places according to natural order
 * priority queue default capacity 11
 * if capacity exceeds it will grow but not specified how to grow
 * it contains duplicate but not null
 * if the elements in priority queue must be comparable type 
 * else we got class cast exception at runtime
 * we can order the elements using comparator()
 * least--head   large-- tail
 * not thread safe
 */

class Employee {
	String name;
	int salary;

	Employee(String empName, int empSalary) {
		this.name = empName;
		this.salary = empSalary;
	}

	@Override
	public String toString() {
		return "[ Name: " + name + " Salary: " + salary + " ]";
	}
}

class orderBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.salary - e1.salary;
	}
}

public class PriorityQueueConcept {
	public static void main(String... args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(12);
		pq.offer(6);
		pq.offer(18);
		pq.offer(3);
		pq.offer(15);
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		orderBySalary order = new orderBySalary();

		PriorityQueue<Employee> p = new PriorityQueue<>(order);
		p.add(new Employee("Kaviya", 45000));
		p.add(new Employee("Ram", 50000));
		p.add(new Employee("Seetha", 40000));
		p.add(new Employee("Geetha", 35000));
		p.add(new Employee("Krishna", 25000));
		p.add(new Employee("Radhai", 2000));

		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());

	}

}
