package com.assignment.example;

public class S5P3Poly {

	public S5P3Poly(double side) {
		this.setSize(side);
	}
	public S5P3Poly(double len,double bre) {
		this.setLen(len);
		this.setBre(bre);
	}
	public double SquarArea()
	{
		return this.getSize()*this.getSize();
	}
	public double RectangleArea()
	{
		return this.getLen()*this.getBre();
	}
	private double size;
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	private double len;
	public double getLen() {
		return len;
	}
	public void setLen(double len) {
		this.len = len;
	}
	private double bre;
	public double getBre() {
		return bre;
	}
	public void setBre(double bre) {
		this.bre = bre;
	}
}
