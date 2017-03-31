package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SigninSupportMessage extends LaunchEmulatorAndDeployAPK {
	@Test
	 public void signInByRegisteredUser() throws Exception{
	   //Launch Page
   	    By signInBtn = By.id(app_package_name + "btn_sign_in");
   		System.out.println("Clicking on Sign in button");
   		driver.findElement(signInBtn).click();
		   //Check if Success Message is displayed
        By signinSupportMessage = By.id(app_package_name + "btn_trouble");
        Thread.sleep(3000);
        boolean result = driver.findElement(signinSupportMessage).isDisplayed();
        System.out.println("The signin support message is displayed: " + result);
        String text=driver.findElement(signinSupportMessage).getText();
        System.out.println("The signin support message text is : " + text);
	}
}
