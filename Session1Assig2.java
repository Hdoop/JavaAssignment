package com.assignment.example;

public class Session1Assig2 {

	public Session1Assig2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Give two examples of data that cannot be stored in a variable of type int.
		int _int ;
		long _long;
		_int =_long ;//Can't store long to int
		String _string;
		_string =_long;//Can't store long to string
		
		_int =_string;
		_long =_int;
		
		double _deci ;
		float _flt ;
		_deci=_flt;//Possible 
		_flt =_deci;// Not Possible 
		
		_int =_flt;//Not Possible
		_int=(int)_flt;//Downcasting or explisit conversion
		
		
		

	}

}
