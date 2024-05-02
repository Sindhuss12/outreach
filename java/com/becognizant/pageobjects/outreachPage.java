package com.becognizant.pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.becognizant.utilities.Excel_data;
import com.becognizant.utilities.Screenshot;

public class outreachPage {
	WebDriver driver;
	//locators
	By menues_loc = By.xpath("//a[@class='nav-link dropdown-toggle' or @class='nav-link']");
    By submenu_loc = By.xpath("/html/body/div/nav/ul/li[1]/a");
    By firstDropdownbtn_loc = By.xpath("/html/body/div[1]/nav/ul/li[1]/div/a");
	By secondSubmenu_loc = By.xpath("/html/body/div/nav/ul/li[2]/a");
	By thirdSubmenu_loc = By.xpath("/html/body/div/nav/ul/li[3]/a");
	By donate_loc = By.xpath("/html/body/div[1]/nav/ul/li[3]/div");
	By fourthSubmenu_loc = By.xpath("/html/body/div/nav/ul/li[4]/a");
	By explore_loc = By.xpath("/html/body/div[1]/nav/ul/li[4]/div");
	By fifthSubmenu_loc = By.xpath("/html/body/div/nav/ul/li[5]/a");
	By readmore_loc = By.xpath("/html/body/div[1]/nav/ul/li[5]/div");
	By moveFromReadMore_loc = By.xpath("//*[@id=\"viewevents-admin\"]");
	By interests_loc = By.xpath("//div[@class='title_event']");
	By searchbtn_loc = By.xpath("//div[@title='Search']");
	By viewDropDown_loc = By.xpath("//span[@class='vieweventDrop']");
	By BaseLocation_loc = By.xpath("//*[@id='jsonBaseLocation']");
	By EventType_loc = By.xpath("//*[@id='jsonEventType']");
	By WeekType_loc = By.xpath("//*[@id='jsonWeekType']");
	By fromDate_loc = By.xpath("//*[@id='fromDate']");
	By toDate_loc = By.xpath("//*[@id='toDate']");
	By eventsHomeSearchBtn_loc = By.xpath("//button[@type='submit'][@title='Search']");
	By events_loc = By.xpath("//button[@class='title_event']");
	By myVolunteering_loc = By.xpath("/html/body/div/nav/ul/li[2]/a");
	By VolunteersAm_loc = By.xpath("//*[@id='divvolteer']");
    By Cards_loc = By.xpath("//div[@class='profilevoltext']");

	//constructor
	public outreachPage(WebDriver driver) {
		this.driver=driver;
	}
	public void switchFrame() {
	     driver.switchTo().frame("appFrame");
	        
   }
//printing all the menues 
public void printMenues() 
	{List<WebElement> menu= driver.findElements(menues_loc);
	System.out.println("Menu and submenu : ");
	for(int i=0;i<menu.size();i++)
    {
   	 String s= menu.get(i).getText();
   	 System.out.println(s);
    }
	}

//printing all the submenues
public void eventsSubMenue()  
	{
	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait1.until(ExpectedConditions.elementToBeClickable(submenu_loc));
		
	 Actions action=new Actions(driver);
	 WebElement subm=driver.findElement(submenu_loc);
	 action.moveToElement(subm).build().perform();
	 
	 WebElement first=driver.findElement(firstDropdownbtn_loc);
	 String firstDropdown =(first).getText();
	 System.out.println(firstDropdown);
	 
	}

//click on 'upcoming'
public void click_upcoming()
{
	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait1.until(ExpectedConditions.elementToBeClickable(submenu_loc));
		
	 Actions action=new Actions(driver);
	 WebElement subm=driver.findElement(submenu_loc);
	 action.moveToElement(subm).build().perform();
	 
	driver.findElement(firstDropdownbtn_loc).click();
	
	 
}

//move to next submenu
public void moveToSecondSubMenu() throws InterruptedException 
	{
	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait1.until(ExpectedConditions.elementToBeClickable(secondSubmenu_loc));   
	 
	 Actions action=new Actions(driver);
	    WebElement subm=driver.findElement(secondSubmenu_loc);
		action.moveToElement(subm).perform();
	 
	}

