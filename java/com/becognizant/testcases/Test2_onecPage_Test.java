package com.becognizant.testcases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.becognizant.pageobjects.onecPage;
import com.becognizant.utilities.Screenshot;
//import com.outreach.pages.OneCognizant;
//import com.becognizant.pageobjects.onecPage;

public class Test2_onecPage_Test extends BasicTest {
  @Parameters({"browser"})
  @Test
  public void navigate_outreach(String br) throws InterruptedException, IOException {
	  onecPage one= new onecPage(driver);
	  one.switchToOneCogniHandle();
	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  
	  if(br.equalsIgnoreCase("chrome")) {
			one.clickOnSearchChrome();
			Screenshot s= new Screenshot(driver);
	        s.screenshot("Test3");
			one.searchOutReachChrome("outreach");
			
		}else if(br.equalsIgnoreCase("edge")) {
			one.clickOnSearchEdge();
			one.searchOutreachEdge("outreach");
		}
	  System.out.println("Test 3 Navigate to outreach- passed");
	  
	  
  }
}
