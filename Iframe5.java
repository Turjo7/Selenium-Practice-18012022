package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/frames");
		
		//WebElement iframeElement = driver.findElement(By.id("IF1"));
		WebElement iframeElement = driver.findElement(By.id("IF1"));
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.quit();


	}

}
