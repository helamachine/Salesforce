package domain;

import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factory.FAccount;
import utility.GeneralUtilities;

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
	
	public void editAccount(Hashtable<String,String> args) {
		wait.until(ExpectedConditions.visibilityOf(fa.getDetailTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable(fa.getEditButton2())).click();   			//path to details and activate edition in fields
		//wait.until(ExpectedConditions.elementToBeClickable(fa.getEditButton("Account Name"))).click();
		for(Map.Entry<String, String> me : args.entrySet()) {											// Iterate through Hashtable obtaining all variables
																	
			boolean dataInserted=false;																	//Creating condition for data insertion
			boolean oneWay=false;																		//boolean to scrollIntoView (Up or Down)
			while(!dataInserted) {																		//While data is not inserted, scroll one way or the other
				WebElement aux=null;
				try {																					//try catch to handle exceptions when element is not interactable
					aux=fa.getEditFields(me.getKey());													//Obtaining div WebElement under label
					aux=aux.findElement(By.xpath("*"));													//Getting div first child
					if(me.getKey().equals("Parent Account")) {											//if-elseif condition for different types of WebElements (dropDown, dynamic DropDown, input/textarea)
						//WebElement parentAccount=driver.findElement(By.xpath("//*[@placeholder='Search Accounts...']"));
						aux=aux.findElement(By.xpath("//input"));										
						aux.click();
						aux.sendKeys(me.getValue());
						fa.getDropDownParentAccount(me.getValue()).click();
						break;																			//breaking while loop in case of correct insertion
					}else if(aux.getTagName().equals("input") || aux.getTagName().equals("textarea")) {
						aux.clear();
						aux.sendKeys(me.getValue());
					}else {
						aux.sendKeys(me.getValue());
						aux=aux.findElement(By.xpath("*"));
						wait.until(ExpectedConditions.attributeContains(aux, "aria-expanded", "true"));
						GeneralUtilities.waitForLoad(300);
					}
					
					
					aux.sendKeys(Keys.ENTER);
					dataInserted=true;
				}catch(Exception ex) {
					System.out.println(aux+"===="+aux.toString());
					ex.printStackTrace();//*****MUST IMPROVE PRECISION WITH CORRECT EXCEPTION****
					GeneralUtilities.scrollToViewElement(driver,aux.findElement(By.xpath("./..")),oneWay);							//In case of exception, look for element somewhere else
					oneWay=!oneWay;																		//Executes code twice, 
					if(!oneWay) {
						break;
					}
				}
			}			
		}
		
	}
}
