package com.sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iterator1 {

	public static void main(String[] args) throws InterruptedException {									
		WebDriverManager.chromedriver().setup();

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");

	    // Opening all the child window
	    driver.findElement(By.id("windowButton")).click();
	    driver.findElement(By.id("messageWindowButton")).click();
	    
	    String MainWindow = driver.getWindowHandle();
	    System.out.println("Main window handle is " + MainWindow);

	    // To handle all new opened window
	    Set<String> s1 = driver.getWindowHandles();
	    System.out.println("Child window handle is" + s1);
	    Iterator i1 = (Iterator) s1.iterator();

	    // Here we will check if child window has other child windows and when child window
	    //is the main window it will come out of loop.
	      while (((java.util.Iterator<String>) i1).hasNext()) {
	          String ChildWindow = ((java.util.Iterator<String>) i1).next();
	          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
	              driver.switchTo().window(ChildWindow);
	              driver.close();
	              System.out.println("Child window closed");
	           }
	       }
	    }

}
