package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	public void service(String state) {
		
		if(state.equals("낮")) {
			day();
		}
		else if(state.equals("밤")) {
			night();
		}
		else {
			afternoon();
		}
		
	}
	public void day() {
        System.out.print("낮");
        System.out.println("에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.print("밤");
    	System.out.println("에는 숙면");
    }
    public void afternoon() {
    	System.out.print("오후");
    	System.out.println("도 낮과 마찬가지로 공부해야합니다.");
    	System.out.println();
    }
    
}
