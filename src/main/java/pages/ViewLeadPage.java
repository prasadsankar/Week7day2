package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVerCom;

	public ViewLeadPage verComName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyPartialText(eleVerCom, data);
		return this;			
	}

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;

	public DuplicateLeadPage clickDuplicateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleDuplicateLead);
		return new DuplicateLeadPage();			
	}

}






