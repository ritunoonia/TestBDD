package com.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;
import org.junit.Assert;
public class VerifyHomePageUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../SeleniumBasics/src/test/java/resources/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		//Navigate to amazon.co.uk
		browser.get("https://www.amazon.co.uk/");
		String pageUrl=browser.getCurrentUrl();
		System.out.println(pageUrl);
		String expectedUrl="https://www.amazon.co.uk/";
		Assert.assertEquals(expectedUrl,pageUrl );
		browser.close();
		
	}

}
