package com.assignment.example;

public class Rectangle extends Shape {

	public Rectangle() {
		// TODO Auto-generated constructor stub
		super("Rectangle");
	}
	public Rectangle(double len,double bre) {
		super("Rectangle");
		setLen(len);
		setBre(bre);
	}
	private double bre;
	public double getBre() {
		return bre;
	}
	public void setBre(double bre) {
		this.bre = bre;
	}
	private double len;
	public double getLen() {
		return len;
	}
	public void setLen(double len) {
		this.len = len;
	}
	@Override
	public double Area() {
		Double area=getLen()*getBre();
		return area;
	}
}
