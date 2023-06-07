package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.baseClass;
import com.pages.loginPage;

public class login extends baseClass {

	@Test
	public void loginapp() throws InterruptedException {
		logger = report.createTest(" login to saucedemo");

		logger.info("Starting Application");
		// it will go to the login page it will check all the locators and
//		it will initialize and it will return all the object

		loginPage loginPage = PageFactory.initElements(driver, loginPage.class);

		loginPage.loginSauceDemo("standard_us", "secret_sae");
		logger.pass("Login Done Successfully");

	}
}
