package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerify {
	
	@FindBy(id="btn_submit")
	private WebElement sbmtbtn;
	
	public void clickSbmt() {
		
		sbmtbtn.click();
	}
		public TransferFundsVerify(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
	
}

	
	