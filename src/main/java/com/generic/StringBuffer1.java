package com.generic;

public class StringBuffer1 {
      // Reverse string with String buffer class;
	static String str ="kamrul";
	String rev = "";
 public static void main(String[] args) {
	
	StringBuffer sb  = new StringBuffer(str);
       System.out.println(sb.reverse());
	
	}

	}