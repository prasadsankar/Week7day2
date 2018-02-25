package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage enterComName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleCompanyName,data);
		return this;		
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage enterFirstName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleFirstName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage enterLastName(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(eleLastName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNum;
	
	public CreateLeadPage enterPhoneNumber(String data) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		type(elePhoneNum,data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickSubmit;
	
	public ViewLeadPage clickSubmit() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickSubmit);
		return new ViewLeadPage();		
	}
	

			
	}
	
	
	
	
	


