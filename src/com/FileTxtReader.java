package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTxtReader {
	public static void main(String[] args) {
		
		 
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\siraj\\Desktop\\txtfile.txt")))
		{

			
		
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			System.out.println(sCurrentLine.length());	
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 


}} 	