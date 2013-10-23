package com.epam.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	public WebDriver driver;
	
	public boolean isOnThisPage(){
		return true;
	}
	
	public abstract void  tryToOpen();
	
	public WebDriverWait waite_(){
		
		return new WebDriverWait(driver, 10);
	}

}