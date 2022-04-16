package com.learning.java.designpatterns.behavioural.template;

public class OrderService {

	public static void main(String[] args) {
		OrderPurchase op = new RegularOrder();
		op.purchase();
		
		System.out.println();
		OrderPurchase sop = new StoreOrder();
		sop.purchase();
	}

}
