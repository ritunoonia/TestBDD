package com.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

import org.junit.Assert;

public class VerifySearchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../SeleniumBasics/src/test/java/resources/chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		
		//Navigate to amazon.co.uk
		browser.get("https://www.amazon.co.uk/");
		//find dropdown box
		WebElement dropdown = browser.findElement(By.xpath("//Select[@id='searchDropdownBox']"));
		List<WebElement> allOptions =  dropdown.findElements(By.tagName("option"));
		
		
		System.out.println(allOptions.size());
		Assert.assertEquals(45, allOptions.size());
		
		
		dropdown.sendKeys("Books");
		//dropdown.sendKeys("Books");
		}

}
