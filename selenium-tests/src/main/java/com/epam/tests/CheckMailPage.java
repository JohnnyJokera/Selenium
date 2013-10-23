package com.epam.tests;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckMailPage extends InternalPage {
	@FindBy(xpath = "/html/body/div[3]/div/ul/li/a/span")
	public WebElement mail;

	@FindBy(xpath = "/html/body/div[8]/div[2]/div[2]/div[4]/div[4]/div[5]/div/a")
	public WebElement inbox;

	public InternalPage check() {
		inbox.click();
		mail.click();
		
		return MyPageFactory.getPage(driver, InternalPage.class);
	}
}




