package com.collection.framework.continuation;

import java.util.HashSet;
import java.util.Iterator;

class Manager{
	int id;
	String department;
	String name;
	
	Manager(int mId,String mDepartment,String mName)
	{
		this.id=mId;
		this.department=mDepartment;
		this.name=mName;
	}
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object o)
	{
		Manager stu=(Manager)o;
		return (id==stu.id);
		
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", department=" + department + ", name=" + name + "]";
	}
	
}
public class HashSetConcept
{
	public static void main(String...args)
	{
		HashSet<Manager> set=new HashSet<>();
		set.add(new Manager(101,"S/W","Kaviya"));
		set.add(new Manager(103,"H/W","Oviya"));
		set.add(new Manager(104,"P/W","raina"));
		set.add(new Manager(103,"O/W","Geetha"));
		set.add(new Manager(104,"Y/W","Raju"));
		
		Iterator<Manager> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
