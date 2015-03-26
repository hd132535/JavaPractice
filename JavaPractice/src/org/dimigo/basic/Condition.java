package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		int car = 1;
		int money1 = 850, money2 = 300, money3 = 600;
		int n = 0;
		
		System.out.println("<<고속도로 통행료 계산 >>");
		if(car == 1) {
			System.out.println("거리 : " + m + "km");
			System.out.println("차량 : 고속버스");
			if(m<=10) {
				System.out.println("통행료 : " + money1 + "원");
			} else {
				n+=(m-1)/10;
				System.out.println("통행료 : " + (money1+(300*n)) + "원");
			}
		} else if(car == 2) {
			System.out.println("거리 : " + m + "km");
			System.out.println("차량 : 경차");
			if(m<=10) {
				System.out.println("통행료 : " + money2 + "원");
			} else {
				n+=(m-1)/10;
				System.out.println("통행료 : " + (money2+(300*n)) + "원");
			}
		} else {
			System.out.println("거리 : " + m + "km");
			System.out.println("차량 : 그 외");
			if(m<=10) {
				System.out.println("통행료 : " + money3 + "원");
			} else {
				n+=(m-1)/10;
				System.out.println("통행료 : " + (money3+(300*n)) + "원");
			}
		}
	}

}
