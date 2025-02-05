package com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class projecttest {
	@Test
	public void pagetest() throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome","E:\\Seleniumeclipse\\chrome\\chromedriver-win64\\chrome.driver");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/new/imagesfor%20git/index.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.tagName("a")).getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		System.out.println("maven process completed successfully");
		
		System.out.println("hi welome to my maven project");

}
}
