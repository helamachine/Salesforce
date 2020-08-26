package domain;

import org.openqa.selenium.WebDriver;

import factory.FAccount;

public class Account {
	
	public Account(WebDriver driver) {
		FAccount fa=new FAccount(driver);
		
	}
}
