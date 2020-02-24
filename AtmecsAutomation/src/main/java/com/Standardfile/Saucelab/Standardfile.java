package com.Standardfile.Saucelab;

import java.io.File;
import java.util.Properties;

public class Standardfile {

	public final static String Home_file = System.getProperty("user.dir") + File.separator;
	
	public final static String Home_config = Home_file + "drivers" + File.separator;
	public final static String Driver_config = Home_config + "geckodriver.exe";
	
	public final static String Home_Xpath = Home_file + "resources" + File.separator + "Xpath" + File.separator;
	public final static String Xpath_config = Home_Xpath + "Xpath.properties";

}