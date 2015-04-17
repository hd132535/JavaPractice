package org.dimigo.oop;

/*
 * <pre>
 * org.dimigo.oop
 * 		|_ Car2
 * 1. 개요 : 
 * 2. 작성일 : 2015. 4. 16.
 * </pre>
 * @author 최수빈
 *
 */
public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2() {
		
	}
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newprice){
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newprice;
	}
	
//	public void setCompany(String newCompany){
//		company = newCompany;
//	}
	public String getCompany(){
		return company;
	}
//	public void setModel(String newModel){
//		model = newModel;
//	}
	public String getModel(){
		return model;
	}
//	public void setColor(String newColor){
//		color = newColor;
//	}
	public String getColor(){
		return color;
	}
//	public void setMaxSpeed(int newMaxSpeed){
//		maxSpeed = newMaxSpeed;
//	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
//	public void setPrice(int newPrice){
//		price = newPrice;
//	}
	public int getPrice(){
		return price;
	}
}