package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pageobjectmodel.LoginPage;
import com.utilpackage.Baseconfig;

public class AutomationPractice {
	
    public void getlog() throws Exception {
    WebDriver driver = new ChromeDriver();   //Open a browser-Selenium-4 use
    Baseconfig obj = new Baseconfig();
    
     driver.get(obj.getconfig("URL"));       // get method only get URL
     //Navig mth(Best)can go to URL/Forward/Backward/Refresh/
    //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //1st
     //driver.navigate().forward(); //
     //driver.navigate().back();
     //driver.navigate().refresh();
    //driver.manage().window().fullscreen();//full screen u can not see Border 
    //Video/Drama/Movie/Game/full screen is good
    driver.manage().window().maximize(); //Maximize need for Automation application and can see border
    //Wait for GUI page load By.xpath("//*[@class='oxd-userdropdown-name']"));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    //Wait HTM Page Load by Implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                                              //WebElement logout= driver.findElement(By.xpath(""));  //PF or POM anyone we use//Hide the XPath
                                             //findbyElements to use for find object
    LoginPage pom = new LoginPage();        //create obj For LoginPage
    driver.findElement(pom.Username).sendKeys(obj.getconfig("USERNAME")); //Selenium Find locator by FindByXpath
    //driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active'])[1]'])")); //valid user
     //XPath u can not show in coding//
    driver.findElement(pom.Password).sendKeys(obj.getconfig("PASSWORD"));//Password showing is Crime
    driver.findElement(pom.Loginbtn).click(); //Click login Button
     //Login btn is should be visible for successful login
    Thread.sleep(1000);
    driver.findElement(pom.Dropdown).click();
    //SeleniumWait.getExplicitwait(driver,logout);
     WebElement logout =driver.findElement(pom.logout);
     boolean logOutFound = logout.isDisplayed();//Login button is visible or not use (isDisPlayed code)/
     System.out.println(logOutFound );
     driver.close();//close means current Tab/Browser it's not close Driver/can not free up all system memory
    //driver.quit();//Quit method means close web browser and tab-all /free all system memory
    
    
   }	
}