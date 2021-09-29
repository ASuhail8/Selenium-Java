package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.everything.BasePage;

public class CheckoutPage extends BasePage {

	@FindBy(id = "country")
	WebElement country;

	@FindBy(xpath = "//div[@class='suggestions']/ul/li/a")
	WebElement selectCountry;

	@FindBy(xpath = "//label[@for='checkbox2']")
	WebElement checkBox;

	@FindBy(css = "input.btn.btn-success.btn-lg")
	WebElement purchase;

	@FindBy(xpath = "//div//Strong")
	WebElement successMsg;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterCountry(String country) {
		this.country.sendKeys(country);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectCountry() {
		selectCountry.click();
	}

	public void selectCheckbox() {
		checkBox.click();
	}

	public void clickOnPurchase() {
		purchase.click();
	}

	public void verifySuccessMsg() {
		Assert.assertEquals(successMsg.getText(), "Success!");
	}
}
