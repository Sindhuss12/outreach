package com.becognizant.pageobjects;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {
	WebDriver driver;
	//locators
	By settingLogo_loc = By.xpath("//button[@title = 'Settings']/div/span");
	By accManagerLogo_loc = By.xpath("//div[@class='ohcfXYh6LUBy5DS5kNUjRQ==']");
	By userName_loc=By.xpath("//div[@id='mectrl_currentAccount_primary']");
	By emailId_loc=By.xpath("//div[@id='mectrl_currentAccount_secondary']");
	By onec_loc=By.xpath("//div[@title='OneCognizant' ]");
	
	//constructor
	public homePage(WebDriver driver){
		this.driver=driver;
	}
	
	//click on profile to get account details
	public void clickAccDetails() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(settingLogo_loc));
		Thread.sleep(5000);
		WebElement btn = driver.findElement(accManagerLogo_loc);
		btn.click();
	}
	
	//get username from profile
	public String getuserName() throws InterruptedException{
		
		
		WebElement txtName = null;
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
			Thread.sleep(10000);
			txtName = wait2.until(ExpectedConditions.visibilityOfElementLocated(userName_loc));
		} catch (TimeoutException e) {
			try {
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
				Thread.sleep(10000);
				txtName = wait2.until(ExpectedConditions.visibilityOfElementLocated(userName_loc));
			} catch (NoSuchElementException v) {
				v.getMessage();
			}
		}
		System.out.println("Username: "+txtName.getText());
		return txtName.getText();
	}
	
	//get email id from profile
	public String getuserEmail() throws InterruptedException {
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(50));
		WebElement txtEmail = wait3.until(ExpectedConditions.visibilityOfElementLocated(emailId_loc));
		Thread.sleep(10000);
		Thread.sleep(5000);

		Thread.sleep(5000);
		System.out.println("Email id: "+txtEmail.getText());
		return txtEmail.getText();
	}
	
	//select onecognizant
	public void select_onec() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1800)", "");
	    //selecting one cognizant
	    driver.findElement(onec_loc).click();
	    Thread.sleep(10000);
	}
	
	//verify one cognizant
	public String verifyOneC() throws InterruptedException {

		WebElement AroundCogni = driver.findElement(onec_loc);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", AroundCogni);
		Thread.sleep(5000);
		WebElement webapp = driver.findElement(onec_loc);

		return webapp.getText();
	}
	
	//click on onecognizant
	public void clickOnOneC() throws InterruptedException {
		Thread.sleep(5000);
		WebElement cog = driver.findElement(onec_loc);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", cog);

	}
}
