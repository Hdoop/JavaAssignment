package com.assignment.example;

import java.util.*;

public class CollHashSet {

	public CollHashSet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSetExp hset =new HashSetExp();
		Iterator l =hset.lst.iterator() ;
		System.out.println(">>>>>>>>>Unorder List");		
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		List<String>gl = hset.GetGeneric();
		
		Iterator l2 =gl.iterator() ;
		System.out.println(">>>>>>>>>Order List");		
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		
		
		
	}
	
}
class HashSetExp
{
	HashSet lst =new HashSet();
	List<String> glist =new ArrayList<String>();
	HashSetExp()
	{
		lst.add("10th BOSE");		
		lst.add("12th PCM");
		lst.add("B.Sc");
		lst.add("MCA");
		lst.add("MTech");
	}
	List<String> GetGeneric(){
		glist.add("10th BOSE");		
		glist.add("12th PCM");
		glist.add("B.Sc");
		glist.add("MCA");
		glist.add("MTech");
		
		
		return glist; 
	}
	
}