package com.becognizant.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.becognizant.pageobjects.homePage;
import com.becognizant.utilities.*;
//import com.becognizant.utilities.Screenshot;
//import com.outreach.pages.BeCognizant;
//import com.becognizant.pageobjects.homePage;

public class Test1_homepage_Test extends BasicTest {

    
	@Test(priority = 1)
	public void getInfo() throws InterruptedException, IOException {
        
		
		homePage hp = new homePage(driver);
		hp.clickAccDetails();
        Screenshot s= new Screenshot(driver);
        s.screenshot("Test1");
		Assert.assertEquals(hp.getuserName(), "Sindhu, S (Contractor)");
		Assert.assertEquals(hp.getuserEmail(), "2327231@cognizant.com");
		System.out.println("Test 1 in home page - user info retrieval-passed");

	}
	
	@Test(priority = 2)
	public void verifyOneCogni() throws IOException, InterruptedException {
		homePage hp = new homePage(driver);
		//be.clickAccDetails();
		assertEquals(hp.verifyOneC(), "OneCognizant");
		Screenshot s= new Screenshot(driver);
        s.screenshot("Test2");
		hp.clickOnOneC();
		Thread.sleep(5000);
		 System.out.println("Test 2 in home page - oneC click- passed");
	}

}
