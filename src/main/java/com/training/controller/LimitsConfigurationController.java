package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.LimitConfiguration;
import com.training.utils.Configurations;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configurations configurations;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		return new LimitConfiguration(configurations.getLimitServiceMaximum(), configurations.getLimitServiceMinimum());

	}

}
