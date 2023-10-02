package com.cgi.collections;

import java.util.Iterator;
import java.util.TreeSet;
public class TestSortedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("mukesh");
		ts.add("suresh");
		ts.add("satyam");
		ts.add("shyam");
		
		TreeSet<Integer>ts1=new TreeSet<Integer>();
		ts1.add(4);
		ts1.add(5);
		ts1.add(6);
		ts1.add(7);
		Iterator<String>it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator<Integer>it1=ts1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
         
	}

}
