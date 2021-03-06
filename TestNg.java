package com.sel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNg {

	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {

		System.out.println("From @Test f Method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("From @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("From @AfterMethod");

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("From @BeforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("From @AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("From @BeforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("From @AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("From @BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("From @AfterSuite");
	}

}
