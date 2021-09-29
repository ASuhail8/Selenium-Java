package com.qa.everything;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	public static WebDriver driver;

	public static String loadProperties(String property) throws Exception {
		FileInputStream fis = new FileInputStream(
				"D:\\Abdulla Suhail\\work\\SuhailWorkSpace\\Selenium-Java\\src\\main\\java\\com\\qa\\everything\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(property);
	}

	public WebDriver launchBrowser(String urlStringName) {
		String url;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		try {
			url = loadProperties(urlStringName);
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	@AfterMethod
	public static void quitBrowser() {
	//	driver.quit();
	}

}
