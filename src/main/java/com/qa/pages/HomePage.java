package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.everything.BasePage;
import com.qa.everything.TestUtils;

public class HomePage extends BasePage {

	TestUtils utils = new TestUtils();

	@FindBy(name = "name")
	WebElement name;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(id = "exampleInputPassword1")
	WebElement password;

	@FindBy(id = "exampleCheck1")
	WebElement icecreamCheckbox;

	@FindBy(id = "exampleFormControlSelect1")
	WebElement gender;

	@FindBy(xpath = "//input[@name='inlineRadioOptions']//following-sibling::label")
	List<WebElement> employmentStatus;

	@FindBy(xpath = "//input[@name='inlineRadioOptions']")
	List<WebElement> employmentStatusCheckbox;

	@FindBy(name = "bday")
	WebElement bday;

	@FindBy(css = ".btn.btn-success")
	WebElement submit;

	@FindBy(xpath = "//div[contains(@class,'alert alert-success alert-dismissible')]//Strong")
	WebElement successMessage;

	@FindBy(xpath = "//a[contains(@href,'shop')]")
	WebElement shop;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterName(String name) {
		this.name.sendKeys(name);
	}

	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}

	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}

	public void checkIcecreamCheckBox() {
		if (!icecreamCheckbox.isSelected()) {
			icecreamCheckbox.click();
		}
	}

	public void selectGender(String gender) {
		utils.selectDropdown(this.gender).selectByVisibleText(gender);
	}

	public void selectEmployementStatus(String status) {
		for (int i = 0; i < employmentStatus.size(); i++) {
			String empStatus = employmentStatus.get(i).getText();
			if (!status.equals("Entrepreneur")) {
				if (empStatus.equals(status)) {
					employmentStatusCheckbox.get(i).click();
					break;
				}
			} else {
				System.out.println("Entrprenaur is disabled");
				break;
			}
		}
	}

	public void enterBday(String bday) {
		this.bday.sendKeys(bday);
	}

	public void clickOnSubmit() {
		submit.click();
	}

	public void validateSuccessMsg() {
		Assert.assertEquals(successMessage.getText(), "Success!");
	}

	public void clickOnShop() {
		shop.click();
	}

}
