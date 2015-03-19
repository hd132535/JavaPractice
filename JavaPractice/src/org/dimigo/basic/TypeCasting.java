package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money=1700000;
		int people=3;
		int num=1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수 : " + people + "명");
		System.out.println("점포 수 : " + String.format("%,d", num) + "개");
		System.out.println();
		System.out.println("연간 인건비 : " + String.format("%,d", (long)money*12*(long)people*(long)num) + "원");
	}

}

