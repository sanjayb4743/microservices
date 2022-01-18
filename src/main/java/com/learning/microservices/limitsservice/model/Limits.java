package com.learning.microservices.limitsservice.model;

public class Limits {

	private int max;
	/**
	 * @param max
	 * @param min
	 */
	public Limits(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	private int min;
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
}
