package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.everything.BasePage;
import com.qa.everything.TestUtils;

public class PracticeSec1Page extends BasePage {

	String name = "//input[@value='%s']";

	@FindBy(id = "autocomplete")
	WebElement enterCountryInToSuggestionBox;

	@FindBy(css = "li.ui-menu-item div")
	List<WebElement> allSuggestions;

	@FindBy(id = "dropdown-class-example")
	WebElement dropdown;

	@FindBy(xpath = "//input[@type='checkbox']/..")
	List<WebElement> checkBoxLabel;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkBox;

	TestUtils utils = new TestUtils();

	public PracticeSec1Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void selectRadioButton(String name) {
		String xpath = String.format(this.name, name);
		driver.findElement(By.xpath(xpath)).click();

	}

	public void dynamicSuggestions(String countryName) {
		enterCountryInToSuggestionBox.sendKeys(countryName);
		for (int i = 0; i < allSuggestions.size(); i++) {
			if (allSuggestions.get(i).getText().equals(countryName)) {
				allSuggestions.get(i).click();
				break;
			}
		}

	}

	public void selectDropdown(String dropdown) {
		utils.selectDropdown(this.dropdown).selectByVisibleText(dropdown);
		WebElement selectedOption = utils.selectDropdown(this.dropdown).getFirstSelectedOption();
		Assert.assertEquals(dropdown, selectedOption.getText());
	}

	public void selectCheckbox(String name) {
		for (int i = 0; i < checkBoxLabel.size(); i++) {
			if (checkBoxLabel.get(i).getText().equals(name)) {
				checkBox.get(i).click();
			}
		}
	}
}
