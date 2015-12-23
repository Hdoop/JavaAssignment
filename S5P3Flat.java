package com.assignment.example;

public class S5P3Flat extends S5Part3Building {

	private double len;

	public S5P3Flat() {
		// TODO Auto-generated constructor stub
	}
	public S5P3Flat(String type,String color,String loc,boolean islift,int nooffloor,String finishing,double len ,double bre) {
		// TODO Auto-generated constructor stub
		this.setType(type);
		this.setColor(color);
		this.setLoc(loc);
		this.setIslift(islift);
		this.setLen(len);
		this.setBre(bre);
		this.setNooffloors(nooffloor);
		this.setFurnishing(finishing);
		
	}
	
	public S5P3Flat(double len ,double bre) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double CalArea()
	{
		return this.getLen()*this.getBre();
	}
	public void Display()
	{
		System.out.println("I am "+this.getType());
		System.out.println("Located at lanlat."+this.getLoc());
		System.out.println("Painted with ."+this.getColor());
		System.out.println("Having no of floor."+this.getNooffloors());
		System.out.println("Also Lift "+this.getIslift());
		System.out.println("Finishing Is "+this.getFurnishing());
		System.out.println("Area Is"+this.CalArea());
		System.out.println("--------------------------------xxx-------------------------------------");
		
	}
}
