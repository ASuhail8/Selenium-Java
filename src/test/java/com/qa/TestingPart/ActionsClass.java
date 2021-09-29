package com.qa.TestingPart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;

public class ActionsClass extends BaseTest {

	public static WebDriver driver;

	@Test
	public void actionEx() {

		driver = launchBrowser("ProtoCommerceUrl");

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
				.sendKeys("hello").doubleClick().perform();
		action.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).contextClick().perform();

	}

}
