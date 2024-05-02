package com.becognizant.testcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.becognizant.utilities.Screenshot;
import com.becognizant.pageobjects.outreachPage;
//import com.outreach.pages.VolenteersAroundMe;
//import com.becognizant.pageobjects.outreachPage;
//import com.becognizant.pageobjects.outreachPage;

public class Test3_outreachPage_Test extends BasicTest {
@Test(priority=1)
  public void print_menu() {
	  
	outreachPage o =new outreachPage(driver);
	  o.switchFrame();
	  o.printMenues();
  }
  
  @Test(priority=2)
  public void print_submenu() throws InterruptedException, IOException {
	  
	  outreachPage o =new outreachPage(driver);
	  o.eventsSubMenue();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test4-1");
	  o.moveToSecondSubMenu();
      s.screenshot("Test4-2");
	  o.moveToThirdSubMenu();
      s.screenshot("Test4-3");
	  o.moveToFourthSubMenu();
      s.screenshot("Test4-4");
	  o.moveToFifthSubMenu();
	  System.out.println("Test 4 Menu and subMenu printing - passed");
	  
  }
  @Test(priority=3)
public void print_interest() throws InterruptedException, IOException {
	  
	  outreachPage o =new outreachPage(driver);
	  
	  Thread.sleep(5000);
	 
	  o.printInterests();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test5");
      System.out.println("Test 5 interested events printing - passed");
   }
  @Test(priority=4)
  public void validatesearch() throws InterruptedException, IOException {
	  outreachPage o =new outreachPage(driver);
	  o.searchEvents();
	  try {
	  o.printsearchedEvents();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test6");}
  catch(Exception e)
  {
	  System.out.println("No such data");
  }
	  System.out.println("Test 6 data validation - passed");
  }
  
  @Test(priority=5)
  public void validatedate() throws InterruptedException, IOException {
	  outreachPage o =new outreachPage(driver);
	  o.random_location();
	 try {
	  o.printsearchedEvents();
	  Screenshot s= new Screenshot(driver);
      s.screenshot("Test7");}
	 catch(NoSuchElementException e)
	  {
		  System.out.println("No Elements in the specified dates");
		  Screenshot s= new Screenshot(driver);
	      s.screenshot("Test7");
	  }
	 System.out.println("Test 7 random data validation - passed");
	  
}
@Test(priority=6)
public void click_vol() throws IOException {
	outreachPage o =new outreachPage(driver);
	o.clickOnMyVolunteering();
	Screenshot s= new Screenshot(driver);
    s.screenshot("Test8");
    System.out.println("Test 8 My volunteers clicking - passed");
}
@Test(priority=7)
public void fetch_cards() throws InterruptedException, IOException {
	outreachPage m= new outreachPage(driver);
	  m.clickVolunteersAm();
	  Thread.sleep(5000);
	  Screenshot s= new Screenshot(driver);
	  s.screenshot("Test9");
	  m.printCards();
	  System.out.println("Test 9 data cards printing - passed");  
}
}

