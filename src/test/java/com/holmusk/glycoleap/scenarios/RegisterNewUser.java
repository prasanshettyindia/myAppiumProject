package com.holmusk.glycoleap.scenarios;


//import org.fluttercode.datafactory.impl.DataFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.holmusk.glycoleap.utilities.RandomNames;

public class RegisterNewUser extends LaunchEmulatorAndDeployAPK{

	@Test
	public void registerNewUser() throws Exception{
    		
    	   //Launch Page
            By registerBtn = By.id(app_package_name + "btn_register");
            System.out.println("Clicking on register button");
            driver.findElement(registerBtn).click();
            
           //Register screen
            By btn_signup_email = By.id(app_package_name + "btn_signup_email");
            System.out.println("Clicking on signup email button");
            driver.findElement(btn_signup_email).click();
           //Sign up Screen
           //Enter Full Name
            By fullname = By.id(app_package_name + "et_name");
            System.out.println("Typing Full name");
            driver.findElement(fullname).sendKeys("TestQA Prasan");
           //Enter Email Address
            By email = By.id(app_package_name + "et_email");
            System.out.println("Typing Mail ID");
            driver.findElement(email).sendKeys(RandomNames.randomNames() + "@test.com");
           //Enter password
            By passwrd = By.id(app_package_name + "et_password");
            System.out.println("Typing password");
            driver.findElement(passwrd).sendKeys("password");
           //Submit Registration 
            By submitBtn = By.id(app_package_name + "btn_signup");
            System.out.println("Clicking on Submit button");
            driver.findElement(submitBtn).click();
            Thread.sleep(3000);
           //Check if Successful Registration message is displayed
            By successMessage = By.id(app_package_name + "tv_success_text");
            boolean result = driver.findElement(successMessage).isDisplayed();
            System.out.println("The success message is displayed: " + result);
            String text=driver.findElement(successMessage).getText();
            System.out.println("The success message text is : " + text);
            Thread.sleep(3000);
           }   		
}

// Yet to be implemented 
/* By btnTC = By.id(app_package_name + "btn_tc");
   By nextBtn = By.id(app_package_name + "btn_next");
   By selectOption = By.id(app_package_name + "cb_none");
   By selectGender = By.id(app_package_name + "btn_male");
   By selectHeight = By.id(app_package_name + "et_height	");
   By selectWeight = By.id(app_package_name + "et_weight");
   By selectEthnicity = By.id(app_package_name + "et_ethinicity");
   By selectEthnicityOption = By.id(app_package_name + "select_dialog_listview");
   By submitDetails = By.id(app_package_name + "btn_submit");
   By startApp = By.id(app_package_name + "btn_startapp");
   By firstEntry = By.id(app_package_name + "fabMain");
   By logFood = By.id(app_package_name + "fab_food");
   By gotTutorial = By.id(app_package_name + "btn_dialog_tutorial_ok");
   
   //signin page
   By username = By.id(app_package_name + "et_email");
   By password = By.id(app_package_name + "et_password");
   By signIn = By.id(app_package_name + "btn_sign_in");
   By register = By.id(app_package_name + "btn_signuptrial");


   driver.findElement(nextBtn).click();
   Thread.sleep(3000);
   driver.findElement(selectOption).click();
   Thread.sleep(3000);
   driver.findElement(nextBtn).click();
   driver.findElement(selectGender).click();
   Thread.sleep(3000);
   
   driver.findElement(selectHeight).sendKeys("170");
   
   driver.findElement(selectWeight).sendKeys("60");
   driver.findElement(selectEthnicity).click();
   Thread.sleep(3000);
   driver.findElement(selectEthnicityOption).click();
   Thread.sleep(3000);
   driver.findElement(submitDetails).click();
   Thread.sleep(3000);
   driver.findElement(startApp).click();
   Thread.sleep(3000);
   driver.findElement(firstEntry).click();
   Thread.sleep(3000);
   driver.findElement(logFood).click();
   Thread.sleep(3000);
   driver.findElement(gotTutorial).click();
   
*/


