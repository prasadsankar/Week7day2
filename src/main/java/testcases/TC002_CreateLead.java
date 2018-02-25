package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create a lead and verify company name";
		testNodes="Leads";
		category="Smoke";
		authors="Ram";
		browserName="chrome";
		dataSheetName="CreateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String cName,String fName,String lName,String pNumber) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.clickCreateLead()
		.enterComName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhoneNumber(pNumber)
		.clickSubmit()
		.verComName(cName);
		
				
		
	}

}
