 package com.learning.leetcode.day1;

public class StackImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}

class Stack {
	
	private int[] array;
	private int size;
	private int top;
	
	public Stack(int capacity) {
		this.size = capacity;
		this.top = -1;
		this.array = new int[capacity];
	}
	
	/** push operation **/
	public void push(int element) throws Exception {
		//isFull()
		if(isFull())throw new Exception("Stack overflow");
		top++;
		array[top] = element;
	}
    
	
	private boolean isFull() {
		return (size-1) == top;
	}
	
	/**pop operation **/
	public void pop() throws Exception {
		//isempty()
		if(isEmpty()) throw new Exception("Stack is Empty");
		int k = peek();
		array[top] = 0;
		top--;
	}

	private boolean isEmpty() {
		return top==-1;
	}
	
	private int peek(){
		return array[top];
	}
	
}
