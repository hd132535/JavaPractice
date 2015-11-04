package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread start");
		
		Thread t1 = new Runner("민아");
		Thread t2 = new Runner("예린");
		
		//multi thread를 실행하려면 start() 호출하기
		t1.start();
		t2.start();
		
		//MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY(0)
		//우선순위가 높은 스레드가 실행 기회를 더 많이 가진다.
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("main thread end");
	}

}
