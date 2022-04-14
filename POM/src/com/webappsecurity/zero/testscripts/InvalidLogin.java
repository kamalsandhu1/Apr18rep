package com.webappsecurity.zero.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.Login;

public class InvalidLogin extends Base {

@Test

	public void invalidLogin() {
	Login lp = new Login(driver);
	
	lp.applicationLogin("huhuihjkj","jhiuhu");
	String txt = lp.isErrVisible();
	String expectedtext = "Login and/or password are wrong.";
	Assert.assertEquals(txt, expectedtext);
	
	
}
}
