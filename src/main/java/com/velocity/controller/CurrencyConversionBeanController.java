package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.CurrencyConversionBean;
import com.velocity.service.CurrencyConversionBeanService;

@RestController
public class CurrencyConversionBeanController {
	
	//inject service 
	@Autowired
	private CurrencyConversionBeanService currencyConversionBeanService;
	
	/* Author:- Anushka */
	@PutMapping("/updateCurrencyConversion")
	public ResponseEntity<CurrencyConversionBean> updateCurrencyConversionBeanService( @RequestBody  CurrencyConversionBean currencyConversionBean)
	{
		CurrencyConversionBean currencyConversionBean2= currencyConversionBeanService.updateCurrencyConversionBean(currencyConversionBean);
		return ResponseEntity.ok().body(currencyConversionBean2);	
		
	}

	/* Author:- Madhurima */
	@DeleteMapping("/deleteconverter/{id}")
	public void deleteById(@PathVariable ("id") Long id) {
		conversionService.deleteById(id);
}
	
	/* Author Vishal*/
	@GetMapping("/getCurrencyConversion")
	public List<CurrencyConversionBean> getCurrencyConversionBean(){
		List<CurrencyConversionBean> currencyConversionBean=currencyConversionBeanService.getCurrencyConversionBean();
		return currencyConversionBean;
	}
	/* Author Vishal*/
	@PostMapping("/saveCurrencyConversion")
	public ResponseEntity<CurrencyConversionBean> addCurrencyConversionBean(@RequestBody CurrencyConversionBean currencyConversionBean) {
		CurrencyConversionBean currencyB=currencyConversionBeanService.addCurrencyConversionBean(currencyConversionBean);
		return ResponseEntity.ok().body(currencyB);
		
	}

}
