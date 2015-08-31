/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	l_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 31.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "Apple", 700000),
				new Galaxy("Galaxy S6", "SAMSUNG", 650000),
		};
		for(SmartPhone phone : phones){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			System.out.println();
		}
	}

}
