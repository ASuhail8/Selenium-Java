package com.qa.TestingPart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;

public class HandlingWindows extends BaseTest {

	@Test
	public void windowTest() {

		driver = launchBrowser("childWindow");
		driver.findElement(By.cssSelector("a[href*='rahulshettyacademy.com']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> it = windowHandles.iterator();

		String parentWindow = it.next();
		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		String email = driver.findElement(By.cssSelector("Strong a[href*='mentor']")).getText();

		driver.switchTo().window(parentWindow);

		driver.findElement(By.id("username")).sendKeys(email);
	}

}
