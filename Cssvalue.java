package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssvalue {

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

		
		String linkText1 = val1.getCssValue(null);
		String linkText2 = val2.getCssValue(null);
		String linkText3 = val3.getCssValue(null);
		String linkText4 = val4.getCssValue(null);
		
		System.out.println("From Field One Tag Name Is: "+linkText1);
		System.out.println("From Field Two Tag Name Is: "+linkText2);
		System.out.println("From Field Three Tag Name Is: "+linkText3);
		System.out.println("From Field Four Tag Name Is: "+linkText4);

	}

}
