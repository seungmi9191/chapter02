package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		/*Point point1 = new Point();
		Point point2 = new Point();*/
		
		//기본 생성자를 사용 시 아래에 사용한 생성자와 매개변수가 다르기때문에 사용가능!
		//그러나 기본 생성자 사용시에 setter,getter를 사용하지않으면 값을 넣을 수 없다.
		//Point point3 = new Point();
		
		//생성자
		Point point1 = new Point(5,5);
		Point point2 = new Point(10,23);
		
		/*point3.setXpoint(5);
		point3.setYpoint(5);*/
		
		/*point2.setXpoint(10);
		point2.setYpoint(23);*/
		
		point1.draw();
		point2.draw();
		//point3.draw();
	}

}
