/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	l_ Circle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class Circle extends Figure{
	private int radius;
	
	public Circle(int radius)
	{
		super(0,0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius)
	{
		super(centerX,centerY);
		this.radius = radius;
	}
	
	protected double calcArea()
	{
		double res = Math.PI * radius * radius;
		System.out.println("원의 넓이 : " + String.format("%.1f", res));
		return res;
	}
	
	protected void printCenter()
	{
		System.out.print("원 ");
		super.printCenter();
	}
}
