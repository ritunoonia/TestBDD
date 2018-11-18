package com.SeleniumBasics;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class VerifyHomepageTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../SeleniumBasics/src/test/java/resources/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		//Navigate to amazon.co.uk
		browser.get("https://www.amazon.co.uk/");
		
		String title = browser.getTitle();
		System.out.println(title);
		
		String expectedTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
		
		Assert.assertEquals(expectedTitle, title);
		
		browser.close();
		
		System.setProperty("webdriver.edge.driver","../SeleniumBasics/src/test/java/resources/MicrosoftWebDriver.exe");
		WebDriver browser1=new EdgeDriver();
		browser1.get("https://www.argos.co.uk/");
		
		//IEbrowser();

	}
	
	public static void IEbrowser() {
	
		System.setProperty("webdriver.edge.driver","../SeleniumBasics/src/test/java/resources/MicrosoftWebDriver.exe");
		WebDriver browser1=new EdgeDriver();
		browser1.get("https://www.argos.co.uk/");
	}
	
		
	}




