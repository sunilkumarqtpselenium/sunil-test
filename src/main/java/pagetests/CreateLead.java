package pagetests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;






public class CreateLead extends ProjectMethods{
	
	
	@BeforeClass	
	public void setValues()
	{
		excelName ="createlead";
		testcaseName="Create Lead";
		testDescription="Create a new Lead";
		author="Babu1";
		category="smoke";
		browserName = "chrome";	
		
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String cName,String fName,String lName,String phoneCountryCod, String phoneAreaCod, String phoneNum) {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickCreateLead()
		.verifyFirstName(fName)
		.closeBrowser();
		
	}
}
