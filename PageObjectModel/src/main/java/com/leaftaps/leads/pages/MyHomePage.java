package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage() { // Pagefactory code
	}

	/*public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
		
	}*/
	public MyLeadsPage ClickMyLeads() {
	driver.findElementByXPath("//a[text()='Leads']").click();
	return new MyLeadsPage();
	}
	
	/*public CreateLead ClickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}*/
}
