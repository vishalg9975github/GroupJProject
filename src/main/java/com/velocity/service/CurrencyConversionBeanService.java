package com.velocity.service;

import com.velocity.model.CurrencyConversionBean;

public interface CurrencyConversionBeanService {
	
	/*Author Anushka */
	public CurrencyConversionBean updateCurrencyConversionBean(CurrencyConversionBean currencyConversionBean);
	/* Author Madhurima */
	public void deleteById(Long id);
	/* Author Vishal */
	public CurrencyConversionBean addCurrencyConversionBean(CurrencyConversionBean currencyConversionBean);
}
