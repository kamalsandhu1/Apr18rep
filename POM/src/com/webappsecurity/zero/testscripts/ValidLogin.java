package com.webappsecurity.zero.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccountSummary;
import com.webappsecurity.zero.pages.Login;

public class ValidLogin extends Base {

	@Test
	public void verifyValidLogin() {
		
	
	
	Login lpt = new Login(driver);
	AccountSummary sum = new AccountSummary(driver);
	
	lpt.applicationLogin("username","password");
	driver.navigate().back();
	boolean isTfPresent = sum.isTransferFundsDisplayer();
	Assert.assertTrue(isTfPresent);
	
	}
	
	
}
