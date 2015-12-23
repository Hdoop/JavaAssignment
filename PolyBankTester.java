package com.assignment.example;

public class PolyBankTester {

	public PolyBankTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		S5P3Bank banksbi =new S5P3SBIBank(10.50);
		System.out.println("SBI ROI Is : "+banksbi.getRateOfInterest());
		
		S5P3Bank bankpnb =new S5P3PNB(10.50);
		System.out.println("PNB ROI Is : "+bankpnb.getRateOfInterest());
		
		S5P3Bank bankhdfc =new S5P3HDFC(10.50);
		System.out.println("HDFC ROI Is : "+bankhdfc.getRateOfInterest());
		
	}

}
