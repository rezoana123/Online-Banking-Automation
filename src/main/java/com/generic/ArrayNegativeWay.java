
package com.generic;

public class ArrayNegativeWay {
	
	int[] myArray= {20,30,40};
	
	public void rev_array() {
	for(int i= myArray.length-1;i>=0;i--) {
	System.out.println(myArray[i]);
	
	}}
	
   public static void main(String[] args) {
		ArrayNegativeWay obj = new ArrayNegativeWay();
		obj.rev_array();  // result will be 40,30,20
	}

}
