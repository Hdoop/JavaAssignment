package com.assignment.example;

import java.util.*;

public class Collection {

	public Collection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCollection col =new MyCollection();
		col.AddSkills();
		Iterator l =col.lst.iterator() ;
		System.out.println("My Skills");		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
		//Add item to Existing List
		col.AddItem("Big Data");
		l =col.lst.iterator() ;
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		
	}
	
}
class MyCollection
{
	List lst =new ArrayList<String>();
	MyCollection()
	{
	}
	void AddSkills()
	{
		lst.add(".Net");
		lst.add("C#");
		lst.add("WPF");
		lst.add("WCF");
		lst.add("WINForm");
		lst.add("ASP");
		lst.add("ASP MVC");
		lst.add("Java Script");
		lst.add("NodeJs");
		lst.add("JQuery");
		lst.add("Ajax");
		lst.add("Sql Server");
		lst.add("MongoDb");
		lst.add("Java");
		lst.add("Android Development");
		lst.add("SAS");
		lst.add("SSRS");
		lst.add("SSIS");
		lst.add("Bootstrap");
		lst.add("AngularJs");		
	
	}
	List<String> AddItem(String str)
	{
		lst.add(str);
		return lst;
	}
	
}

