package Javahomework2.cn.epam.javahometask2;

import Javahomework2.cn.epam.javahometask2.Bouquet;;


public class Flower extends Bouquet{
	
	Bouquet flowerbasket;

	int price;
	int quantity;
	
	
	public Flower(String name) {
		super(name);
	}

	public Flower(String name, int price, int quantity, Bouquet flowerbasket){
		super(name);
		this.price = price;
		this.quantity = quantity;
		this.flowerbasket = flowerbasket;
			
	}
	
	public Bouquet getflowerbasket() {
		return flowerbasket;
	}

	public void setflowerbasket(Bouquet flowerbasket) {
		this.flowerbasket = flowerbasket;
	}
		
	public int getPrice(){
		return price;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	
	
	public int addFlowersToBouquet() {
		return this.price*this.quantity;
	}
	
	public String getinfo(){
		return this.quantity + " " + this.name +" with Unit Pirce: " + this.price;
	}
	
	

}


