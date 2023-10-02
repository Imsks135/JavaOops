/**
 * 
 */
package com.cgi.collections;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 * @author IMSKS
 *
 */
public class TestDQ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Deque<String> dq= new ArrayDeque<String>();
         dq.add("a");
         dq.add("b");
         
         Deque<Integer> dq1= new ArrayDeque<Integer>();
         dq1.add(1);
         dq1.add(2);
         
         for(String str:dq) {
        	 System.out.println(str);
         }
         
         for(Integer i:dq1) {
        	 System.out.println(i);
         }
	}
}
