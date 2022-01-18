package com.sel;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ui.appen.com.cn/user/login"); 
		driver.manage().window().maximize();
		
		WebElement val1 = driver.findElement(By.id("name"));
		WebElement val2 = driver.findElement(By.id("password"));
		WebElement val3 = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-Account\"]/div/div/div/form/button/span"));
		WebElement val4 = driver.findElement(By.xpath("//*[@id=\"rc-tabs-0-panel-Account\"]/div/div/div/div/a/button/span")); 

		
		org.openqa.selenium.Point point = val3.getLocation();
		System.out.println("X: "+point.x+" Y: "+point.y);

	}

}
