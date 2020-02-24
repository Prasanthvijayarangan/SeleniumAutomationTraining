package com.atmecs.automation;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.pathallocator.Pathallocator;
import com.atmecs.sauce.testbase.TestBase;
import com.atmecs.sauce.utils.ReadLocatorsfile;

public class HomePage extends TestBase{
	
	
  Pathallocator path = new Pathallocator();
	
	@Test
	public void homePageTest() throws IOException {
		path.getdata();
		
		
		driver.findElement(By.xpath(path.getServices())).click();
		driver.findElement(By.xpath(path.getEnterpriseAnalytics())).click();
		driver.findElement(By.xpath(path.getPartners())).click();
		driver.findElement(By.xpath(path.getHomepage())).click();
		
		
		
		
	}
	
	

}
