package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="������";
		boolean gender = false;
		int age=23;
		double height = 161.8;
		float weight = (float) 44.3;
		char ch = 'A';
		
		System.out.println("<< ������ ������ >>");
		System.out.println("�̸� : " + name);
		if(gender){
			System.out.println("���� : ����");
		}else{
			System.out.println("���� : ����");
		}
		System.out.println("���� : " + age + "��");
		System.out.println("Ű : " + height + " cm");
		System.out.println("������ : " + weight + " kg");
		System.out.println("������ : " + ch + " ��");
	}

}
