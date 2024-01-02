package com.utilpackage;

import org.openqa.selenium.By;

public class PageObjectModel {
	
	 public By username = By.xpath ("//*[@name='username']");
	 public By password = By.xpath ("//*[@name='password']");
	 public By Loginbtn = By.xpath("//*[@type='submit']");
	 public By Dropdown = By.xpath ("//*[@class='oxd-userdropdown-name']");	
	 public By Dropdownlink = By.xpath ("//*[@class='oxd-userdropdown-link'][4]");	
	 public By Logout = By.xpath("//*[text()='Login')");

}
