package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class RegisterUserWithExistingUsers extends LaunchEmulatorAndDeployAPK {

	@Test
	public void registerWithExistingUsers() throws Exception{
    
    	   //Launch Page
            By registerBtn = By.id(app_package_name + "btn_register");
            System.out.println("Clicking on register button");
            driver.findElement(registerBtn).click();
           //Register screen
            By btn_signup_email = By.id(app_package_name + "btn_signup_email");
            System.out.println("Clicking on signup email button");
            driver.findElement(btn_signup_email).click();
           //Sign up Screen
            By fullname = By.id(app_package_name + "et_name");
            System.out.println("Typing Full name");
            driver.findElement(fullname).sendKeys("TestQA Prasan");
           //Enter Email Address 
            By email = By.id(app_package_name + "et_email");
            System.out.println("Typing Mail ID");
            driver.findElement(email).sendKeys("testprasan4@test.com");
     	   //Enter Password          
            By passwrd = By.id(app_package_name + "et_password");
            System.out.println("Typing password");
            driver.findElement(passwrd).sendKeys("password");
     	   //Submit Registration            
            By submitBtn = By.id(app_package_name + "btn_signup");
            System.out.println("Clicking on Submit button");
            driver.findElement(submitBtn).click();
            Thread.sleep(3000);
     	   //Check if error message is displayed         
            By errorMessage = By.id(app_package_name + "tv_trouble");
            boolean result = driver.findElement(errorMessage).isDisplayed();
            System.out.println("The error message is displayed: " + result);
            String text=driver.findElement(errorMessage).getText();
            System.out.println("The error message text is : " + text);
     	   //Click OK         
            By clickOK = By.id(app_package_name + "btn_dialog_trouble_ok");
            System.out.println("Clicking on Submit button");
            driver.findElement(clickOK).click();    
    	  }	
}
