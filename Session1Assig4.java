package com.assignment.example;

public class Session1Assig4 {

	public Session1Assig4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Assume that the integer variable x is 5 and the integer variable y is 10. Give the values of the following
//expressions:
//	a. x + y * 2
//	b. x - y + 2
//	c. (x+y) * 2
//	d.  y % x

		int x =5,y=10;
		Expression("x + y * 2",x,y);
		Expression("x - y + 2",x,y);
		Expression("(x+y) * 2",x,y);
		Expression("y % x",x,y);
	}
	public static void Expression(String exp,int x ,int y)
	{
		System.out.println(exp);
		switch(exp)
		{
			case "x + y * 2":
				System.out.printf("Exp %s Value Is %s\n", exp,x + y * 2);
				break;
			case "x - y + 2":
				System.out.printf("Exp %s Value Is %s\n", exp,x - y + 2);
				break;
			case "(x+y) * 2":
				System.out.printf("Exp %s Value Is %s\n", exp,(x+y) * 2);
				break;
			case "y % x":
				System.out.printf("Exp %s Value Is %s\n", exp,y % x);
				break;
		}
		
	}
	

}
