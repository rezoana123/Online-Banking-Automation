package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  
public class TestNGPractice {
	@BeforeGroups
	  public void beforeGroups() {
		System.out.println();
	}
   @BeforeSuite
   public void beforsuite() {
	System.out.println("before suite : before everyhting");
   }
	@AfterSuite
	public void aftersuite() {
	System.out.println("after Suite ; after everything ");
	}

   @BeforeClass
   public void beforeclass() {
	System.out.println("before class: before all classes");
}
   @AfterClass
   public void afterclass() {	
	System.out.println(" after class : after all classes");
   }
	@BeforeMethod
	public void beforemethod() {
		System.out.println();
	}

   @AfterMethod
   public void aftermethod() {
	System.out.println("after all merhod :after each method ");
}
    @BeforeTest
    public void setup() {
    System.out.println("Before Test: setup");
    	}
	@Test
    public void getLogin() {
	              	//actual code
    System.out.println("login test");	
		}
    @Test
    public void getPayment() {
      	//code
       System.out.println("Payment test'");	
}
    @AfterTest
    public void teardown() {
      	                     //code
        System.out.println("After test : Close Connection");	
}
    @AfterGroups
    public void afterGroups() {
		System.out.println("after groups : afer all groups");
	}
  
}
