package com.sel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //deprecated in Windows and Linux
		driver.get("https://facebook.com");
		
		
		//FluentWait waits = new FluentWait(driver);
		
		WebElement emailid = driver.findElement(By.id("emailid"));
		emailid.sendKeys("nasir2009@gmail.com");
		//Thread.sleep(5000);

		driver.close();

	}

}
