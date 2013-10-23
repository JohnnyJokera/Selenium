package com.epam.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends InternalPage {
	@FindBy(xpath = "/html/body/div[8]/div/div/button")
	public WebElement buttoncreate;

	@FindBy(css = "input.uiAutocompleteTextInput")
	public WebElement emailfield;

	@FindBy(id = "subject")
	public WebElement itemfield;

	@FindBy(xpath = "//html[@id='js']/body/div[8]/div/div[3]/button[2]")
	public WebElement buttonsend;
	
		

	public CheckMailPage sendMail(String username, String item) {

		buttoncreate.click();
		emailfield.clear();
		emailfield.sendKeys(username);
		driver.findElement(
				By.cssSelector("div.composeHeaderValue.composeHeaderAttachesArea"))
				.click();
		itemfield.click();
		itemfield.clear();
		itemfield.sendKeys(item);
		buttonsend.click();
		
return MyPageFactory.getPage(driver, CheckMailPage.class);
	}
}
