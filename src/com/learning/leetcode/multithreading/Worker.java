package com.learning.leetcode.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	
	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	public  void stageOne() {
		synchronized(lock1){
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		list1.add(random.nextInt(100));
	}
	
	public  void stageTwo() {
		synchronized(lock2){
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		list2.add(random.nextInt(100));
	}
	
	public void process(){
		for(int i=0; i<1000; i++){
			stageOne();
			stageTwo();
		}
	}
	
	public void doProcess() {
		
		System.out.println("Starting ...");
		
		long start =System.currentTimeMillis();
		Thread t1 = new Thread(new  Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		t1.start();
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		t2.start();
		long end = System.currentTimeMillis();
		
		System.out.println("time taken: "+(end-start));
		System.out.println("List1: "+ list1.size() +"; list2: "+ list2.size() );

	}
	
	public static void main(String args[]){
		Worker w = new Worker();
		w.doProcess();
	}

}
