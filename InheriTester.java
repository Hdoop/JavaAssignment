package com.assignment.example;

public class InheriTester {

	public InheriTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Shape shp =new Triangle(200,100);
		double ta =shp.Area();
		System.out.print("Area :");
		System.out.println(ta+" Sqft");
		
		Shape shp1 =new Rectangle(12,19);
		double ra =shp1.Area();
		System.out.print("Area :");
		System.out.println(ra+" Sqft");

	}

}
