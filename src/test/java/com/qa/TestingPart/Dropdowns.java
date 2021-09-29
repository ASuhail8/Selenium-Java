package com.qa.TestingPart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;
import com.qa.everything.TestUtils;

public class Dropdowns extends BaseTest {

	public static WebDriver driver;
	TestUtils utils = new TestUtils();

	@Test
	public void autoSuggestions() {

		driver = launchBrowser("PracticeUrl");
		driver.findElement(By.id("autocomplete")).sendKeys("au");
		List<WebElement> lists = driver.findElements(By.cssSelector(".ui-menu-item div"));
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getText().equals("Nauru")) {
				lists.get(i).click();
				break;
			}

		}
	}

	@Test
	public void staticDropdowns() {

		driver = launchBrowser("PracticeUrl");
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		utils.selectDropdown(element).selectByVisibleText("Option2");
		WebElement selectedOption = utils.selectDropdown(element).getFirstSelectedOption();
		AssertJUnit.assertEquals(selectedOption.getText(), "Option2");
	}

}
