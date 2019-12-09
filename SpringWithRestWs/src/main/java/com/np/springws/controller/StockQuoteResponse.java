package com.np.springws.controller;

public class StockQuoteResponse {
	
	private String firmName = null;
	private int stockValue = 0;
	
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public int getStockValue() {
		return stockValue;
	}
	public void setStockValue(int stockValue) {
		this.stockValue = stockValue;
	}
	
	
	
}//class
