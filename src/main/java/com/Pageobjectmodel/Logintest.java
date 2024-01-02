package com.Pageobjectmodel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	public static void main(String[] args) {
	
		
		WebDriver driver= new ChromeDriver();   // 
         driver.navigate().to("https://opensource-demo.orangehrmlive.com");
         driver.manage().window().maximize();
         //driver.manage().timeouts().getPageLoadTimeout(Duration.ofseconds(10));
         driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
         
         
         
	}

}

