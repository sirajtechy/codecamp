package com;

import java.util.ArrayList;

public class ForLoop {
	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("siraj");
		al.add("luqman");
		al.add("shaheen");
	
	for(String myFamily: al){
		
		System.out.println("myFamily:::"+myFamily);
		System.out.println("");
	}
}} 	