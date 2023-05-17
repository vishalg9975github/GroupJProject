package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.service.CurrencyConversionService;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyConversionService conversionService;
	
	@DeleteMapping("/deleteconverter/{id}")
	public void deleteById(@PathVariable ("id") Long id) {
		conversionService.deleteById(id);
}
}
