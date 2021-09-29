package com.qa.PracticePage;

import org.testng.annotations.Test;

import com.qa.everything.BaseTest;
import com.qa.pages.PracticeSec1Page;

public class PracticePageSec1Test extends BaseTest {

	@Test
	public void RadioButtonEx() {
		driver = launchBrowser("PracticeUrl");
		PracticeSec1Page pracPage = new PracticeSec1Page(driver);
		pracPage.selectRadioButton("radio2");
	}

	@Test
	public void autoSuggestionEx() {
		driver = launchBrowser("PracticeUrl");
		PracticeSec1Page pracPage = new PracticeSec1Page(driver);
		pracPage.dynamicSuggestions("Netherlands");
	}

	@Test
	public void selectDropdown() {
		driver = launchBrowser("PracticeUrl");
		PracticeSec1Page pracPage = new PracticeSec1Page(driver);
		pracPage.selectDropdown("Option3");
	}

	@Test
	public void checkBoxTest() {
		driver = launchBrowser("PracticeUrl");
		PracticeSec1Page pracPage = new PracticeSec1Page(driver);
		pracPage.selectCheckbox("Option2");
		pracPage.selectCheckbox("Option3");
	}

}
