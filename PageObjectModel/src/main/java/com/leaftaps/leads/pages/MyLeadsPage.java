package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {

	public MyLeadsPage() { // Pagefactory code
	}
	
	public CreateLead ClickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}
}
