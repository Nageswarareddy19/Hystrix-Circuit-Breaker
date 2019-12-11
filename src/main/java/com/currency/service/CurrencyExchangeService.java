package com.currency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CurrencyExchangeService {

	private static final String CURRENCY_EXCHANGE_URL = "https://cexchange.cfapps.io/findCurrencyFromAndTo/from/{from}/to/{to}";

	@Autowired
	private WebClient client;

	@HystrixCommand(fallbackMethod = "fallbackCurrencyExchange")
	public String invokeCurrencyExchangeService() {

		String jsonResponse = client.get().uri(CURRENCY_EXCHANGE_URL, "KWD", "INR").retrieve().bodyToMono(String.class)
				.block();

		return jsonResponse;

	}

	public String fallbackCurrencyExchange() {
		return "Currency Exchage Service is down.Please try some other time";

	}

}
