package domain;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	public void editAccount(HashMap<String,String> args) {
		fa.getDetailTab().click();
		fa.getEditButton("Account Name").click();
		for(Map.Entry<String, String> me : args.entrySet()) {
			/*WebElement aux=fa.getEditFields(me.getKey());
			aux.sendKeys(me.getValue());
			aux.sendKeys(Keys.ENTER);*/
			fa.getEditFields(me.getKey()).sendKeys(me.getValue(), Keys.ENTER);
		}
		
	}
}
