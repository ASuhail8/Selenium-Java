package com.qa.everything;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public static WebDriver driver;

	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}

	public void verifyPageTitle(WebElement element, String title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertEquals(element.getText(), title);
	}

}
