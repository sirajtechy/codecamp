package com;

import java.io.BufferedReader;
import java.io.FileReader;

public class FindSpecificString {

	
	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\siraj\\Desktop\\txtfile.txt" ;
		String findString ;
		
		try {
			
			BufferedReader bufferReader = new BufferedReader(new FileReader(fileName));
			
			findString = bufferReader.readLine();
			
			while(findString != null ){
				
				System.out.println("Full Text :" + findString);	
				
				if(findString.equals("Allah")){
					
					System.out.println("Before Replace:" + findString);
					
					
				}
				
			String replaceString =	findString.replace("Allah", "Azawajal");
				System.out.println("After Replacing:" + replaceString);
				
					findString = bufferReader.readLine();
					
			}
			
			bufferReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
}
