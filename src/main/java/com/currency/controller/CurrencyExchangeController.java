package com.currency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.currency.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private CurrencyExchangeService service;

	@GetMapping("/getConvert")
	public String  callcurrencyExchange() {

		String response = service.invokeCurrencyExchangeService();
		return response;

	}
	
	

}
