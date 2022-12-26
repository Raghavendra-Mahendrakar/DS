package com.arraysProject;

import java.util.LinkedList;
import java.util.Queue;

public class queueOperation {
	public static void main(String[] args) {
		Queue<Person> p1 = new LinkedList<>();
		p1.add(new Person("xyz",21));
		p1.add(new Person("abc",22));
		p1.add(new Person("prq",21));
		
		System.out.println(p1.size());
		System.out.println(p1.peek());

		// poll() is used to pop an element
		System.out.println(p1.poll());
		System.out.println(p1.size());

		
	}

	static record Person(String name, int age) {
	}

}
