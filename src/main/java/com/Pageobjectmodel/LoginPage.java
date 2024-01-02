package com.Pageobjectmodel;

import org.openqa.selenium.By;

public class LoginPage {
	public static final By logoutbtn = null;
	//store all Login related Xpath -is part of selenium
	//which datatype use== >Web element// so use PF or POM
	//PF use=>@Findby
	//POM=> By()
	public By Username = By.xpath("//*[@name='username']");
	public By Password = By.xpath("//*[@name='password']");
	public By Loginbtn= By.xpath("//*[@type='submit']");
	public By Dropdown= By.xpath("//*[@class= 'oxd-userdropdown-name']");
	public By logout= By.xpath("//*[@role= menuitem'])[4]");


	
	

	
	
	//@CacheLookup//Annotaion it is storing all Xpath in Pc memory so next time it wil be faster
	
	
	

	
}
