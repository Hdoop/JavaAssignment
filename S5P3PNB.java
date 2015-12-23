package com.assignment.example;

public class S5P3PNB extends S5P3Bank {

	public S5P3PNB(double roi) {
		// TODO Auto-generated constructor stub
		super.setRoi(roi);
	}
	@Override
	public double getRateOfInterest()
	{
		return super.getRoi();
	}
}
