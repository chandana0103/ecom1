package com.abc.ecom1.service;

import com.abc.ecom1.entity.Order;

public interface OrderService {
	
	//public Order addOrder(Order order);
	
	public Order saveOrder(Order order);
	
	public  Order getOrderDetails(int orderId);

}
