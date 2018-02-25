package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{

	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement eleDupLead;

	public DuplicateLeadPage verDupLead(String data) {
		
		verifyPartialText(eleDupLead, data);
		return this;			
	}

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitButton;

	public DuplicateLeadPage clickSubmitButton() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleSubmitButton);
		return this;			
	}

}






