package com.learning.leetcode.day1;

public class StackImpl {
	
	private int[] elements;
	
	private int top;
	
	private int capacity;
	
	public StackImpl(){
		elements = new int[16];
		capacity = 16;
		top = -1;
	}
	
	public StackImpl(int size) {
		elements = new int[size];
		capacity = size;
		top = -1;
	}

	
	public void push(int element){
		//check stack is full
		if(isFull()){
			System.out.println("Stack is Full!!!");
			return;
		}
		System.out.println("adding element " + element);
		elements[++top] = element;
	}
	
	public void pop() {
		//check stack is empty
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			 return;
		}
		System.out.println("Removed the element "+ elements[top--] );
	}
	
	public int peek() {
		//check stack is empty
		if(isEmpty()) {
			System.out.println("Stack is empty!!!");
			 return -1;
		}
		return elements[top];
	}
	
	private boolean isFull(){
		return top == (capacity - 1);
	}
	
	private boolean isEmpty(){
		return top == -1;
	}
	
	public static void main(String[] args) {
		StackImpl stk = new StackImpl(4);
		stk.push(1);
		stk.push(2);
		stk.pop();
		stk.pop();
		stk.pop();
		stk.push(3);
		stk.push(4);
		stk.push(5);
		stk.push(6);
		stk.push(7);
		System.out.println(stk.peek());
		
	}
	
	

}
