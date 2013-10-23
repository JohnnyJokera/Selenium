package com.epam.tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClaccTest {

	protected WebDriver driver;
	protected String baseUrl;
	LoginPage loginPage;
	UserPage userpage;
	InternalPage internalpage;

	@BeforeSuite
	public void setUp() throws Exception {
		driver = WebDriverFactory.getDriver(DesiredCapabilities.firefox());
		baseUrl = "http://www.rambler.ru";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public LoginPage goToMainPage() {

		driver.get(baseUrl + "/");

		return MyPageFactory.getPage(driver, LoginPage.class);
	}
	@Test
	public void testRambler() {
		goToMainPage()
				.login("nikitenkojane", "johnny11")
				.sendMail("nikitenkojane@rambler.ru", "hello")
				.check()
				.logOut();
	}
}



