package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignupWithInvalidUPID extends LaunchEmulatorAndDeployAPK {
	@Test
	public void displayUniqueProgramIDDetails() throws Exception{
    		
    	   //Launch Page
            By registerBtn = By.id(app_package_name + "btn_register");
            System.out.println("Clicking on register button");
            driver.findElement(registerBtn).click();
           //Register screen
            By btn_signup_upid = By.id(app_package_name + "btn_signup_upid");
            System.out.println("Clicking on signup with UPID button");
            driver.findElement(btn_signup_upid).click();
           //Enter Invalid UPID
            By enterInvalidUPID = By.id(app_package_name + "et_pid");
            System.out.println("Enter invalid UPID");
            driver.findElement(enterInvalidUPID).sendKeys("invalidID");
           //Trying to submit invalid Unique Program ID
            By clickNext = By.id(app_package_name + "btn_submit");
            System.out.println("Click Next button");
            driver.findElement(clickNext).click();
    		Thread.sleep(1000);
  		   //Check if Error Message is displayed
            By errorMessage = By.id(app_package_name + "snackbar_text");
            boolean result = driver.findElement(errorMessage).isDisplayed();
            System.out.println("The error message is displayed: " + result);
            String text=driver.findElement(errorMessage).getText();
            System.out.println("The error message text is : " + text);
	}
}
