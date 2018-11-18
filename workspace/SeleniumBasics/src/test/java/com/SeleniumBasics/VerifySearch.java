package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

//import junit.framework.Assert;

public class VerifySearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../SeleniumBasics/src/test/java/resources/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		//Navigate to amazon.co.uk
		browser.get("https://www.amazon.co.uk/");
		
		//type t-shirts in search fields
		browser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-shirts");
		browser.findElement(By.xpath("//input[@value='Go']")).click();
		
		Thread.sleep(3000);
		
		String SearchResultText= browser.findElement(By.xpath("//span[@id='s-result-count']")).getText();
 		Assert.assertTrue(SearchResultText.contains("T-Shirts"));
		browser.close();
		
	}

}
