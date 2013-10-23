package com.epam.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AnyPage {

	@FindBy(id = "login")
	public WebElement usernamefiel;
	@FindBy(id = "password")
	public WebElement passwordfiel;

	@FindBy(name = "profile.send")
	public WebElement buttonfiel;

	public UserPage login(String username, String password) {
		driver.findElement(By.cssSelector("span.r-topline__link-text")).click();
		usernamefiel.clear();
		usernamefiel.sendKeys(username);
		passwordfiel.clear();
		passwordfiel.sendKeys(password);
		buttonfiel.click();
		return MyPageFactory.getPage(driver, UserPage.class);
	}

	public void tryToOpen() {

		
	}

}
