package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{

	public MyLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;

	public CreateLeadPage clickCreateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreateLead);
		return new CreateLeadPage();			
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;

	public FindLeadsPage clickFindLeads() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleFindLead);
		return new FindLeadsPage();			
	}


}






