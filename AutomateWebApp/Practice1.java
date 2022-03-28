package com.sel;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		 try
         {
           System.out.println("Start of delay: "+ new Date());
           // Delay for 7 seonds
           Thread.sleep(7000);   
           System.out.println("End of delay: "+ new Date());
         }
         catch(InterruptedException ex)
         {
             ex.printStackTrace();
         }
		
		WebElement email=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content"));
		email.sendKeys("harsha@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content"));
		pass.sendKeys("Abpqwa@123");
		WebElement repass=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content"));
		repass.sendKeys("Abpqwa@123");
		WebElement  country= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content"));
        Select dropdown = new Select(country);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("India");
        WebElement fname= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content"));
		fname.sendKeys("harsha");
		WebElement lname= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content"));
		lname.sendKeys("harsh");
		WebElement job= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content"));
		job.sendKeys("NA");
		WebElement wphone= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content"));
		wphone.sendKeys("9004562782");
		WebElement cname= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content"));
		cname.sendKeys("ABC");
		WebElement address= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content"));
		address.sendKeys("no123,ACV,PYZ");
		WebElement city= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content"));
		city.sendKeys("Banglore");
		WebElement state= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content"));
		Select dropdown1 = new Select(state);
        System.out.println(dropdown1.getFirstSelectedOption().getText());
        dropdown1.selectByVisibleText("Assam");
		
		WebElement zip= driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content"));
		zip.sendKeys("65498");
		WebElement link=driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1 > a"));
	      link.click();

		//WebElement link= driver.findElement();
		//link.sendKeys("9004562782");

	}
}
