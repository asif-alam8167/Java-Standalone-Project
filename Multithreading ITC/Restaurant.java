package com.asif.thread_ITCscenario;

public class Restaurant
{
  private String name;
  private String order;
  private boolean isOrderReady = false;
  
public Restaurant(String name,String order) 
{
	super();
	this.name = name;
	this.order = order;
}

public synchronized void placeOrder(String order)
{
    this.order = order;
    try
    {
    while(!isOrderReady)
    {
    	wait();
    }
    System.out.println("Chef: "+order+" is ready!");
    
    }
    catch(InterruptedException e)
    {
    	System.out.println(e);
    }
     if(isOrderReady==true)
     {
    	 System.out.println("Waiter: Serving the "+this.order);
     }
    }
	
public synchronized void prepareOrder()
{
	try
	{
		Thread.sleep(5000);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	this.isOrderReady = true;
	notify();
}

public String getRestaurantName()
{
	return this.name;
}

public String getOrder() {
	return order;
}



}
