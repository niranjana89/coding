package com.learning.leetcode.day1;

public class LinkedListCycle {

	public static void main(String[] args) {
		//detectCyle(head);

	}
	
	public ListNode1 detectCycle(ListNode1 head) {
		ListNode1 slow = head;
		ListNode1 fast = head;
		while(fast != null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
				fast = head;
				while(slow != fast){
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}

}



class ListNode1 {
	      int val;
	      ListNode1 next;
	      ListNode1(int x) {
	          val = x;
	          next = null;
	      }
	  }