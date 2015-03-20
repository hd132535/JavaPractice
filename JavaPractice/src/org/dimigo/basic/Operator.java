package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		double s1,s2,cha;
		
		System.out.println("<< 도형 넓이 비교 >>");
		s1=(a+b)*h1/2;
		System.out.println("사다리꼴 넓이 : " + s1);
		s2=a*h2;
		System.out.println("평행사변형 넓이 : " + s2);
		System.out.println();
		cha=s1-s2;
		if(cha==0) {
			System.out.println("두 도형의 넓이가 같습니다.");
		}else if(cha>0) {
			System.out.println("사다리꼴이 평행사변형 보다 " + cha + " 더 큽니다.");
		}else {
			System.out.println("평행사변형이 사다리꼴보다 " + -cha + " 더 큽니다.");
		}
	}

}
