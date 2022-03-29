package com.sim.testngselm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.RunInfo;

public class FlipcartTestNg {
	WebDriver driver=null;
    @Test(groups = "Chrome")
    public void launchFlipcart() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
//        try {
//            Thread.sleep(3000);
//        } catch (Exception e) {<input autocomplete="off" type="text" class="_2IX_2- VJZDxU" value="">
//            e.printStackTrace();
//        }
   }
    @Test(groups = "Chrome", dependsOnMethods = {"launchFlipcart"})
    public void login() {
        
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(1) > input")).sendKeys("harsha@gmail.com");
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div:nth-child(2) > input")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button")).submit();
       // driver.close();
    }
}