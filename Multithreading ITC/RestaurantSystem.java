package com.asif.thread_ITCscenario;

public class RestaurantSystem 
{
	public static void main(String[] args) 
	{
	  Restaurant r = new Restaurant("KFC","Burger");
	  Waiter w = new Waiter(r);
	  Chef c = new Chef(r);
	  System.out.println("Welcome to "+r.getRestaurantName()+" Restaurant!!!");
	  w.acceptOrder("Burger");
	  w.start();
	  c.start();
	  
	  
	}

}
