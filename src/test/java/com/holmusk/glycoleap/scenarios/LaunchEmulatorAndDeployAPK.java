package com.holmusk.glycoleap.scenarios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchEmulatorAndDeployAPK {
	
	protected AndroidDriver driver;
	public String app_package_name = "com.holmusk.glycoleap:id/";

	@BeforeTest
	protected void prepareAndroidForAppium() throws MalformedURLException {
		File appDir = new File("E://Workspace//");
		File app = new File(appDir, "glyco_test.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("device", "emulator-5554");

		// mandatory capabilities
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformName", "Android");

		// other caps
		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}	
   
    
        
    

