package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/radio.html"); 
		driver.manage().window().maximize();
		
		WebElement val1 = driver.findElement(By.xpath("/html/body/div[4]/strong[2]"));
		boolean status = val1.isSelected();
		System.out.println("The Field is: "+ status);
		
	}

}