	//move to next submenu
	public void moveToThirdSubMenu() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(thirdSubmenu_loc));  
		
		 Actions action=new Actions(driver);
		    WebElement subm=driver.findElement(thirdSubmenu_loc);
			action.moveToElement(subm).perform();
			
			List<WebElement> subme=driver.findElements(donate_loc);
			for(int i=0 ;i<subme.size(); i++)
			{
			     System.out.println(subme.get(i).getText());
			}	
		
	}
	
	//move to next submenu
	public void moveToFourthSubMenu() throws InterruptedException 
	{
		Actions action;
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 wait1.until(ExpectedConditions.elementToBeClickable(fourthSubmenu_loc));  
		action=new Actions(driver);
	    WebElement subm=driver.findElement(fourthSubmenu_loc);
		action.moveToElement(subm).perform();
		
		List<WebElement> subme=driver.findElements(explore_loc);
		for(int i=0 ;i<subme.size(); i++)
		{
		     System.out.println(subme.get(i).getText());
		}	
	}
	
	//move to next submenu
	public void moveToFifthSubMenu() throws InterruptedException 
	{   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait1.until(ExpectedConditions.elementToBeClickable(fifthSubmenu_loc));  
		Actions action=new Actions(driver);
	    WebElement subm=driver.findElement(fifthSubmenu_loc);
		action.moveToElement(subm).perform();
		List<WebElement> subme=driver.findElements(readmore_loc);
		for(int i=0 ;i<subme.size(); i++)
		{
		     System.out.println(subme.get(i).getText());
		}	
	}
	
	//printing interested events
	public void printInterests() throws InterruptedException 
	{  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
   wait1.until(ExpectedConditions.elementToBeClickable(moveFromReadMore_loc));  
   Actions action=new Actions(driver);
   WebElement subm=driver.findElement(moveFromReadMore_loc);
	action.moveToElement(subm).perform();
	
	List<WebElement> subme=driver.findElements(interests_loc);
	System.out.println("Interested events: ");
	for(int i=0 ;i<subme.size(); i++)
	{
	     System.out.println(subme.get(i).getAttribute("title"));
	}	
	System.out.println("Search Results:");
	
		
	}
	
	//searching events by filter
	public void searchEvents() throws InterruptedException, IOException 
	{
		Actions action=new Actions(driver);
		WebElement s=driver.findElement(searchbtn_loc);
		action.moveToElement(s).perform();
		Excel_data da=new Excel_data();
		String[] datas=da.excel_read();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait1.until(ExpectedConditions.elementToBeClickable(viewDropDown_loc)); 
		WebElement dd=driver.findElement(viewDropDown_loc);
		dd.click();
		Thread.sleep(7000);
		WebElement loc=driver.findElement(BaseLocation_loc);
		Select selectingLocation = new Select(loc);
		selectingLocation.selectByVisibleText(datas[0]);
		WebElement et=driver.findElement(EventType_loc);
		Select selectingEventType = new Select(et);
		selectingEventType.selectByVisibleText(datas[1]);
		WebElement wt=driver.findElement(WeekType_loc);
		Select selectingWeekType = new Select(wt);
		selectingWeekType.selectByVisibleText(datas[2]);
		
		WebElement from=driver.findElement(fromDate_loc);
		from.sendKeys(datas[3]);
		WebElement to=driver.findElement(toDate_loc);
	    to.sendKeys(datas[4]);
	    
	    Thread.sleep(5000);
	    action=new Actions(driver);
		driver.findElement(searchbtn_loc).click();
	    
	    Screenshot sd= new Screenshot(driver);
       sd.screenshot("Test6_1");
	    WebElement ehs=driver.findElement(eventsHomeSearchBtn_loc);
		(ehs).click();
		
		
		
		
	}
	
	public void random_location() throws IOException, InterruptedException
	{
		Actions action;
		action=new Actions(driver);
		WebElement s=driver.findElement(searchbtn_loc);
		action.moveToElement(s).perform();
		Excel_data da=new Excel_data();
		String[] datas=da.excel_read();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait1.until(ExpectedConditions.elementToBeClickable(viewDropDown_loc)); 
		WebElement dd=driver.findElement(viewDropDown_loc);
		dd.click();
		Thread.sleep(7000);
		WebElement loc=driver.findElement(BaseLocation_loc);
		Select selectingLocation = new Select(loc);
		
		WebElement from=driver.findElement(fromDate_loc);
		from.sendKeys(datas[3]);
		Thread.sleep(5000);
		WebElement to=driver.findElement(toDate_loc);
	    to.sendKeys(datas[4]);
	    Thread.sleep(5000);
	    action=new Actions(driver);
		driver.findElement(searchbtn_loc).click();
		
		List <WebElement> elementCount = selectingLocation.getOptions();
		Random rand = new Random();
      String ran_loc=elementCount.get(rand.nextInt(elementCount.size())).getText();
		
		selectingLocation.selectByVisibleText(ran_loc);
	    Screenshot sd= new Screenshot(driver);
       sd.screenshot("Test7_1");
	    WebElement ehs=driver.findElement(eventsHomeSearchBtn_loc);
		(ehs).click();
		
		
		
		
		
	}
	
	//print searched events
	public void printsearchedEvents() throws InterruptedException 
	{   Thread.sleep(5000);
		List<WebElement> subme=driver.findElements(events_loc);
		for(int i=0 ;i<subme.size(); i++)
		{   
		     String r=subme.get(i).getText();
		     if(r.length()>2)
		     {
		    	 System.out.println(r);
		     }
		}	
		
	}
	public void clickOnMyVolunteering() 
	{
       driver.findElement(myVolunteering_loc).click();
       System.out.println("Test requirement: My Volunteering button is clicked");
       

	}
	
	//click my volunteers
	public void clickVolunteersAm() throws InterruptedException {
    	Thread.sleep(5000);
    	
    	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(VolunteersAm_loc));
		
        driver.findElement(VolunteersAm_loc).click();
    }
	
	//printing the cards
    public void printCards()
	{   List<WebElement> Cards=driver.findElements(Cards_loc);
		System.out.println("Cards: ");
		for(int i=0;i<Cards.size();i++)
	     {
	    	 String s= Cards.get(i).getText();
	    	 System.out.println(s);
	    	 
	     }
	}
}
