package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	
	public Goods(String n, int p) {
		name = n;
		price = p;
	}
	
	//메소드
	public void setName(String n) {
		name = n;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//값을 넣고 출력하는것만 만드는 것이 아님
	//필요하면 다 만들 수 있음
	
	//한 번에 출력하는 메소드
	public void showinfo() {
		//인스턴트화 된 name,price의 내용값
		System.out.print("상품이름: " + "\""+name+"\""+"\t"); 
		System.out.println("가격: " + price);
		
		
	//--------------------------------------------------------------------	
		/*
		 * public Goods() {}라는 생성자가 숨겨져있음
		 * 
		 */
		
		/*public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}*/
		
	//----------------------------------------------------------------------	
		/*
		 * public Goods(String name) {
		 * this.name = name;
		 * 
		 * public Goods(String name, int price) {
		 * this(name); //다른 생성자의 name을 부름
		 * this.price = price;
		 * 
		 */
	}
}
