package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 10;
		int car = 1;
		int money1 = 850, money2 = 300, money3 = 600;
		int n = 0;
		
		System.out.println("<<��ӵ��� ����� ��� >>");
		if(car == 1) {
			System.out.println("�Ÿ� : " + m + "km");
			System.out.println("���� : ��ӹ���");
			if(m<=10) {
				System.out.println("����� : " + money1 + "��");
			} else {
				n+=(m-1)/10;
				System.out.println("����� : " + (money1+(300*n)) + "��");
			}
		} else if(car == 2) {
			System.out.println("�Ÿ� : " + m + "km");
			System.out.println("���� : ����");
			if(m<=10) {
				System.out.println("����� : " + money2 + "��");
			} else {
				n+=(m-1)/10;
				System.out.println("����� : " + (money2+(300*n)) + "��");
			}
		} else {
			System.out.println("�Ÿ� : " + m + "km");
			System.out.println("���� : �� ��");
			if(m<=10) {
				System.out.println("����� : " + money3 + "��");
			} else {
				n+=(m-1)/10;
				System.out.println("����� : " + (money3+(300*n)) + "��");
			}
		}
	}

}
