package com.asif.thread_ITCscenario;

public class Waiter extends Thread
{
  private Restaurant restaurant;
  private String orderName;
  
public Waiter(Restaurant restaurant)
{
	super();
	this.restaurant = restaurant;
	
}
  
  public void acceptOrder(String orderName)
  {
	  this.orderName = orderName;
	  System.out.println("Waiter: Placed order for "+orderName);
  }
  @Override
  public void run()
  {
	  restaurant.placeOrder(orderName);
  }
  
}
