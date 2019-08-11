package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	
	public CreateLead() {  //pagefactory
	}
		public CreateLead EnterFirstName(String Fname) {
			driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
			return this;
		}
		public CreateLead EnterLastName(String Lname) {
			
			driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
			return this;
		}
		
		public CreateLead EnterCompanyName(String cname) {
			driver.findElementById("createLeadForm_companyName").sendKeys(cname);
			return this;
		}
		
		public ViewLead ClickCreatebutton() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLead();
		}
	}
	
    
    
    


