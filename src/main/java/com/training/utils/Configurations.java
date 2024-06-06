package com.training.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configurations {

//	@Value("${limits-service-minimum}")
	private int limitServiceMinimum;
//	@Value("${limits-service-maximum}")
	private int limitServiceMaximum;

	public int getLimitServiceMinimum() {
		return limitServiceMinimum;
	}

	public void setLimitServiceMinimum(int limitServiceMinimum) {
		this.limitServiceMinimum = limitServiceMinimum;
	}

	public int getLimitServiceMaximum() {
		return limitServiceMaximum;
	}

	public void setLimitServiceMaximum(int limitServiceMaximum) {
		this.limitServiceMaximum = limitServiceMaximum;
	}

}
