

//Tried using this for more abstraction but was facing issues
package com.holmusk.glycoleap.pages;

import org.openqa.selenium.By;

import com.holmusk.glycoleap.scenarios.LaunchEmulatorAndDeployAPK;

import io.appium.java_client.android.AndroidDriver;

public class SigninPage extends LaunchEmulatorAndDeployAPK{

    By signInBtn = By.id(app_package_name + "btn_sign_in");
	By enterEmail = By.id(app_package_name + "et_email");
	By enterPassword = By.id(app_package_name + "et_password");
	
	public void signInProcess(String username, String password){
		System.out.println("Clicking on Sign in button");
		driver.findElement(signInBtn).click();
		System.out.println("Enter valid Email");
		driver.findElement(enterEmail).sendKeys(username);
		System.out.println("Enter password");
		driver.findElement(enterPassword).sendKeys(password);
		System.out.println("SignIn");
		driver.findElement(signInBtn).click();
	
	}
}
