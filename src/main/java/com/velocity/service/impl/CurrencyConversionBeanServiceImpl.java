package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.CurrencyConversionBean;
import com.velocity.repository.CurrencyConversionBeanRepository;
import com.velocity.service.CurrencyConversionBeanService;

@Service
public class CurrencyConversionBeanServiceImpl implements CurrencyConversionBeanService {

	// inject the reference of CurrencyConversionBeanRepository
	@Autowired
	private CurrencyConversionBeanRepository currencyConversionBeanRepository;

	/* Author:- Anushka */
	@Override
	public CurrencyConversionBean updateCurrencyConversionBean(CurrencyConversionBean currencyConversionBean) {
		long id = currencyConversionBean.getId();
		CurrencyConversionBean currencyConversionBean2 = currencyConversionBeanRepository.findById(id).get();
		currencyConversionBean2.setFrom(currencyConversionBean.getFrom());
		currencyConversionBean2.setTo(currencyConversionBean.getTo());
		currencyConversionBean2.setConversionMultiple(currencyConversionBean.getConversionMultiple());
		currencyConversionBean2.setQuantity(currencyConversionBean.getQuantity());
		currencyConversionBean2.setTotalCalculatedAmount(currencyConversionBean.getTotalCalculatedAmount());
		currencyConversionBean2.setPort(currencyConversionBean.getPort());

		return currencyConversionBeanRepository.save(currencyConversionBean2);

	
	}
	/*  Author:- Madhu */
		@Override
	public void deleteById(Long id) {
		conversionRepository.deleteById(id);
	}

}
