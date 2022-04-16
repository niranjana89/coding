package com.learning.leetcode.day1;

import java.util.HashMap;
import java.util.Map;

class NodeList<T> {
	T value;
	NodeList<T> next;
	public NodeList(T value){
		this.value = value;
		this.next = null;
	}
}

class LinkedList<T> {
	NodeList<T> head;
		
	public void printList() {
		NodeList<T> n = head;
		while(n!=null){
			System.out.print(n.value +"->");
			n = n.next;
		}
		System.out.println();
	}
	
	public void deleteNodeByValue(T value){
		if(head.value == value){
			head = head.next;
		}else{
			NodeList<T> prev = head;
			NodeList<T> current = head.next;
			while(current!= null){
				if(current.value==value){
					prev.next = current.next;
					current = null;
					return;
				}
				prev = current;
				current = current.next;
			}
		}
	}
	
	
}

public class DeleteKeyInLL {
	
	public static void main(String[] args) {
		 LinkedList<Integer> llist = new LinkedList<>();
	     llist.head = new NodeList<Integer>(1);
	     
	     NodeList<Integer> second = new NodeList<>(2);
	     NodeList<Integer> third = new NodeList<>(3);
	 
	     llist.head.next = second; 
	     second.next = third;
	     
	     llist.printList();
	     LinkedList newList = deepCopy(llist.head);
	     newList.deleteNodeByValue(2);
	     newList.printList();
	     llist.printList();
	    
	}
	
	 public static <T> LinkedList<T> deepCopy(NodeList<T> head) {
		 
		 NodeList<T> current = head;
		 NodeList<T> prev = null;
		 LinkedList<T>  newList = new LinkedList<>();
		 
		// Map<NodeList<T>, NodeList<T>> copyMap= new HashMap<>();
		 	 
		 while(current != null){
			 NodeList<T> currentNewNode = new NodeList<T>(current.value);
			 currentNewNode.next  = current.next;
			 
			 if(prev == null){
				 newList.head = currentNewNode;
			 }else {
				prev.next = current;
			 }
			 prev = currentNewNode;
			// copyMap.put(current, currentNewNode);
			 
			 current = current.next;
		 }
		 return newList;
		 
	 }
}
