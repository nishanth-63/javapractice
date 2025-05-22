package com.coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsPractice {
	//List
	/*
	 * 
	 * List is the child interface of Collection -> If we want to represent a group of individual objects where duplicates are allowed  and 
	 * insertion order is preserved. Then we should go for List. 
	 * 
	 * 1.ArrayList 
	 * ArrayList is an implementation class of Collection interface  
	 * ->The underlying data structure is resizable (Internally it will use Array to store data) 
	 * -> Duplicate Objects are allowed 
	 * -> Insertion order is preserved 
	 * -> Heterogeneous Objects are allowed 
	 * -> Null insertion is possible 
	 */
	
	
	
	 
	public static void main(String args[]) {
		ArrayList<Studentdetails> al=new ArrayList();
		al.add(new Studentdetails(101,"Nishanth",913345456));
		al.add(new Studentdetails(102,"Imran",913349888));
		al.add(new Studentdetails(103,"Rakesh",913378490));
		al.add(new Studentdetails(104,"Rohit",913345469));
		
		
		ArrayList bl=new ArrayList(Arrays.asList(1,2,4,6,8,7,5));
		
		
		Iterator<Studentdetails> iterator=al.iterator();
		
		//System.out.println(al);
		while(iterator.hasNext()) {
			if(iterator.next().studentId>102) {
				System.out.println(iterator.next());
			}
			
		}
		System.out.println("Hello");
		
	}

}

class Studentdetails{
	int studentId;
	String studentName;
	int studentNumber;
	public Studentdetails(int id,String name,int number) {
		this.studentId=id;
		this.studentName=name;
		this.studentNumber=number;
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.studentId+"-"+this.studentName+"-"+this.studentNumber;
	}
}
