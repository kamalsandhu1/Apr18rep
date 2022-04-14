package com.webappsecurity.zero.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.AccountSummary;
import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFundsConfirmation;
import com.webappsecurity.zero.pages.TransferFundsPage;
import com.webappsecurity.zero.pages.TransferFundsVerify;

public class VerifyFundTransferTest extends Base{

	
		
	@Test
	public void verifyFundTransfer() {
		
		Login lp = new Login(driver);
		
		//driver.navigate().back();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#details-button")));
		AccountSummary acs = new AccountSummary(driver);

		TransferFundsPage tff = new TransferFundsPage(driver);
		TransferFundsVerify vrf = new TransferFundsVerify(driver);
		TransferFundsConfirmation cnf = new TransferFundsConfirmation(driver);
		
		lp.applicationLogin("username", "password");
		driver.navigate().back();
		acs.clickTranFund();
		tff.trnsfFnds("350", "find trand");
		vrf.clickSbmt();
		String actualText = cnf.getConfMsg();
		String expectedText = "You successfully submitted your transaction.";
		Assert.assertEquals(actualText, expectedText);
		
		
	}
		
	
	
	
	
	
}
