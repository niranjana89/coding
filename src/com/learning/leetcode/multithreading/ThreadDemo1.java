package com.learning.leetcode.multithreading;

public class ThreadDemo1 {

	public static void main(String[] args) {
		 new A().start();
		A b = new A();
		b.start();
		
	//	Thread t = Thread.currentThread();
		//System.out.println("before name change "+t.getName());
//		
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		
//		B imp = new B();
//		new Thread(imp);
//		
//		//B imp2 = new B();
//		new Thread(imp);
//			
	}

}

// create thread - by extending Thread class
class A extends Thread {
	@Override
	public void run(){
		for(int i=0; i<100; i++){
			System.out.println( Thread.currentThread().getName()+" count "+  i);
			
		}
	}
	
}


// create thread by implementing Runnable interface
class B implements Runnable{
	
	int i;
	
	
	@Override
	public void run() {
		for(int i=0; i<100; i++){
			System.out.println(Thread.currentThread().getName() +" count "+  i);
		}
	}
	
}