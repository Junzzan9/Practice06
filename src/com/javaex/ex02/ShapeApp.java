package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		//부모 생성자 파라미터 2개짜리 실행 = 2
		
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		//부모 디폴트 생성자+자식디폴트생성자= 0,t0
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		//부모 2생성자 입력,자식 2생성자 실행= 2,t2
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		//부모 2생성자 실행 ,자식 4생성자 실행 = 2,t4  
		
	}

}

