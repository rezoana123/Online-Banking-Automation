package com.utilpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Baseconfig {
	
	public  String getconfig(String value) throws Exception {
		
	String filepath = "./config.properties";	
		//convert file(note pad) into stream = java dev class : FileInputStream
	FileInputStream fis = new FileInputStream(filepath);
	                                           //read note pad /config file ==> java dev to use a class= Properties
	                                           //Try catch exception is better
	Properties  pro = new Properties();       //Create properties class and OBJ //now java know what r the value
	pro.load(fis);                             //create load is method and the properties read the java code
	
	String eachvalue = pro.get(value).toString(); //Get each value create String-pro.get(value)
	System.out.println(eachvalue);                //Print the value
	return eachvalue ;                            //return eachvalue
	
	}
 public static void main(String[] args) throws Exception {
	 Baseconfig obj = new Baseconfig();
	 obj.getconfig("USERNAME");             //during run write here- u can change also
	 
}

}

