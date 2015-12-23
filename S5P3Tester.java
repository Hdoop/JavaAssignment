package com.assignment.example;

public class S5P3Tester {

	public S5P3Tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		S5P3Flat flt1 =new S5P3Flat("Towers Flat ", "White", "23.259933,77.412615", true, 15, "Semi Furnished", 10000, 5000);
		flt1.Display();
		
		S5P3Flat flt2 =new S5P3Flat("Builer Flat ", "Silver", "23.259933,77.412615", true, 7, "Furnished", 5000, 2500);
		flt2.Display();
		S5P3Flat flt3 =new S5P3Flat("Builer Flat ", "Silver", "23.259933,77.412615", true, 7, "Furnished", 5000, 2500);
		flt3.Display();
		
		
	}

}
