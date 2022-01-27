package com.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groups {

	WebDriver driver;
	// Saving the expected title of the Webpage
	String title = "ToolsQA - Demo Website For Automation";

	@Test
	public void starting_point() {
		WebDriverManager.chromedriver().setup();
		System.out.println("This is the starting point of the test");
		// Initialize Chrome Driver
		// driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}

	@Test(groups = { "testsmoke" })
	public void checkTitle() {
		String testTitle = "Free QA Automation Tools For Everyone";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
	}

	@Test(groups = { "testsmoke" })
	public void click_element() {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		System.out.println("Home Page heading is displayed");
	}
	
	
	
	@Test(groups = { "testsanity" })
	public void checkTitlea() {
		String testTitle = "Free QA Automation Tools For Everyone";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
	}

	@Test(groups = { "testsanity" })
	public void click_elementb() {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		System.out.println("Home Page heading is displayed");
	}
	
	@Test(groups = { "testregression" })
	public void click_elementc() {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		System.out.println("Home Page heading is displayed");
	}
	
	@Test(groups = { "testregression" })
	public void click_elementd() {
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
		System.out.println("Home Page heading is displayed");
	}
	
	
}
