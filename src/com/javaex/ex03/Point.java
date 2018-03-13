package com.javaex.ex03;

public class Point {

	private int xpoint;
	private int ypoint;
	
	public Point() {
		
	}
	
	//기본 생성자와 모든 필드를 초기화할 수 있는 생성자 작성
	public Point(int x, int y) {
		xpoint = x;
		ypoint = y;
	}
	
	//getter&setter를 사용하면 외부로 값을 읽고 쓸 수 있지만 사용하지 않는다면 private인 이상 값에 접근 못함!
	/*public void setXpoint(int x) {
		xpoint = x;
	}
	
	public int getXpoint() {
		return xpoint;
	}
	
	public void setYpoint(int y) {
		ypoint = y;
	}
	
	public int getYpoint() {
		return ypoint;
	}*/
	
	public void draw() {
		System.out.println("점 [x=" + xpoint + ", y=" + ypoint+"]을 그렸습니다.");
	}
}
