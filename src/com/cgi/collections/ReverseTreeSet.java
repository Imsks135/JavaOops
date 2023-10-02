/**
 * 
 */
package com.cgi.collections;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @author IMSKS
 *
 */
public class ReverseTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
         ts.add("one");
         ts.add("two");
         ts.add("two");
         ts.add("three");
         ts.add("four");
         
         TreeSet<Integer> ts1 = new TreeSet<Integer>(Collections.reverseOrder());
         ts1.add(1);
         ts1.add(2);
         ts1.add(3);
         ts1.add(4);
         
         ts.forEach(System.out::println);
         ts1.forEach(System.out::println);
		
	}

}
