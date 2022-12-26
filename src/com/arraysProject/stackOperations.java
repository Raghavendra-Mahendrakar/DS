package com.arraysProject;

import java.util.Stack;

public class stackOperations {
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		//To push a elemets inside stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//List of element before pop()
		System.out.println("Elements inside stack : "+stack);
		
		//To print which element is poped from List
		System.out.println("Pop() : "+stack.pop());
		
		//To check the peek
		System.out.println("Peek() : "+stack.peek());
		
		//To check the size of stack
		System.out.println("Size() : "+stack.size());
	}

}
