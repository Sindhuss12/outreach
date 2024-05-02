Detailed Description:    
====================
Navigate to Be. Cognizant Website and capture the user information.
Click on One Cognizant Application.
Search Outreach in Search bar and click on Outreach application from search results.
Print all menus and submenus are visible while mouse over cursor.
Print Event details based on interest is visible in Outreach.
Validate Search event filter option based on Location, Event type, Weekend/Weekdays, From date and To date and print the search results.
Repeat Step 6 by selecting Random location.
Click on My Volunteering.
Click on Volunteers around me and Print all the Cards.


Key Automation Scope:
====================
Handling alert, different browser windows, search option.
Navigating back to home page.
Extract multiple options items & store in collections.
Capture warning message.
Data Driven approach.
Cross Browser Testing.

Tools and Technology:
====================
Selenium WebDriver
Apache POI 
TestNG
Extend Report
Listners
XML Beans

Solution Steps for the Problem Statement
==================

Search 'Be.cognizant'
Locate the profile,click the profile
Identify the Name and emailId
Click on the OneCognizant
Search OutReach,click the OutreachApp
Display all the menu and submenu in headerfile.
In search and select  Location, event type, Weekday/Weekends,From date,To date,click search
Get all the event displayed 
Again change the location and click search 
Get all the event displayed 
Goto My Volunteering and click Volunteers around me
Display all the functions.


Output:
==========
Browser opened with the provided url
Report object Initialised


Username: Sindhu, S (Contractor) 
Email id: 2327231@cognizant.com
Test 1 in home page - user info retrieval-passed
Test 2 in home page - oneC click- passed
Successfully Switches into 1C Page 

Test 3 Navigate to outreach- passed
Menu and submenu : 
Events
My Volunteering
Donate
Explore
Read More
Upcoming Events
Scholarship
Little Gift
Disaster Relief (iContribute)
Blood (Clife)
Impact Index
School Index
Ebook – On a purpose
Humans of Outreach
One Cause at a Time
Going Places
Volfiesta
Outreach Team
Facebook
Yammer
Test 4 Menu and subMenu printing - passed
Interested events: 
Splash the colors Paint the School Wall
Autism awareness ride
Wheelchair Table Tennis Training
Autism awareness walkathon
Splash the colors Paint the School Wall
Sapling Plantation and Maintenance at Keeranatham Kuttai
Sapling Plantation and Maintenance at Chinnavedampatti lake 
ConnectAbled empowering the Youth with Disabilities 
Unique Disability Identity Card Creation
Wheelchair Table Tennis Training
Wheel Chair Basketball Training
Search Results:
Test 5 interested events printing - passed
18:38:26.447 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
18:38:26.459 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 6 data validation - passed
18:39:06.169 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
18:39:06.171 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 7 random data validation - passed
Test requirement: My Volunteering button is clicked
Test 8 My volunteers clicking - passed
Cards: 
Education
Passion
Environment
Skilling
Digital empowerment
My Project
My City
My BU
My Grade
Test 9 data cards printing - passed
Apr 02, 2024 6:40:08 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 123, returning the closest version; found: 122; Please update to a Selenium version that supports CDP version 123
Username: Sindhu, S (Contractor)
Email id: 2327231@cognizant.com
Test 1 in home page - user info retrieval-passed
Test 2 in home page - oneC click- passed
Successfully Switches into 1C Page 

Test 3 Navigate to outreach- passed
Menu and submenu : 
Events
My Volunteering
Donate
Explore
Read More
Upcoming Events
Scholarship
Little Gift
Disaster Relief (iContribute)
Blood (Clife)
Impact Index
School Index
Ebook – On a purpose
Humans of Outreach
One Cause at a Time
Going Places
Volfiesta
Outreach Team
Facebook
Yammer
Test 4 Menu and subMenu printing - passed
Interested events: 
Splash the colors Paint the School Wall
Autism awareness ride
Wheelchair Table Tennis Training
Autism awareness walkathon
Splash the colors Paint the School Wall
Sapling Plantation and Maintenance at Keeranatham Kuttai
Sapling Plantation and Maintenance at Chinnavedampatti lake 
ConnectAbled empowering the Youth with Disabilities 
Unique Disability Identity Card Creation
Wheelchair Table Tennis Training
Wheel Chair Basketball Training
Search Results:
Test 5 interested events printing - passed
18:41:51.640 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
18:41:51.642 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 6 data validation - passed
18:42:50.805 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
18:42:50.805 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 7 random data validation - passed
Test requirement: My Volunteering button is clicked
Test 8 My volunteers clicking - passed
Cards: 
Education
Passion
Environment
Skilling
Digital empowerment
My Project
My City
My BU
My Grade
Test 9 data cards printing - passed

===============================================
Suite
Total tests run: 20, Passes: 20, Failures: 0, Skips: 0
===============================================

