/**
 * 
 */
package com.cgi.collections;
import java.util.*;

/**
 * @author IMSKS
 *
 */
public class DuplicatesIteration {
	public static <T> Set<T> findDuplicate(Collection<T>collection){
		Set<T> duplicatest=new HashSet<>();//To find duplicate in minimum time we can use HashSet
		Set<T> uniquest=new HashSet<>();//HashSet provides constant time complexity to add and contain operation
		
		for(T item: collection) {
			if(!uniquest.add(item)) {
				duplicatest.add(item);
			}
		}
		return duplicatest;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           List<Integer> num= Arrays.asList(1,2,2,3,3,4,5,5);
           Set<Integer> st= findDuplicate(num);
           System.out.println("Duplicates are:");
           System.out.println(st);
	}

}
