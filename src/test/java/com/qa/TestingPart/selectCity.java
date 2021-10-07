package com.qa.TestingPart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;
import com.qa.everything.TestUtils;

public class selectCity extends BaseTest {

	TestUtils utils = new TestUtils();

	@Test
	public void selectCities() throws InterruptedException {
		driver = launchBrowser("flightBooking");
		driver.findElement(By.cssSelector("input[id*='originStation']")).click();
		List<WebElement> dep = driver
				.findElements(By.xpath("//div[contains(@id,'originStation')]//div[@class='dropdownDiv']//li//a"));
		for (int i = 0; i < dep.size(); i++) {
			if (dep.get(i).getText().contains("KQH")) {
				dep.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		List<WebElement> arrival = driver
				.findElements(By.xpath("//div[contains(@id,'destinationStation')]//div[@class='dropdownDiv']//li//a"));
		for (int j = 0; j < arrival.size(); j++) {
			if (arrival.get(j).getText().contains("VGA")) {
				arrival.get(j).click();
				break;
			}
		}
		List<WebElement> dates = driver.findElements(
				By.xpath("(//table[@class='ui-datepicker-calendar'])[1]//tbody//tr//td[@data-handler='selectDay']//a"));
		for (int k = 0; k < dates.size(); k++) {
			if (dates.get(k).getText().contains("15")) {
				dates.get(k).click();
				break;
			}
		}
	}

}
