package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=1700000;
		int people=3;
		int num=1500;
		System.out.println("<< ��̺��� ���� �ΰǺ� >>");
		System.out.println("�� ��� �޿� : " + String.format("%,d", money) + "��");
		System.out.println("���� �� ���� �� : " + people + "��");
		System.out.println("���� �� : " + String.format("%,d", num) + "��");
		System.out.println();
		System.out.println("���� �ΰǺ� : " + String.format("%,d", (long)money*12*(long)people*(long)num) + "��");
	}

}

