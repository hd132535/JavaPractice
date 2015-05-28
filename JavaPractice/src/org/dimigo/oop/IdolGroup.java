/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	l_ IdolGroup
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 28.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] idolGroup = {"AOA", "걸스데이", "SKT T1"};
		
		String[][] members = {
				{"설현", "지민", "유나", "초아", "혜정", "민아", "찬미", "유경"},
				{"유라", "혜리", "소진", "민아"},
				{"Bengi", "Faker", "Piglet", "Poomandu", "Impact"}
		};
		
		for(int i=0;i<3;i++) {
			System.out.println("<< " + idolGroup[i] + " >>");
			for(int j=0;j<members[i].length;j++) {
				System.out.println(members[i][j]);
			}
			System.out.println();
		}
	}

}
