package com.learning.concepts;

class ThreadExtend extends Thread
{
	public void run() {
		for(int i=0; i<10; i++)  {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName()+" " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class DemoThreadExtend {
	
	public static void main(String args[]) {		
		Thread t1 = new ThreadExtend();
		t1.start();
		
		new ThreadExtend().start();
		new ThreadExtend().start();
		new ThreadExtend().start();
	}

}


