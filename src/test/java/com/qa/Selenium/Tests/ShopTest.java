package com.qa.Selenium.Tests;

import org.testng.annotations.Test;

import com.qa.everything.BaseTest;
import com.qa.pages.CheckoutPage;
import com.qa.pages.HomePage;
import com.qa.pages.ShopPage;

public class ShopTest extends BaseTest {

	String[] items = { "Nokia Edge", "Blackberry" };

	@Test
	public void addItemsToCart() {

		driver = launchBrowser("ProtoCommerceUrl");
		HomePage homePage = new HomePage(driver);
		ShopPage shopPage = new ShopPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		homePage.clickOnShop();
		shopPage.addItemsToCart(items);
		shopPage.clickOnCheckout();
		shopPage.verifyPrice();
		shopPage.clickCheckoutFromCheckoutPage();
		checkoutPage.enterCountry("India");
		checkoutPage.selectCountry();
		checkoutPage.selectCheckbox();
		checkoutPage.clickOnPurchase();
		checkoutPage.verifySuccessMsg();
	}

}
