package com.learning.concepts;


class DemoThread implements Runnable {

	@Override
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
public class DemoThreadRunnable {

	public static void main(String[] args) {
		new Thread(new DemoThread()).start();
		new Thread(new DemoThread()).start();
		new Thread(new DemoThread()).start();
		new Thread(new DemoThread()).start();

	}

}
