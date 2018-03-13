package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods pen = new Goods("제트스트림",1600);
		Goods computer = new Goods("LG그램",900000); 
		
		
		computer.showinfo();
		pen.showinfo();
		
		/*cup.showinfo();*/
		
		//----------------------------------------------------------------------------
		
		/*Goods computer = new Goods();
		Goods cup = new Goods();*/
		
		/*computer.name ="LG그램";
		computer.price = 900000;
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.print("상품이름: " + "\""+computer.name+"\""+ "\t");
		System.out.println("가격: " + computer.price);
		
		System.out.print("상품이름: " + "\""+cup.name+"\""+"\t");
		System.out.println("가격: " + cup.price);*/
		
		/*computer.setName("LG그램");
		computer.setPrice(900000);*/
		
		/*cup.setName("머그컵");
		cup.setPrice(2000);*/
		
		
		/*System.out.print("상품이름: " + "\""+computer.getName() +"\""+ "\t");
		System.out.println("가격: " + computer.getPrice());
		
		System.out.print("상품이름: " + "\""+cup.getName()+"\""+"\t");
		System.out.println("가격: " + cup.getPrice());*/
	}   

}
