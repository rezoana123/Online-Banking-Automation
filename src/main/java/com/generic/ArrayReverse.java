 package com.generic;

public class ArrayReverse{
 
   String[] name= {"Karim","Rezoana"};
     
	public void positiveArray() {
		
	for(int a = name.length-1;a<=0; a--) {
	System.out.println(name.length);	
		}	
	}	
  public static void main(String[] args) {
	  ArrayReverse obj= new ArrayReverse();
		obj.positiveArray();
		}

}
