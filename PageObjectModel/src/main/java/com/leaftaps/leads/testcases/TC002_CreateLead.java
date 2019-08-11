package com.leaftaps.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.base.ProjectSpecificMethods;
import com.leaftaps.leads.pages.CreateLead;
import com.leaftaps.leads.pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
	}
	/*@Test(dataProvider="fetchData")
	public void runLogin(String username, String password) {
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickcrmsfa()
		.ClickMyLeads()
		.ClickCreateLead();
	}*/
		@Test(dataProvider="fetchData")
		public void runCreateLead(String fname,String Lname, String cname) {
		new CreateLead()
		.EnterFirstName(fname)
	    .EnterLastName(Lname)
	    .EnterCompanyName(cname)
	    .ClickCreatebutton();
		
	}
		//.clickLogout();
		
		/*LoginPage page = new LoginPage();
		page.enterUsername();
		page.enterPassword();
		page.clickLogin();
		
		HomePage page1 = new HomePage();
		page1.clickLogout();*/
		
		}







