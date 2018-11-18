package com.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "../SeleniumBasics/src/test/java/resources/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		//Navigate to amazon.co.uk
		browser.get("https://www.amazon.co.uk/");
		
		//locator using id
		
		WebElement searchFieldById =browser.findElement(By.id("twotabsearchtextbox")); 
		searchFieldById.sendKeys("Tshirts");
		Thread.sleep(3000);
		browser.findElement(By.name("field-keywords")).clear();
		
		//locator using class name Not working as multiple place same class name
		
		browser.findElement(By.className("nav-input")).sendKeys("Books");
		
		
		
		//browser.close();
		
		//locator Using Tag Name as not unique so not working
		//browser.findElement(By.tagName("input")).sendKeys("Books");
		//locator using Links
		//browser.findElement(By.linkText("Today's Deals")).click();
		
		browser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes");
		
		browser.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		
		browser.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("watches");
		
		

	}

}
