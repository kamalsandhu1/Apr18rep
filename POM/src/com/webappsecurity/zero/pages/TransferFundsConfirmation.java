package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement sccMsg;
	
	public String getConfMsg() {
		String confmsg = sccMsg.getText();
		
		return confmsg;
	}
		public TransferFundsConfirmation(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
	}
		
}
