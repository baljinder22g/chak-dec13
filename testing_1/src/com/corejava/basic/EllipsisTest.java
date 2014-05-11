package com.corejava.basic;

public class EllipsisTest {
int arg[];
public int average(int... arg){
			double total=0.0;
			for (double d:arg){
				total+=d;
			}
				return (int) (total/arg.length);
			}
		
		
public static void main(String args[]){
	System.out.println("Enter the no of values u want to have average");
	int a;
	EllipsisTest et= new EllipsisTest();
	a=et.average(1,2,3,4,5,6);
	
	System.out.println("Average is :"+a);
	
	
}
	

}
