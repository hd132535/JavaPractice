package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 16.
 * </pre>
 * @author 최수빈
 *
 */
public class CarTest {

	public static void main(String[] args) {
		Car3 hyun = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 kia = new Car3("기아자동차", "K7", "흰색", 246,40000000);
		Car3 sam = new Car3("삼성자동차", "SM7", "회색",200,38000000);
//		hyun.setCompany("현대자동차");
//		hyun.setModel("제네시스");
//		hyun.setColor("검정색");
//		hyun.setMaxSpeed(225);
//		hyun.setPrice(50000000);
//		
//		kia.setCompany("기아자동차");
//		kia.setModel("K7");
//		kia.setColor("흰색");
//		kia.setMaxSpeed(246);
//		kia.setPrice(40000000);
//		
//		sam.setCompany("삼성자동차");
//		sam.setModel("SM7");
//		sam.setColor("회색");
//		sam.setMaxSpeed(200);
//		sam.setPrice(38000000);
		
		System.out.println(" << 자동차목록 >> ");
		System.out.println("제조사명 : " + hyun.getCompany());
		System.out.println("모델명 : " + hyun.getModel());
		System.out.println("색상 : " + hyun.getColor());
		System.out.println("최대속도 : " + hyun.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", hyun.getPrice()) + "원");
		System.out.println();
		System.out.println("제조사명 : " + kia.getCompany());
		System.out.println("모델명 : " + kia.getModel());
		System.out.println("색상 : " + kia.getColor());
		System.out.println("최대속도 : " + kia.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", kia.getPrice()) + "원");
		System.out.println();
		System.out.println("제조사명 : " + sam.getCompany());
		System.out.println("모델명 : " + sam.getModel());
		System.out.println("색상 : " + sam.getColor());
		System.out.println("최대속도 : " + sam.getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d", sam.getPrice()) + "원");
	}

}
