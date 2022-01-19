package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		WebElement text = driver.findElement(By.id("sampleHeading")); // The sampleHeading is in the New Tab 
		   
        // Fetching the text using method and printing it     
        System.out.println("Element found using text: " + text.getText());

		
        

		


	}

}
