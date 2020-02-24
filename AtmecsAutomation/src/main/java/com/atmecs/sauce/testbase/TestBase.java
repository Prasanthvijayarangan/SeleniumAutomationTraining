package com.atmecs.sauce.testbase;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.sauce.utils.ReadLocatorsfile;

public class TestBase {
	
	public static WebDriver driver;
	public Properties properties;
	String url;

	@BeforeTest
	public void Launchpage() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\prasanth.v\\Documents\\sample projects\\Atmecs\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		properties = ReadLocatorsfile.loadProperty("C:\\Users\\prasanth.v\\Documents\\sample projects\\Saucelab\\resources\\Configuration\\config.properties");
		url = properties.getProperty("url");
		System.out.println("URL is: "+url);
		driver.get(url);
		
	}
}
