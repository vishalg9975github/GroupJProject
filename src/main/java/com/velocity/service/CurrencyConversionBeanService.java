package com.velocity.service;

import com.velocity.model.CurrencyConversionBean;

public interface CurrencyConversionBeanService {
	
	public CurrencyConversionBean updateCurrencyConversionBean(CurrencyConversionBean currencyConversionBean);

	/* Author Madhurima */
	public void deleteById(Long id);
}
