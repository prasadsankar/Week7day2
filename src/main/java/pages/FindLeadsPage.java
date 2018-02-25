package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmail;

	public FindLeadsPage clickEmail() {
		
		click(eleEmail);
		return this;			
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailAddress;

	public FindLeadsPage enterEmailAddress(String data) {
		type(eleEmailAddress,data);
		return this;			
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadButton;

	public FindLeadsPage clickFindLeadButton() {
		click(eleFindLeadButton);
		return this;			
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
	private WebElement eleResultLead;

	public FindLeadsPage getResultLead() {
		String resultLeadName= getText(eleResultLead);
		System.out.println(resultLeadName);
		return this;			
	}
	
	
			//@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")
			//private WebElement eleResultLead;

			public ViewLeadPage clickResultLead() {
				click(eleResultLead);
				return new ViewLeadPage();			
			}
}






