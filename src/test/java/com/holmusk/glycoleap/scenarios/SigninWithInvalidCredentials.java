package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SigninWithInvalidCredentials extends LaunchEmulatorAndDeployAPK{
	 @Test
	 public void signinWithInvalidCredentials() throws Exception{
		   //Launch Page
    	    By signInBtn = By.id(app_package_name + "btn_sign_in");
    		System.out.println("Clicking on Sign in button");
    		driver.findElement(signInBtn).click();
 		   //Enter Email address
    		By enterEmail = By.id(app_package_name + "et_email");
    		System.out.println("Enter invalid Email");
    		driver.findElement(enterEmail).sendKeys("testprasan4");
 		   //Enter Password
    		By enterPassword = By.id(app_package_name + "et_password");
    		System.out.println("Enter invalid password");
    		driver.findElement(enterPassword).sendKeys("xyzxsan");
 		   //Sign In
    		System.out.println("SignIn");
    		driver.findElement(signInBtn).click();
    		Thread.sleep(1000);
 		   //Check if Error Message is displayed
            By errorMessage = By.id(app_package_name + "snackbar_text");
            boolean result = driver.findElement(errorMessage).isDisplayed();
            System.out.println("The error message is displayed: " + result);
            String text=driver.findElement(errorMessage).getText();
            System.out.println("The error message text is : " + text);
            } 
}
