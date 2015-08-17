/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	l_ Triangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class Triangle extends Figure{
	private int width;
	private int height;
	
	Triangle(int width, int height)
	{
		super(0,0);
		this.width = width;
		this.height = height;
		calcArea();
	}
	
	Triangle (int CenterX, int CenterY, int width, int height)
	{
		super(CenterX, CenterY);
		this.width = width;
		this.height = height;
		calcArea();	
	}
	
	protected double calcArea()
	{
		return height * width * 0.5;
	}
}
