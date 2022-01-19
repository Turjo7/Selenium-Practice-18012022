package com.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window3 {

	/* https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/ */
	/* https://www.programiz.com/java-programming/enhanced-for-loop */
	/*
	 * https://www.tutorialspoint.com/what-is-the-difference-between-getwindowhandle
	 * -and-getwindowhandles-in-selenium
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();

		System.out.println("Parent Window Unique Id: " + mainWindowHandle);
		System.out.println("-------------------------------");

		for (String val : allWindowHandles) {
			System.out.println("Child Window Unique Id: " + val);
			System.out.println("-------------------------------");
		}

		java.util.Iterator<String> i = allWindowHandles.iterator();

		/*
		 * System.out.println("Checking and Printing All The Values in the Iterator: ");
		 * String b=i.next(); System.out.println(b); String c=i.next();
		 * System.out.println(c);
		 */

		// hasNext() return type is boolean

		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		System.out.println("-------------------------------");

		while (i.hasNext()) {

			String childWindow = i.next();
			System.out.println(childWindow);

			if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);

				driver.switchTo().window(childWindow);
				driver.close();
				System.out.println("Child window closed");

			}

		}

	}

}
