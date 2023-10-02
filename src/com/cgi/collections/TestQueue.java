/**
 * 
 */
package com.cgi.collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author IMSKS
 *
 */
public class TestQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q1 =new PriorityQueue<String>();
		q1.add("suresh");
		q1.add("mukesh");
		q1.add("dharmendra");
		q1.add("dharmesh");
		//q1.add(null);
		
		System.out.println("element:"+ q1.element());
		System.out.println("peek:"+ q1.peek());
		
		Iterator it=q1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
        
		//q1.remove();
		q1.poll();
		System.out.println("After removing elements:");
		Iterator<String> it1=q1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
