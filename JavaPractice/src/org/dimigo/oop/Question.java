/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	l_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class Question {
	public static void main(String[] args) {   
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		if(scanner.nextLine().equals("AOA")) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		if(scanner.nextLine().equals("수학")) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
		
		System.out.println("가장 좋아하는 프로게이머는?");
		if(scanner.nextLine().equals("홍민기")) {
			System.out.println("정답입니다!! ^^");
		} else {
			System.out.println("틀렸습니다!! ㅠㅠ");
		}
		scanner.close();
	}

}
