package com.qa.everything;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtils {

	public Select selectDropdown(WebElement element) {
		Select select = new Select(element);
		return select;
	}

}
