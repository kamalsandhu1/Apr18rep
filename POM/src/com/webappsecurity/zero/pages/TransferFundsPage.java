package com.webappsecurity.zero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {

	@FindBy(id = "tf_fromAccountId")
	private WebElement fromAcc;
	
	@FindBy(id = "tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id = "tf_amount")
	private WebElement tfAmt;
	
	@FindBy(id = "tf_description")
	private WebElement tfdesc;
	
	@FindBy(id = "btn_submit")
	private WebElement sbmt;
	
	public void trnsfFnds(String amt, String desc) {
		
		Select fromDD = new Select(fromAcc);
		fromDD.selectByIndex(2);
		
		Select toDD = new Select(toAcc);
		toDD.selectByIndex(3);
		
		tfAmt.sendKeys(amt);
		tfdesc.sendKeys(desc);
		
		sbmt.click();
	}
		public TransferFundsPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		
		
		
	}
	
}
