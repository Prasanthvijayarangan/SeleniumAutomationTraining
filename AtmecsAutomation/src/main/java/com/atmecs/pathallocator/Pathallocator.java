package com.atmecs.pathallocator;

import java.io.IOException;
import java.util.Properties;

import com.Standardfile.Saucelab.Standardfile;
import com.atmecs.sauce.utils.ReadLocatorsfile;

public class Pathallocator {
	Properties properties;
	String Services;
	String EnterpriseAnalytics;
	String Partners;
	String Homepage;
	




	public void getdata() throws IOException {
		properties = ReadLocatorsfile.loadProperty(Standardfile.Xpath_config);
		setServices();
		setEnterpriseAnalytics();
		setHomepage();
		setPartners();
	}
	
	
	public String getServices() {
		return Services;
	}
	public void setServices() {
		Services = properties.getProperty("loc.button.services");
	}

	public String getEnterpriseAnalytics() {
		return EnterpriseAnalytics;
	}


	public void setEnterpriseAnalytics() {
		EnterpriseAnalytics = properties.getProperty("loc.button.enterprise Analytics");
	}
	

	public String getPartners() {
		return Partners;
	}


	public void setPartners() {
		Partners = properties.getProperty("loc.button.partners");
	}


	public String getHomepage() {
		return Homepage;
	}


	public void setHomepage() {
		Homepage = properties.getProperty("loc.button.home");
	}
	public static void main (String [] args) throws IOException {
		Pathallocator locator = new Pathallocator();
		locator.getdata();
	}

}
