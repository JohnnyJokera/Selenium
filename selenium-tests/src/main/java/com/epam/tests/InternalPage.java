package com.epam.tests;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternalPage extends AnyPage {


	@FindBy(xpath = "html/body/div[3]/div/div/a/i")
	public WebElement logout;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/a")
	public WebElement logout1;


	public void logOut() {
		logout.click();
		logout1.click();
	}

	public	void tryToOpen() {
			
	}


	


}
