package com;

public class SingletonDemo {
public static void main(String[] args) {
	
	Singleton sg = Singleton.getInstance();
	
	sg.demoMethod();
	sg.showMe();
}
}
