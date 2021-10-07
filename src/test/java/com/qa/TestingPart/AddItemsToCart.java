package com.qa.TestingPart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.everything.BaseTest;

public class AddItemsToCart extends BaseTest {

	String[] products = { "Beetroot", "Brinjal", "Potato", "Carrot", "Cauliflower" };

	@Test
	public void addItemsToCartTest() {
		int sum = 0;
		int k = 0;
		driver = launchBrowser("greenKart");
		List<WebElement> allProducts = driver
				.findElements(By.xpath("//div[@class='products']/div[@class='product']//h4"));
		List<WebElement> addToCartButton = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		for (int i = 0; i < allProducts.size(); i++) {
			String product = allProducts.get(i).getText();
			for (int j = 0; j < products.length; j++) {
				if (product.contains(products[j])) {
					k++;
					addToCartButton.get(i).click();
				}

			}
			if (k == products.length) {
				break;
			}
		}
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//table[@id='productCartTables']//tbody//tr//td[5]//p"));
		for (int i = 0; i < price.size(); i++) {
			String amt = price.get(i).getText();
			int amount = Integer.parseInt(amt);
			sum = sum + amount;
		}
		System.out.println(sum);
		System.out.println(Integer.parseInt(driver.findElement(By.cssSelector("span.totAmt")).getText()));
		Assert.assertEquals(Integer.parseInt(driver.findElement(By.cssSelector("span.totAmt")).getText()), sum);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

}
