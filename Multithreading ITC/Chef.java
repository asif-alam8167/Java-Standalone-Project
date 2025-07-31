package com.asif.thread_ITCscenario;

public class Chef extends Thread
{
  private Restaurant restaurant;

public Chef(Restaurant restaurant)
{
	super();
	this.restaurant = restaurant;
}
@Override
public void run()
{
	restaurant.prepareOrder();
	System.out.println("Chef : preparing "+restaurant.getOrder());
}

  
}
