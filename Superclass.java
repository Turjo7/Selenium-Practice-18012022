package com.selenium.learning;

import org.testng.annotations.Test;

Class Superclass {
	 @Test
	    public void OpenBrowser() {
	        System.out.println("BrowserOpened");
	    }

}


public class InheritedDependencyTest extends Superclass
{
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
