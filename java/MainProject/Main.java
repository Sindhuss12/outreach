package MainProject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, Throwable{
		WebDriver driver = null;
		String browser="edge";
		if(browser.equalsIgnoreCase("Chrome")) {
			//launch Chrome
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			//launch Edge
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
		}
		//open url
		driver.get("https://be.cognizant.com");
		Thread.sleep(12000);
		//getting user information
		WebElement profile =driver.findElement(By.xpath("//button[@id='O365_MainLink_Me']"));
		profile.click();
		Thread.sleep(10000);
		String userName = driver.findElement(By.xpath("//div[@id=\\\"mectrl_currentAccount_primary\\\"]")).getText();
		System.out.println("User information:");
		System.out.println("Username: "+userName);
		Thread.sleep(2000);
		String emailId = driver.findElement(By.xpath("//div[@id=\"mectrl_currentAccount_secondary\"]")).getText();
		System.out.println("emailId: "+emailId);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1800)", "");
	     //selecting one cognizant
	     driver.findElement(By.xpath("//div[normalize-space()='OneCognizant' and @id='QuicklinksItemTitle']")).click();
	     Thread.sleep(10000);
	     Set<String> se = driver.getWindowHandles();
	     List<String> li = new ArrayList<String>(se);
	     Set<String> windows = driver.getWindowHandles();
         for (String OneCognizant : windows) 
		{
	            driver.switchTo().window(OneCognizant);
	    }
	     //clicking search bar
	     driver.findElement(By.xpath("//li[@class=\"searchTopBar\" ]")).click();
	     Thread.sleep(10000);
	     //entering text
	     driver.findElement(By.id("oneCSearchTop")).sendKeys("Outreach");
	     Thread.sleep(10000);
	     //selecting Outreach
	     driver.findElement(By.xpath("//div[contains(text(),'Outreach')]")).click();
	     Thread.sleep(10000);
	     driver.switchTo().frame("appFrame");
	     //print all menu
	     System.out.println("Printing menu:");
	     List<WebElement>menu =driver.findElements(By.xpath("//a[@class='nav-link dropdown-toggle' or @class='nav-link']"));
	     for(int i=0;i<menu.size();i++)
	     {
	    	 String s= menu.get(i).getText();
	    	 System.out.println(s);
	     }
	     Thread.sleep(10000);
	     //print all submenu
	     /*System.out.println("Printing submenu:");
	     List<WebElement>submenu = driver.findElements(By.xpath("//div[@class='dropdown-menu']//a[@class='dropdown-item' or @class='dropdown-item ']"));
	     for(int i=0;i<submenu.size();i++)
	     {
	    	 String s= submenu.get(i).getText();
	    	 System.out.println(s);
	     }
	     Thread.sleep(10000);*/
	     System.out.println("Printing submenu:");
	     Actions action=new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[1]/a"))).perform();
		 Thread.sleep(3000);
		 //driver.switchTo().frame("appFrame");
		 String firstDropdown =driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[1]/div/a")).getText();
		 System.out.println(firstDropdown);
		 Thread.sleep(3000);
		 action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[2]/a"))).perform();
		 Thread.sleep(3000);
		 action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[3]/a"))).perform();
		 Thread.sleep(3000);
		 List<WebElement> donate = driver.findElements(By.xpath("/html/body/div[1]/nav/ul/li[3]/div"));
		 for(int i=0 ;i<donate.size(); i++)
		 	{
			     System.out.println(donate.get(i).getText());
			}	
		 action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[4]/a"))).perform();
		 Thread.sleep(3000);
		 List<WebElement> explore = driver.findElements(By.xpath("/html/body/div[1]/nav/ul/li[4]/div"));
		 for(int i=0 ;i<explore.size(); i++)
		 {
			 System.out.println(explore.get(i).getText());
		 }	
		 action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[5]/a"))).perform();
		 Thread.sleep(3000);
		 List<WebElement> readmore = driver.findElements(By.xpath("/html/body/div[1]/nav/ul/li[5]/div"));
		 for(int i=0 ;i<readmore.size(); i++)
		 {
			 System.out.println(readmore.get(i).getText());
		 }	
		 Thread.sleep(2000);
		 List<WebElement>  Interests=driver.findElements(By.xpath("//div[@class='title_event']"));
		 for(int i=0 ;i<Interests.size(); i++)
		 {
			 System.out.println(Interests.get(i).getAttribute("title"));
		 }
		 Thread.sleep(10000);
		 action.moveToElement(driver.findElement(By.xpath("//div[@title='Search']"))).perform();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//span[@class='vieweventDrop']")).click();
		 Thread.sleep(10000);
		 WebElement ds= driver.findElement(By.xpath("//*[@id=\"jsonEventType\"]"));
		 Select eee= new Select(ds);
		 eee.selectByVisibleText(" Environment ");
		 Thread.sleep(10000);
		 WebElement dsd= driver.findElement(By.xpath("//*[@id=\"jsonWeekType\"]"));
		 Select eeed= new Select(dsd);
		 eeed.selectByVisibleText(" Both ");
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).sendKeys("2024-03-31");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("2024-04-09");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"eventsHomeSearchBtn\"]")).click();
		 Thread.sleep(5000);
	     //event based on interest
	     System.out.println("Event based on interests:");
	     List<WebElement> events = driver.findElements(By.xpath("//div[@class=\"title_event\"]"));
	     for(int i=0;i<events.size();i++)
	     {
	    	 String s= events.get(i).getText();
	    	 System.out.println(s);
	     }
	     Thread.sleep(10000);
	     //clicking dropdown
	    // driver.findElement(By.xpath("//span[@class=\"vieweventDrop\"]")).click();

	     //clicking on My Volunteering
	    driver.findElement(By.xpath("/html/body/div/nav/ul/li[2]/a")).click();
	    Thread.sleep(10000);
	     //clicking on Volunteers around me
	     driver.findElement(By.xpath("//*[@id='divvolteer']")).click();
	     Thread.sleep(10000);
	     //printing all the cards
	     System.out.println("Printing cards:");
	    List<WebElement> cards =driver.findElements(By.xpath("//div[@class='profilevoltext']"));
	    for(int i=0;i<cards.size();i++)
	     {
	    	 String s= cards.get(i).getText();
	    	 System.out.println(s);
	     }

	     Thread.sleep(10000);
	     driver.close();
		
		
		
		
		/*WebDriver driver = null;
		String browser="edge";
		if(browser.equalsIgnoreCase("Chrome")) {
			//launch Chrome
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			//launch Edge
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
		}
		//open url
		driver.get("https://be.cognizant.com");
		Thread.sleep(10000);
		//getting user information
		WebElement profile =driver.findElement(By.xpath("//button[@id='O365_MainLink_Me']"));
		profile.click();
		Thread.sleep(5000);
		String userName = driver.findElement(By.xpath("//div[@id=\"mectrl_currentAccount_primary\"]")).getText();
		System.out.println(userName);
		Thread.sleep(2000);
		String emailId = driver.findElement(By.xpath("//div[@id=\"mectrl_currentAccount_secondary\"]")).getText();
		System.out.println(emailId);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,1800)", "");
	     //selecting one cognizant
	     driver.findElement(By.xpath("//div[normalize-space()='OneCognizant' and @id='QuicklinksItemTitle']")).click();
	     Thread.sleep(10000);
	     Set<String> se = driver.getWindowHandles();
	     List<String> li = new ArrayList<String>(se);
	     Set<String> windows = driver.getWindowHandles();
         for (String OneCognizant : windows) 
		{
	            driver.switchTo().window(OneCognizant);
	    }
	     //clicking search bar
	     driver.findElement(By.xpath("//li[@class=\"searchTopBar\" ]")).click();
	     Thread.sleep(10000);
	     //entering text
	     driver.findElement(By.id("oneCSearchTop")).sendKeys("Outreach");
	     Thread.sleep(10000);
	     //selecting Outreach
	     driver.findElement(By.xpath("//div[contains(text(),'Outreach')]")).click();
	     Thread.sleep(10000);
	     driver.switchTo().frame("appFrame");
	     //print all menu
	     List<WebElement>menu =driver.findElements(By.xpath("//a[@class='nav-link dropdown-toggle' or @class='nav-link']"));
	     for(int i=0;i<menu.size();i++)
	     {
	    	 String s= menu.get(i).getText();
	    	 System.out.println(s);
	     }
	     Thread.sleep(10000);
	     //print all submenu
	     Actions action=new Actions(driver);
		  action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[1]/a"))).perform();
		  Thread.sleep(3000);
		  //driver.switchTo().frame("appFrame");
		  String firstDropdown =driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[1]/div/a")).getText();
		  System.out.println(firstDropdown);
		  Thread.sleep(3000);
		  action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[2]/a"))).perform();
		  Thread.sleep(3000);
		  action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[3]/a"))).perform();
		  Thread.sleep(3000);
		  List<WebElement> donate = driver.findElements(By.xpath("/html/body/div[1]/nav/ul/li[3]/div"));
			for(int i=0 ;i<donate.size(); i++)
			{
			     System.out.println(donate.get(i).getText());
			}	
			  action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[4]/a"))).perform();
			  Thread.sleep(3000);
			  List<WebElement> explore = driver.findElements(By.xpath("/html/body/div[1]/nav/ul/li[4]/div"));
				for(int i=0 ;i<explore.size(); i++)
				{
				     System.out.println(explore.get(i).getText());
				}	
				 action.moveToElement(driver.findElement(By.xpath("/html/body/div/nav/ul/li[5]/a"))).perform();
				  Thread.sleep(3000);
				  List<WebElement> readmore = driver.findElements(By.xpath("/html/body/div[1]/nav/ul/li[5]/div"));
					for(int i=0 ;i<readmore.size(); i++)
					{
					     System.out.println(readmore.get(i).getText());
					}	
					Thread.sleep(2000);
					List<WebElement>  Interests=driver.findElements(By.xpath("//div[@class='title_event']"));
					for(int i=0 ;i<Interests.size(); i++)
					{
					     System.out.println(Interests.get(i).getAttribute("title"));
					}
					Thread.sleep(10000);
 
					 action.moveToElement(driver.findElement(By.xpath("//div[@title='Search']"))).perform();
					 Thread.sleep(10000);
					 driver.findElement(By.xpath("//span[@class='vieweventDrop']")).click();
					 Thread.sleep(10000);
					 WebElement ds= driver.findElement(By.xpath("//*[@id=\"jsonEventType\"]"));
					 Select eee= new Select(ds);
					 eee.selectByVisibleText(" Environment ");
					 Thread.sleep(10000);
					 WebElement dsd= driver.findElement(By.xpath("//*[@id=\"jsonWeekType\"]"));
					 Select eeed= new Select(dsd);
					 eeed.selectByVisibleText(" Both ");
					 Thread.sleep(10000);
					 driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).sendKeys("2024-03-31");
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@id=\"toDate\"]")).sendKeys("2024-04-09");
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@id=\"eventsHomeSearchBtn\"]")).click();
					 Thread.sleep(5000);
 
	     


	     //event based on interest
	     List<WebElement> events = driver.findElements(By.xpath("//div[@class=\"title_event\"]"));
	     for(int i=0;i<events.size();i++)
	     {
	    	 String s= events.get(i).getText();
	    	 System.out.println(s);
	     }
	     Thread.sleep(10000);
	     //clicking dropdown
	    // driver.findElement(By.xpath("//span[@class=\"vieweventDrop\"]")).click();
 
	     //clicking on My Volunteering
	    driver.findElement(By.xpath("/html/body/div/nav/ul/li[2]/a")).click();
	    Thread.sleep(10000);
	     //clicking on Volunteers around me
	     driver.findElement(By.xpath("//*[@id='divvolteer']")).click();
	     Thread.sleep(10000);
	     //printing all the cards
	    List<WebElement> cards =driver.findElements(By.xpath("//div[@class='profilevoltext']"));
	    for(int i=0;i<cards.size();i++)
	     {
	    	 String s= cards.get(i).getText();
	    	 System.out.println(s);
	     }
 
	     Thread.sleep(10000);
	     driver.close();*/
	}		
	 
}


