package domain;

import org.openqa.selenium.WebDriver;

import factory.FAccount;

public class Account extends Global{
	private FAccount fa; 
	public Account(WebDriver driver) {
		super(driver);
		fa=new FAccount(driver);
		
	}
	public void createAccount(String accountName) {
		clickNew();
		fillRequiredData(accountName);
		clickSaveAndNew();
	}
	public void fillRequiredData(String accountName) {
		fa.getAccountName().sendKeys(accountName);
	}
}
