package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	
	private String part;
	
	public Depart() {
		
	}
	
	public Depart(String name,int salary,String part) {
		super(name,salary);
		this.part=part;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
	public void showInformation() {
		System.out.println("이름: "+super.getName()+" 연봉: "+super.getSalary()+" 부서:"+part);
	}
	
}
