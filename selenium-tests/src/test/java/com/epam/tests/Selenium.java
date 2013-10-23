package com.epam.tests;


import org.testng.annotations.Test;

public class Selenium extends ClaccTest {

	@Test
	public void testRambler() {
		goToMainPage()
				.login("nikitenkojane", "johnny11")
				.sendMail("nikitenkojane@rambler.ru", "hello")
				.check()
				.logOut();
	}

}
