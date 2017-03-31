package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ForgotPassword extends LaunchEmulatorAndDeployAPK{
	@Test
	public void forgotPassword() throws Exception{
    
    	   //Launch Page
            By signInBtn = By.id(app_package_name + "btn_sign_in");
            System.out.println("Clicking on Sign in button");
            driver.findElement(signInBtn).click();
           //Clicking on forgot password
            By forgotPasswordBtn = By.id(app_package_name + "btn_forgot_password");
            System.out.println("Clicking on forgot password");
            driver.findElement(forgotPasswordBtn).click();
           //Entering registered email address
            By enterEmail = By.id(app_package_name + "et_email");
            System.out.println("Enter registered email");
            driver.findElement(enterEmail).sendKeys("testprasan4@test.com");
           //Select OK
            By selectOK = By.id(app_package_name + "btn_submit");
            System.out.println("Select Ok button");
            driver.findElement(selectOK).click();
           //Check if prompt message is displayed and text displayed in the prompt message
            By promptMessage = By.id(app_package_name + "tv_dialog_message_promopt_message");
            Thread.sleep(3000);
            boolean promptMessageResult = driver.findElement(promptMessage).isDisplayed();
            System.out.println("The success message is displayed: " + promptMessageResult);
            String text=driver.findElement(promptMessage).getText();
            System.out.println("The success message text is : " + text);
           //Select OK
            By promptMessageOK = By.id(app_package_name + "btn_dialog_message_promopt_positive");
            System.out.println("Select prompt message Ok button");
            driver.findElement(promptMessageOK).click();
           }
}
