package com.ewaiter.model.order;

import java.util.List;

import com.ewaiter.model.BaseModel;
import com.ewaiter.model.user.Client;

public class Order extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8063238327336251973L;
	
	private OrderStatus status = OrderStatus.Verifying;
	
	private int numberOfClients;
	
	private Client contact;
	
	private List<Serve> serves;
	
	private double total;
	
	private double discount;
	
	private double payment;
}
