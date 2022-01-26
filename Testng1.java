package com.sel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Testng1 {

	WebDriver driver;

	@Test
	public void f() {
		WebDriverManager.chromedriver().setup();

		String baseURL = "https://google.com";
		System.out.println("Launching Google Chrome browser");
		driver = new ChromeDriver();
		driver.get(baseURL);
		String testTitle = "Google";
		String originalTitle = driver.getTitle();
		System.out.println("Original Title: "+ originalTitle);
        Assert.assertEquals(originalTitle, testTitle);


	}

	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Starting Test on Chrome Browser");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("Finished Test Chromer Browser");
	}

}
