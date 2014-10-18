package com.ewaiter.model.order;

public enum OrderStatus {
	Verifying("等待确认"),
	Preparing("正在制作"),
	Serving("正在用餐"),
	Clear("已结算")
	;
	
	private OrderStatus(String description) {
		this.description = description;
	}
	
	private String description = "";

	public String getDescription() {
		return description;
	}
	
}
