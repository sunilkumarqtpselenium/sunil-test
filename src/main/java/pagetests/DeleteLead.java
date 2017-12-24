package pagetests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.ProjectMethods;



public class DeleteLead extends ProjectMethods{
	
	
	@BeforeClass	
	public void setValues()
	{
		excelName ="deletelead";
		testcaseName="delete Lead";
		testDescription="delete Lead";
		author="Litan CTS";
		category="sanity";
		browserName = "chrome";	
		
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void editLead(String leadID,String fName,String lName,String phoneCountryCod, String phoneAreaCod, String phoneNum) {
		new MyHomePage(driver,test)
		.clickLeadTab()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadsButton()
		.clickResultOfFirstElement()
		.clickDelete()
		.clickFindLeads()
		.typeLeadId(leadID)
		.clickFindLeadsButton()
		.verifyNoRecordsToDisplayText()
		.closeBrowser();
		
		
		}
}
