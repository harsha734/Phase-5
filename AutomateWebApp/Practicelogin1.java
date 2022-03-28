package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicelogin1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.oracle.com/mysso/signon.jsp");
	WebElement email=driver.findElement(By.cssSelector("#sso_username"));
	email.sendKeys("harsha@gmail.com");
	WebElement pass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
	pass.sendKeys("Abpqwa@123");
	WebElement button= driver.findElement(By.cssSelector("#signin_button"));
	button.submit();
}
}
