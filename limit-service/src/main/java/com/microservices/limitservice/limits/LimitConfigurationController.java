package com.microservices.limitservice.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	
//Aded some comments for more calrification
	@Autowired
	private LimitsApplPropConfiguration limitValues;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsForCofig() {
		return new LimitConfiguration(limitValues.getMinimum(), limitValues.getMaximum());
	}
}
