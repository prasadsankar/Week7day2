package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_DuplicateLead";
		testDescription="Create a Duplicate lead and verify company name";
		testNodes="Leads";
		category="Smoke";
		authors="Ram";
		browserName="chrome";
		dataSheetName="DuplicateLead";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String email,String dupLead) {
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
		.clickFindLeads()
		.clickEmail()
		.enterEmailAddress(email)
		.clickFindLeadButton()
		.getResultLead()
		.clickResultLead()
		.clickDuplicateLead()
		.verDupLead(dupLead);
			
		
	}

}
