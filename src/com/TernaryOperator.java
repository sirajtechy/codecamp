package com;

import java.util.Scanner;

public class TernaryOperator {
public static void main(String[] args) {
	
	
	int a,b,c,d;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter all the three numberss");
	
	a = sc.nextInt();
	b= sc.nextInt();
	c=sc.nextInt();
	
	d= b>(a>b ? a:b)? b :((a>b)?a:b);
	
	System.out.println("largest no::"+ d);
}


}
