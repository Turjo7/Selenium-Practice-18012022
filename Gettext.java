package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gettext {

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

		
		String linkText1 = val1.getText();
		String linkText2 = val2.getText();
		String linkText3 = val3.getText();
		String linkText4 = val4.getText();
		
		System.out.println("From Field One: "+linkText1);
		System.out.println("From Field Two: "+linkText2);
		System.out.println("From Field Three: "+linkText3);
		System.out.println("From Field Four: "+linkText4);







	}

}
