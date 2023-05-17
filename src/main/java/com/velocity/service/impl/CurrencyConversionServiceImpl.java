package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.repository.CurrencyConversionRepository;
import com.velocity.service.CurrencyConversionService;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	private CurrencyConversionRepository conversionRepository;
	@Override
	public void deleteById(Long id) {
		conversionRepository.deleteById(id);
	}

}
