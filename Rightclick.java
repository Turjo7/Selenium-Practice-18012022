package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/");
		
		Actions action = new Actions(driver);
		WebElement home = driver.findElement(By.linkText("Selenium"));
		action.contextClick(home).build().perform();
	}

}
