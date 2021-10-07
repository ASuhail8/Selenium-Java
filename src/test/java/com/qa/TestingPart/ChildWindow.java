package com.qa.TestingPart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;

public class ChildWindow extends BaseTest {
	String email;

	@Test
	public void window() {

		driver = launchBrowser("childWindow");
		driver.findElement(By.cssSelector("a[href*='rahulshettyacademy.com']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parentWindow = it.next();
		while (it.hasNext()) {
			String wh = it.next();
			String title = driver.switchTo().window(wh).getTitle();
			if (!title.contains("LoginPage")) {
				driver.switchTo().window(wh);
				email = driver.findElement(By.cssSelector("Strong a[href*='mentor']")).getText();
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(email);

	}
}
