package com.assignment.example;

public class Triangle extends Shape {

	private Triangle() {
		// TODO Auto-generated constructor stub
		super("Triangle");
	}
	public Triangle(double bas,double alti) {
		super("Triangle");
		setBase(bas);
		setAltitue(alti);
		
	}
	private double bas;
	public double getBase() {
		return bas;
	}
	public void setBase(double bas) {
		this.bas = bas;
	}
	private double alti;
	public double getAltitude() {
		return alti;
	}
	public void setAltitue(double alti) {
		this.alti = alti;
	}
	@Override
	public double Area() {
		//System.out.println("Area of Rectangle Is:"+area);
		
		Double area=(1/2.0)*(getBase()*getAltitude());
		
		return area;
	}

}
