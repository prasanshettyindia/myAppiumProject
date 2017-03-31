package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Signin extends LaunchEmulatorAndDeployAPK{
	

	 @Test
	 public void signInByRegisteredUser() throws Exception{
		   //Launch Page
    	    By signInBtn = By.id(app_package_name + "btn_sign_in");
    		System.out.println("Clicking on Sign in button");
    		driver.findElement(signInBtn).click();
 		   //Enter Email address
    		By enterEmail = By.id(app_package_name + "et_email");
    		System.out.println("Enter valid Email");
    		driver.findElement(enterEmail).sendKeys("testprasan4@test.com");
 		   //Enter Password
    		By enterPassword = By.id(app_package_name + "et_password");
    		System.out.println("Enter password");
    		driver.findElement(enterPassword).sendKeys("password");
 		   //Sign In
    		System.out.println("SignIn");
    		driver.findElement(signInBtn).click();
    		Thread.sleep(3000);
 		   //Check if Success Message is displayed
            By successMessage = By.id(app_package_name + "tv_success_text");
            Thread.sleep(3000);
            boolean result = driver.findElement(successMessage).isDisplayed();
            System.out.println("The success message is displayed: " + result);
            String text=driver.findElement(successMessage).getText();
            System.out.println("The success message text is : " + text);
            } 
}
