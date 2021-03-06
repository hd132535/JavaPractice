/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 * 	l_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 21.
 * </pre>
 *
 * @author : 최수빈
 * @version : 1.0
 */
public class Movie {
	private String title;
	private int limitAge;

	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}
}
