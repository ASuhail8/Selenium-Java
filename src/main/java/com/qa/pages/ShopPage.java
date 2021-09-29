package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.everything.BasePage;

public class ShopPage extends BasePage {

	@FindBy(css = "h1.my-4")
	WebElement shopPageTitle;

	@FindBy(xpath = "//h4[@class='card-title']//a")
	List<WebElement> cartItems;

	@FindBy(css = "button.btn.btn-info")
	List<WebElement> addToCartButton;

	@FindBy(css = "li.nav-item.active")
	WebElement checkoutButton;

	@FindBy(xpath = "//input[@id='exampleInputEmail1']/..//following-sibling::td[2]//Strong")
	List<WebElement> itemTotal;

	@FindBy(css = "h3 Strong")
	WebElement fullTotalPrice;

	@FindBy(css = "button.btn.btn-success")
	WebElement checkoutButtonFromCheckoutPage;

	public ShopPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void verifyShopPageTitle() {
		verifyPageTitle(shopPageTitle, "Shop Name");
	}

	public void addItemsToCart(String[] items) {
		for (int i = 0; i < cartItems.size(); i++) {
			String item = cartItems.get(i).getText();
			for (int j = 0; j < items.length; j++) {
				if (items[j].equals(item)) {
					addToCartButton.get(i).click();
				}
			}

		}

	}

	public void clickOnCheckout() {
		checkoutButton.click();
	}

	public void verifyPrice() {
		int sum = 0;
		for (int i = 0; i < itemTotal.size(); i++) {
			String cartItem = itemTotal.get(i).getText();
			String item = cartItem.split(" ")[1];
			int price = Integer.parseInt(item);
			sum = sum + price;
		}
		String expected = fullTotalPrice.getText().split(" ")[1];
		Assert.assertEquals(sum, Integer.parseInt(expected));

	}

	public void clickCheckoutFromCheckoutPage() {
		checkoutButtonFromCheckoutPage.click();
	}




}
