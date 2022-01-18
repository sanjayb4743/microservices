/**
 * 
 */
package com.learning.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.limitsservice.configuration.Configuration;
import com.learning.microservices.limitsservice.model.Limits;

/**
 * @author sanjay
 *
 */
@RestController
public class LimitsContoller {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
		return new Limits(configuration.getMin(),configuration.getMax());
		
	}

}
