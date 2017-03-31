// Yet to be implemented 
package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SigninWithBlankFields extends LaunchEmulatorAndDeployAPK{
	 @Test
	 public void signinWithInvalidCredentials() throws Exception{
	   //Launch Page
   	    By signInBtn = By.id(app_package_name + "btn_sign_in");
   		System.out.println("Clicking on Sign in button");
   		driver.findElement(signInBtn).click();

	   //Sign In without entering any details
   		System.out.println("SignIn");
   		driver.findElement(signInBtn).click();
   		Thread.sleep(1000);

           } 
}

