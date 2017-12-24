package dpintegrateexcel;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dpintegrateexceltestngannotationswdmethod.Annotations;




public class EditLead extends Annotations {

	//@Test(dependsOnMethods="week3day2.wdMethods.testCases.MergeLead.mergeLead1")
	
	@Test(dataProvider="fetchData")
	public void EditLead1(String firstNam, String companyNam) throws InterruptedException 
	{
						
	
				
				
				//Click Leads link
				
				//driver.findElementByLinkText("Leads").click();
				
				WebElement leads = locateElement("link", "Leads");
				click(leads);
				
			//Click Find leads
				
				WebElement findLeads = locateElement("link", "Find Leads");
				click(findLeads);
				
				
				//Enter first name
				
				WebElement firstName = locateElement("xpath", "(//*[@name='firstName'])[3]");
				type(firstName, firstNam);;
										
				
				//Click find leads button
				
				WebElement findLeads2 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
				click(findLeads2);					
				
								
				//Click on first resulting lead
				
				Thread.sleep(3000);
				
				WebElement leadIDofFirstResultinglead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
				click(leadIDofFirstResultinglead);
			
				
				//Verify title of the page
				
				String pageTitle = getTitle();
				
				System.out.println(pageTitle);
				
				//Click Edit
				
				Thread.sleep(3000);
				
				WebElement edit = locateElement("link", "Edit");
				click(edit);
				
				//Change the company name
				Thread.sleep(3000);
				WebElement companyName = locateElement("id", "updateLeadForm_companyName");
				type(companyName, companyNam);
				
				
				//Click Update
				
				WebElement smallSubmit = locateElement("class", "smallSubmit");
				click(smallSubmit);
				
				
				//Confirm the changed name appears
				
				
				WebElement changedCompanyName = locateElement("id", "viewLead_companyName_sp");
		
				String verifychangedCompanyName =getText(changedCompanyName);
				
				if(verifychangedCompanyName.contains("Sachinlf"))
				{
					System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}
				
				//Assert.assert("Sachinlf", verifychangedCompanyName);
				
				//Close the browser (Do not log out)
				closeBrowser();
				
				
				
			/*	
				WebElement noRecordsToDisplay = locateElement("xpath", "//div[contains(text(),'No records to display')]");
				String verifyMessage =getText(noRecordsToDisplay);
				
				if(verifyMessage.equals("No records to display"))
				{
					System.out.println("passed");
				}
				else
				{
					System.out.println("failed");
				}
*/
				
				
				


	}
	
	@DataProvider(name="fetchData")
	public static Object[][] getData()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="dpsachin1";
		data[0][1]="dpcompany1update";
		
		
		data[1][0]="dpsachin2";
		data[1][1]="dpcompany2update";
		
		
		return data;
		
		
	}

}
