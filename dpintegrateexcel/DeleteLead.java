package dpintegrateexcel;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dpintegrateexceltestngannotationswdmethod.Annotations;





public class DeleteLead extends Annotations {

	//@Test(dependsOnMethods="week3day2.wdMethods.testCases.MergeLead.mergeLead1")
	
	@Test(dataProvider="fetchData")
	public void deleteLead1(String phoneCountryCod, String phoneAreaCod, String phoneNum ) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//primaryPhoneCountryCode
		//primaryPhoneAreaCode
		//primaryPhoneNumber
		
				// TODO Auto-generated method stub
				String leadIDCheck = "10957";
				
				// Launch ChromeDriver
				
					   /*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriverlatest.exe");
						ChromeDriver driver = new ChromeDriver();*/
						
						// Launch opentabs
						
						//driver.get("http://leaftaps.com/opentaps");
						
						// Maximize
						
						//driver.manage().window().maximize();
						
						// Implicitly wait
						
						//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
						
						
					
										
						/*
						
						// Click CRM link Text
						//driver.findElementByLinkText("CRM/SFA").click();
						
						WebElement crm = locateElement("link", "CRM/SFA");
						click(crm);
						
						
						// Create Lead 1 
						//String fromField = "10449";
						
						CreateLead createLead1 = new CreateLead();
						String fromField  = createLead1.getCompanyID(se);							
							
											
						*/
						
						//Click Leads link
						
						//driver.findElementByLinkText("Leads").click();
						
						WebElement leads = locateElement("link", "Leads");
						click(leads);
						
					//Click Find leads
						
						WebElement findLeads = locateElement("link", "Find Leads");
						click(findLeads);
						
						
						//Click on Phone
						
						WebElement phone = locateElement("link", "Phone");
						click(phone );
						
						
						//Enter phone number
						
						//phoneCountryCode
						
						WebElement phoneCountryCode = locateElement("xpath", "//*[@name='phoneCountryCode']");
						type(phoneCountryCode, phoneCountryCod);
						
						
						//phoneAreaCode
						
						WebElement phoneAreaCode = locateElement("xpath", "//*[@name='phoneAreaCode']");
						type(phoneAreaCode, phoneAreaCod);
						
						
						//phoneNumber
						
						WebElement phoneNumber = locateElement("xpath", "//*[@name='phoneNumber']");
						type(phoneNumber, phoneNum);
						
						//Click find leads button
						
						WebElement findLeads2 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
						click(findLeads2);
						
						
						//primaryPhoneCountryCode
						//primaryPhoneAreaCode
						//primaryPhoneNumber
						
						//Capture lead ID of First Resulting lead
						
						Thread.sleep(3000);
						
						WebElement leadIDofFirstResultinglead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
						click(leadIDofFirstResultinglead);
						
						//Click First Resulting lead
						
						/*WebElement firstResultingLead = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
						click(firstResultingLead);*/
						
						//Click Delete
						
						WebElement delete = locateElement("link", "Delete");
						click(delete);
						
						// Click Find leads
						
						Thread.sleep(3000);
						WebElement findLeads3 = locateElement("link", "Find Leads");
						click(findLeads3);
						
						
						
						//Enter captured lead ID
						
						Thread.sleep(3000);
						
						WebElement leadsID3 = locateElement("xpath", "//label[contains(text(),'Lead ID:')]/following::input");
						type(leadsID3, leadIDCheck);
						
						//Click find leads button
						
						WebElement findLeads4 = locateElement("xpath", "//button[contains(text(),'Find Leads')]");
						click(findLeads4);
						
						
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


						
						System.out.println("Delete Lead");
						closeBrowser();
	


	}
	@DataProvider(name="fetchData")
	public static Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		data[0][0] = "2";
		data[0][1]=  "3";
		data[0][2] = "4";
		
		data[1][0]="5";
		data[1][1] ="6";
		data[1][2]="7";
		
		//primaryPhoneCountryCode
		//primaryPhoneAreaCode
		//primaryPhoneNumber
		
		return data;
	}

}
