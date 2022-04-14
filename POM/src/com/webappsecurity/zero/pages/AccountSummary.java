package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.CSS;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	@FindBy(css="#transfer_funds_link")
	private WebElement tranfFunds;
	
	public void clickTranFund() {
		tranfFunds.click();
	}
		public AccountSummary(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
		public boolean isTransferFundsDisplayer() {
			return tranfFunds.isDisplayed();
		}
	
}