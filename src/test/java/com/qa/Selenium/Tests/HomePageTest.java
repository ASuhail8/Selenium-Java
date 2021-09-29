package com.qa.Selenium.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;
import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;

public class HomePageTest extends BaseTest {
	public static WebDriver driver;

	@Test
	public void fillFormTest() {
		driver = launchBrowser("ProtoCommerceUrl");
		HomePage homePage = new HomePage(driver);
		homePage.enterName("Suhail");
		homePage.enterEmail("abc.gmail.com");
		homePage.enterPassword("****");
		homePage.checkIcecreamCheckBox();
		homePage.selectGender("Female");
		homePage.selectEmployementStatus("Student");
		homePage.enterBday("20-10-1991");
		homePage.clickOnSubmit();
		homePage.validateSuccessMsg();
	}

	@Test
	public void verifyShopPageTitle() {
		driver = launchBrowser("ProtoCommerceUrl");
		HomePage homePage = new HomePage(driver);
		ShopPage shopPage = new ShopPage(driver);
		homePage.clickOnShop();
		shopPage.verifyShopPageTitle();
	}

}
