/**
 * 
 */
package org.dimigo.oop;

import java.util.*;
/**
 * <pre>
 * org.dimigo.oop
 * 	l_ Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 14.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.print("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.print("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		System.out.println("");
		
		String sb = new StringBuilder()
		.append("<< 점수 출력 >>\n")
		.append("국어 점수 : ")
		.append(kor)
		.append(" 점\n")
		.append("수학 점수 : ")
		.append(math)
		.append(" 점\n")
		.append("영어 점수 : ")
		.append(eng)
		.append(" 점\n")
		.append("총점 : ")
		.append(kor+math+eng)
		.append(" 점\n")
		.append("평균 : ")
		.append(String.format("%.1f",(float)(kor+math+eng)/3))
		.append(" 점\n").toString();
		
		System.out.println(sb);
		scanner.close();
	}

}
