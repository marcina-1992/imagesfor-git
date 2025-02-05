package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class menpage {
	public void functiontesting() throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","E:\\Seleniumeclipse\\chrome\\chromedriver-win64\\chrome.driver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.id("openwindow")).click();
		}

}
