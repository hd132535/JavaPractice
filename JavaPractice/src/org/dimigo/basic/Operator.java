package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		double s1,s2,cha;
		
		System.out.println("<< ���� ���� �� >>");
		s1=(a+b)*h1/2;
		System.out.println("��ٸ��� ���� : " + s1);
		s2=a*h2;
		System.out.println("����纯�� ���� : " + s2);
		System.out.println();
		cha=s1-s2;
		if(cha==0) {
			System.out.println("�� ������ ���̰� �����ϴ�.");
		}else if(cha>0) {
			System.out.println("��ٸ����� ����纯�� ���� " + cha + " �� Ů�ϴ�.");
		}else {
			System.out.println("����纯���� ��ٸ��ú��� " + -cha + " �� Ů�ϴ�.");
		}
	}

}
