package com.assignment.example;

public class S5P3PolyTester {

	public S5P3PolyTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S5P3Poly tester =new S5P3Poly(300);
		System.out.println("Area of squar having side is "+tester.getSize());
		double sqar =tester.SquarArea();
		System.out.println(sqar);
		
		S5P3Poly tester1 =new S5P3Poly(300,200);
		System.out.println("Area of rectangle having length is "+tester.getLen()+" and breadth is "+tester1.getBre());
		double recar =tester1.RectangleArea();
		System.out.println(recar);
		
	}
	
	

}
