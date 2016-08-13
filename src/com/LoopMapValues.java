package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/*public class LoopMapValues {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	
	for(int i=0 ; i<n ;i++){
		
		for(int j =0;j<n;j++){
			
			if((i+j)>n){
				System.out.println("#");
			}
			else{
				System.out.println(" ");
			}
			
		}
		System.out.println();
	}
	*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoopMapValues {

    public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=n;j++)
    
   {
    if((i+j)>n)
    {
    System.out.print("#");
    }
    else
    {
     System.out.print(" ");
    }
    
   }
   System.out.println();
   
  }
    }


	//Map<String,String> map = new HashMap<String,String>();
	
	
	/*List<String>  al = new ArrayList<String>();
	
	al.add("hi");
	al.add("bye");
	
	al.forEach(System.out::println);
	
	*/
	/*ConcurrentHashMap<String,String> hmap = new ConcurrentHashMap<String,String>();
	hmap.put("iphone", "5S");
	hmap.put("samasung", "S5cbcf");
	
	Iterator it = hmap.keySet().iterator();
	 while(it.hasNext()){
		 
		 System.out.println(hmap.get(it.next()));
	 }*/
	
	/*HashMap<String,String> hmap = new HashMap<String,String>();
	
	hmap.put("Assalamualaikum", "Walalaikumussalm");
	hmap.put("allah hafiz", "Feamanillah");
	
	for(String Key : hmap.keySet()){
		
		System.out.println("---------------------------------\n");
		System.out.println("Get the key and value \n");
		System.out.println(" Key: " + Key + "\n" + " Value: " + hmap.get(Key));
	}*/

}
