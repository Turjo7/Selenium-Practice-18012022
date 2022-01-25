package com.selenium.learning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationflow {
	WebDriver driver;

	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.toolsqa.com/testng/testng-test/");
		System.out.println(driver.getTitle());

	}

	@BeforeTest
	public void beforeMethod() {
		System.out.println("Launching The Chrome Browser");

	}

	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("Launching The Chrome Browser");
		driver.quit();

	}

	@AfterMethod
	public void afterMethod() {

	}

}
