package com.assignment.example;

public class S5P3SBIBank extends S5P3Bank {

	public S5P3SBIBank(double roi) {
		// TODO Auto-generated constructor stub
		super.setRoi(roi);
	}
	@Override
	public double getRateOfInterest()
	{
		return super.getRoi();
	}
}
