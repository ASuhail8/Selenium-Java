package com.qa.TestingPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;

public class Alert extends BaseTest {

	public static WebDriver driver;

	@Test
	public void alertEx() throws Exception {

		driver = launchBrowser("PracticeUrl");
		driver.findElement(By.cssSelector("#name")).sendKeys("Suhail");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);

		org.openqa.selenium.Alert al = driver.switchTo().alert();

		System.out.println(al.getText());
		if (al.getText().contains("Suhail")) {
			System.out.println("alert is working fine");
		}

		al.accept();

		driver.findElement(By.cssSelector("#name")).sendKeys("Suhail");
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
		System.out.println(al.getText());
		al.dismiss();
	}
}
