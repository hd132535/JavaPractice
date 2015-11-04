package org.dimigo.thread;

public class Runner extends Thread{
	private String name;

	public Runner() {
		
	}
	
	public Runner(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		int distance = 100;
		System.out.println(name + " 출발");
		do{
			System.out.println(name + " " + distance + " 미터");
			distance -= 10;
			try{
				Thread.sleep(1000);
			} catch(Exception e){
				e.printStackTrace();
			}
		} while(distance >= 0);
		System.out.println(name + " 골인");
	}
}