15:21:51.458 [main] WARN org.testng.xml.TestNGContentHandler - It is strongly recommended to add "<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.1.dtd" >" at the top of the suite file [C:\Users\2327231\Downloads\OutreachGroup5-2327236\OutreachGroup5\testng.xml] otherwise TestNG may fail or not work as expected.
15:21:51.562 [main] INFO org.testng.internal.Utils - [XmlSuite] [WARN] 'parallel' value 'false' is no longer valid, defaulting to 'none'.
Apr 03, 2024 3:21:56 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 118
Apr 03, 2024 3:21:56 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 118.0.5993.71. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.18.1` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
Username: Sindhu, S (Contractor)
Email id: 2327231@cognizant.com
Test 1 in home page - user info retrieval-passed
Test 2 in home page - oneC click- passed
Successfully Switches into 1C Page 

Test 3 Navigate to outreach- passed
Menu and submenu : 
Events
My Volunteering
Donate
Explore
Read More
Upcoming Events
Scholarship
Little Gift
Disaster Relief (iContribute)
Blood (Clife)
Impact Index
School Index
Ebook – On a purpose
Humans of Outreach
One Cause at a Time
Going Places
Volfiesta
Outreach Team
Facebook
Yammer
Test 4 Menu and subMenu printing - passed
Interested events: 
Splash the colors Paint the School Wall
Autism awareness ride
Wheelchair Table Tennis Training
Autism awareness walkathon
Splash the colors Paint the School Wall
Sapling Plantation and Maintenance at Keeranatham Kuttai
Sapling Plantation and Maintenance at Chinnavedampatti lake 
ConnectAbled empowering the Youth with Disabilities 
Unique Disability Identity Card Creation
Wheelchair Table Tennis Training
Wheel Chair Basketball Training
Search Results:
Test 5 interested events printing - passed
15:24:17.110 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
15:24:17.113 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 6 data validation - passed
15:24:57.529 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
15:24:57.530 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 7 random data validation - passed
Test requirement: My Volunteering button is clicked
Test 8 My volunteers clicking - passed
Cards: 
Education
Passion
Environment
Skilling
Digital empowerment
My Project
My City
My BU
My Grade
Test 9 data cards printing - passed
Apr 03, 2024 3:26:00 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 123, returning the closest version; found: 122; Please update to a Selenium version that supports CDP version 123
Username: Sindhu, S (Contractor)
Email id: 2327231@cognizant.com
Test 1 in home page - user info retrieval-passed
Test 2 in home page - oneC click- passed
Test 3 Navigate to outreach- passed
Menu and submenu : 
Events
My Volunteering
Donate
Explore
Read More
Upcoming Events
Scholarship
Little Gift
Disaster Relief (iContribute)
Blood (Clife)
Impact Index
School Index
Ebook – On a purpose
Humans of Outreach
One Cause at a Time
Going Places
Volfiesta
Outreach Team
Facebook
Yammer
Test 4 Menu and subMenu printing - passed
Interested events: 
Splash the colors Paint the School Wall
Autism awareness ride
Wheelchair Table Tennis Training
Autism awareness walkathon
Splash the colors Paint the School Wall
Sapling Plantation and Maintenance at Keeranatham Kuttai
Sapling Plantation and Maintenance at Chinnavedampatti lake 
ConnectAbled empowering the Youth with Disabilities 
Unique Disability Identity Card Creation
Wheelchair Table Tennis Training
Wheel Chair Basketball Training
Search Results:
Test 5 interested events printing - passed
15:28:41.768 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
15:28:41.768 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 6 data validation - passed
15:29:23.791 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /xl/_rels/workbook.xml.rels
15:29:23.792 [main] DEBUG org.apache.poi.openxml4j.opc.PackageRelationshipCollection - Parsing relationship: /_rels/.rels
Chennai
 Education 
Both
02-Apr-2024
09-Apr-2024

Test 7 random data validation - passed
Test requirement: My Volunteering button is clicked
Test 8 My volunteers clicking - passed
Cards: 
Education
Passion
Environment
Skilling
Digital empowerment
My Project
My City
My BU
My Grade
Test 9 data cards printing - passed
[INFO] [1;32mTests run: [0;1;32m20[m, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 511.76 s - in [1mTestSuite[m
[INFO] 
[INFO] Results:
[INFO] 
[INFO] [1;32mTests run: 20, Failures: 0, Errors: 0, Skipped: 0[m
[INFO] 
[INFO] [1m------------------------------------------------------------------------[m
[INFO] [1;32mBUILD SUCCESS[m
[INFO] [1m------------------------------------------------------------------------[m
[INFO] Total time:  08:40 min
[INFO] Finished at: 2024-04-03T15:30:23+05:30
[INFO] [1m------------------------------------------------------------------------

================================================================================================
Jar Files:
==========

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>Group5</groupId>
  <artifactId>Group5</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies><!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.18.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.7.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.5</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.xmlbeans/xmlbeans -->
<dependency>
    <groupId>org.apache.xmlbeans</groupId>
    <artifactId>xmlbeans</artifactId>
    <version>5.2.0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.5</version>
</dependency>
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-api</artifactId>
  <version>2.0.6</version>
</dependency>


<!-- https://mvnrepository.com/artifact/ch.qos.logback/logback-classic -->
<dependency>
  <groupId>ch.qos.logback</groupId>
  <artifactId>logback-classic</artifactId>
  <version>1.4.5</version>
</dependency>

<dependency>
<groupId>org.apache.logging.log4j</groupId>
<artifactId>log4j-to-slf4j</artifactId>
<version>2.8.2</version>
</dependency>

<dependency>
			<groupId>com.aventstack</groupId>
			<artifactId>extentreports</artifactId>
			<version>5.1.1</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.15.1</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
			<version>3.14.0</version>
		</dependency>
            <!-- https://mvnrepository.com/artifact/org.testng/testng -->
  <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
     <version>7.9.0</version>
     <scope>test</scope>
 </dependency>

</dependencies>
</project>