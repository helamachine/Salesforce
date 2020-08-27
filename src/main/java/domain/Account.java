package domain;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
		wait.until(ExpectedConditions.visibilityOf(fa.getDetailTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable(fa.getEditButton2())).click();
		//wait.until(ExpectedConditions.elementToBeClickable(fa.getEditButton("Account Name"))).click();
		for(Map.Entry<String, String> me : args.entrySet()) {
			WebElement aux=fa.getEditFields(me.getKey());
			System.out.println(me.getKey());
			aux=aux.findElement(By.xpath("*"));
			aux.sendKeys(me.getValue());
			aux.sendKeys(Keys.ENTER);
			
			/*if(aux.findElement(By.xpath("*")).getTagName().equals("input")) {
				aux.sendKeys(me.getValue());
				aux.sendKeys(Keys.ENTER);
			}else {
				aux=aux.findElement(By.xpath("*"))
				aux.sendKeys(me.getValue());
				aux.sendKeys(Keys.ENTER);
			}*/
			
			
		}
		
	}
}
