package com.holmusk.glycoleap.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UniqueProgramIDDetails extends LaunchEmulatorAndDeployAPK {
	@Test
	public void displayUniqueProgramIDDetails() throws Exception{
    		
    	   //Launch Page
            By registerBtn = By.id(app_package_name + "btn_register");
            System.out.println("Clicking on register button");
            driver.findElement(registerBtn).click();
     	   //Clicking on "What's your UPID?"
            By upidDetails = By.id(app_package_name + "btn_what_pid");
            System.out.println("Clicking on 'Whats your UPID?' ");
            driver.findElement(upidDetails).click();  
      	   //Query 1
            By upidDetailsQuery1 = By.id(app_package_name + "tv_msgcontent");
            System.out.println("Query 1: How do i know if i have a unique Program ID? ");
            boolean isDisplayed=driver.findElement(upidDetailsQuery1).isDisplayed();
            System.out.println("Query 1 is displayed " + isDisplayed );
            String text1=driver.findElement(upidDetailsQuery1).getText();
            System.out.println("Query 1 answer is " + text1 ); 
       	   //Query 2
            By upidDetailsQuery2 = By.id(app_package_name + "tv_msgcontent2");
            System.out.println("Query 2: Where would I find it? ");
            boolean isDisplayed1=driver.findElement(upidDetailsQuery2).isDisplayed();
            System.out.println("Query 2 is displayed " + isDisplayed1 );
            String text2=driver.findElement(upidDetailsQuery1).getText();
            System.out.println("Query 2 answer is " + text2 );
           //Close query Dialog box
            By closeDialog = By.id(app_package_name + "btn_close");
            System.out.println("Closing the dialog box");
            driver.findElement(closeDialog).click();
	}
}
