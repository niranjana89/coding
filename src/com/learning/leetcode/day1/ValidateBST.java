package com.learning.leetcode.day1;

public class ValidateBST {
	

	public static void main(String[] args) {
		//node.left.value < node.value < node.right.value
		Node root = null;
		isBST(root);
	}

	private static boolean isBST(Node n) {
		return isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBST(Node n, int min, int max) {
		if(n == null) return true;
		if(n.getValue() > min && n.getValue() < max) return false;
		return isBST(n.getLeft(), min, n.getValue()) && isBST(n.getRight(), n.getValue()+1, max);
	}

}


class Node {
		
	private int value;
	private Node left;
	private Node right;
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}