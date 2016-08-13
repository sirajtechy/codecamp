package com;

public class MethodOverloading {
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.sum(2,4, 6);
		mo.sum(2,8);
	}

	void sum(int a,int b){
		
		int c = a+b;
	System.out.println(c);	
	}
	
	void sum(int a,int b,int c){
		
		int d = a+b+c;
		System.out.println(d);
	}
}
