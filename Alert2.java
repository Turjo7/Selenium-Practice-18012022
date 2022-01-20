package com.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		Alert switchleAlert = driver.switchTo().alert();
		//switchleAlert.accept();
		switchleAlert.dismiss();

	}

}
