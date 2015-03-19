package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="아이유";
		boolean gender = false;
		int age=23;
		double height = 161.8;
		float weight = (float) 44.3;
		char ch = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		if(gender){
			System.out.println("성별 : 남자");
		}else{
			System.out.println("성별 : 여자");
		}
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + " cm");
		System.out.println("몸무게 : " + weight + " kg");
		System.out.println("혈액형 : " + ch + " 형");
	}

}
