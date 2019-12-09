package com.np.springws.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.np.springws.controller.StockQuoteResponse;

@RestController
@RequestMapping("/greeting")
public class MyController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String greet(@PathVariable String name) {
		return "Hello!! "+name;
	}
	
	@RequestMapping(value = "/stockquote/{firmName}", method = RequestMethod.GET)
	public StockQuoteResponse getStockQuote(@PathVariable String firmName) {
		StockQuoteResponse stockQuoteResponse = new StockQuoteResponse();
		stockQuoteResponse.setFirmName(firmName);
		stockQuoteResponse.setStockValue(1000);
		
		return stockQuoteResponse;
	}

}
