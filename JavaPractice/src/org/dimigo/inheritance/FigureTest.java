/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	l_ FigureTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class FigureTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println("원의 넓이 : "+c.calcArea());
		System.out.println("삼각형 넓이 : "+t.calcArea());
		System.out.println("사각형 넓이 : "+r.calcArea());
	}
}
