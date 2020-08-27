package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.CtsAccount;

public class FAccount {
	
	WebDriver driver;
	public FAccount (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	//ACCOUNT TABS
	@FindBy (xpath = CtsAccount.detailTab)private WebElement detailTab;
	
	//ACCOUNT INFO
	@FindBy (xpath = CtsAccount.AccountName)private WebElement accountName;
	@FindBy (xpath = CtsAccount.ddMenuRating)private WebElement ddMenuRating;
	@FindBy (css = CtsAccount.rating)private WebElement rating;
	@FindBy (xpath = CtsAccount.phone)private WebElement phone;
	@FindBy (xpath = CtsAccount.fax)private WebElement fax;
	@FindBy (css = CtsAccount.parentAccount)private WebElement parentAccount;
	@FindBy (xpath = CtsAccount.accountNumber)private WebElement accountNumber;
	@FindBy (xpath = CtsAccount.webSite)private WebElement webSite;
	@FindBy (xpath = CtsAccount.accountSite)private WebElement accountSite;
	@FindBy (xpath = CtsAccount.tickerSymbol)private WebElement tickerSymbol;
	@FindBy (xpath = CtsAccount.employees)private WebElement employees;
	@FindBy (xpath = CtsAccount.annualRevenue)private WebElement annualRevenue;
	@FindBy (xpath = CtsAccount.sicCode)private WebElement sicCode;
	//falta el menuText con el --None--
	
	//ADRESS INFO
	@FindBy (css = CtsAccount.billingStreet)private WebElement billingStreet;
	@FindBy (css = CtsAccount.shippingStreet)private WebElement shippingStreet;
	@FindBy (css = CtsAccount.billingPostal)private WebElement billingPostal;
	@FindBy (css = CtsAccount.shippingPostal)private WebElement shippingPostal;
	@FindBy (css = CtsAccount.billingCity)private WebElement billingCity;
	@FindBy (css = CtsAccount.billingState)private WebElement billingState;
	@FindBy (css = CtsAccount.shippingCity)private WebElement shippingCity;
	@FindBy (css = CtsAccount.shippingState)private WebElement shippingState;
	@FindBy (css = CtsAccount.billingCountry)private WebElement billingCountry;
	@FindBy (css = CtsAccount.shippingCountry)private WebElement shippingCountry;
	
	//ADITIONAL INFO
	@FindBy (xpath = CtsAccount.customerPriority)private WebElement customerPriority;
	@FindBy (xpath = CtsAccount.sla)private WebElement sla;
	@FindBy (xpath = CtsAccount.slaExpirationDate)private WebElement slaExpirationDate;
	@FindBy (xpath = CtsAccount.slaSerialNumber)private WebElement slaSerialNumber;
	@FindBy (xpath = CtsAccount.numberOfLocation)private WebElement numberOfLocation;
	@FindBy (xpath = CtsAccount.upsellOpportunity)private WebElement upsellOpportunity;
	@FindBy (xpath = CtsAccount.active) private WebElement active;
	
	//DESCRIPTION INFO
	@FindBy (css = CtsAccount.description)private WebElement description;
	
	//ACCOUNT DETAILS
	@FindBy (xpath = CtsAccount.editButton2) private WebElement editButton2;
	
	
	
	public WebElement getEditButton2() {
		return editButton2;
	}



	


	
	public WebElement getDetailTab() {
		return detailTab;
	}



	public WebElement getAccountName() {
		return accountName;
	}



	public WebElement getDdMenuRating() {
		return ddMenuRating;
	}



	public WebElement getRating() {
		return rating;
	}



	public WebElement getPhone() {
		return phone;
	}



	public WebElement getFax() {
		return fax;
	}



	public WebElement getParentAccount() {
		return parentAccount;
	}



	public WebElement getAccountNumber() {
		return accountNumber;
	}



	public WebElement getWebSite() {
		return webSite;
	}



	public WebElement getAccountSite() {
		return accountSite;
	}



	public WebElement getTickerSymbol() {
		return tickerSymbol;
	}



	public WebElement getEmployees() {
		return employees;
	}



	public WebElement getAnnualRevenue() {
		return annualRevenue;
	}



	public WebElement getSicCode() {
		return sicCode;
	}



	public WebElement getBillingStreet() {
		return billingStreet;
	}



	public WebElement getShippingStreet() {
		return shippingStreet;
	}



	public WebElement getBillingPostal() {
		return billingPostal;
	}



	public WebElement getShippingPostal() {
		return shippingPostal;
	}



	public WebElement getBillingCity() {
		return billingCity;
	}



	public WebElement getBillingState() {
		return billingState;
	}



	public WebElement getShippingCity() {
		return shippingCity;
	}



	public WebElement getShippingState() {
		return shippingState;
	}



	public WebElement getBillingCountry() {
		return billingCountry;
	}



	public WebElement getShippingCountry() {
		return shippingCountry;
	}



	public WebElement getCustomerPriority() {
		return customerPriority;
	}



	public WebElement getSla() {
		return sla;
	}



	public WebElement getSlaExpirationDate() {
		return slaExpirationDate;
	}



	public WebElement getSlaSerialNumber() {
		return slaSerialNumber;
	}



	public WebElement getNumberOfLocation() {
		return numberOfLocation;
	}



	public WebElement getUpsellOpportunity() {
		return upsellOpportunity;
	}



	public WebElement getActive() {
		return active;
	}



	public WebElement getDescription() {
		return description;
	}
	
	//REPLACEABLE
	public WebElement getEditFields(String fieldName) {
		return driver.findElement(By.xpath(CtsAccount.editFields.replace("$x", fieldName)));
	}
	
	public WebElement getEditButton(String label) {
		return driver.findElement(By.xpath(CtsAccount.editButton.replace("$x", label)));
	}

}


