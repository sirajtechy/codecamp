package com;

public class ReverseString {
	public static void main(String[] args) {
		
		String original,reverse = "";
		original ="Mercy on you";
		int length = original.length();
		
		for(int i= (length-1) ; i>=0 ; i--){
			
			reverse = reverse + original.charAt(i);
		}
		  
		
		System.out.println("Original String :" + original );
		System.out.println("Reverse String :" +  reverse  );
	}

}
