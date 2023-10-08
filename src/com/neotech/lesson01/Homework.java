package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework extends CommonMethods {

//	Homework 1: HRMS Application Negative Login: 
//
//	    1. Open chrome browser
//	    2. Go to "https://hrm.neotechacademy.com/"
//	    3. Enter valid username
//	    4. Leave password field empty
//	    5. Verify error message with text "Password cannot be empty" is displayed.
//

	@BeforeMethod
	public void openBrowser() throws InterruptedException {

		setUp();
	}

	@AfterMethod
	public void quitBrowser() {

		tearDown();
	}

	@Test
	public void login() throws Exception {

		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));

		click(driver.findElement(By.xpath("//button[@type='submit']")));

		WebElement text = driver.findElement(By.xpath("//span[@id='txtPassword-error']"));

		if (text.isDisplayed()) {

			System.out.println("Test Passed! " + text.getText());
		} else {

			System.out.println("Test Failed!!");

		}
	}

}
