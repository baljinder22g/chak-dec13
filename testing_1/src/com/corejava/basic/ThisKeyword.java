package com.corejava.basic;

public class ThisKeyword {
	int a=10;
	int b=11;
	
	public void method1(int a1, int b1){
//		this.a=a1;
//		this.b=b1;
		System.out.println("A is "+a+" and B is "+b);
		System.out.println("A1 is "+a1+" and B1 is "+b1);
				
	}
	public static void main (String args[]){
		ThisKeyword tk=new ThisKeyword();
		tk.method1(1,2);
	}
}
