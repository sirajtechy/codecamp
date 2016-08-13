package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListSampleExample {
	public static void main(String[] args) {

		String [] coin = {"1","2","3" ,"4" ,"5" };
		
		List list = new ArrayList();
		
		for (int i = 0 ; i< coin.length ;i ++)
		
			list.add(coin[i]);
		
		ListIterator iIterator = list.listIterator();
		System.out.print("List:");
		while(iIterator.hasNext()){
			System.out.print( iIterator.next());
		}
	
		Collections.reverse(list);
		
		
		iIterator = list.listIterator();
		System.out.print("\nAfter Reversal:");
		while(iIterator.hasNext()){
			System.out.print( iIterator.next());
		}
		
		
		
	}
	
	

}
