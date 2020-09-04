package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Setup.DriverConfig;
import domain.Account;
import domain.Global;

import Setup.ExcelReader;
import Setup.URLmaker;
import domain.Login;
import factory.FAccount;

@Test
public class TestCRUDAccount extends TestingBase {
	
	/*@Test //(dataProvider = "accountInfo")
	public void createAccount() {
		WebDriver driver=initializeAndLoginbyVMarguments("chrome");
		Global g=new Global(driver);
		g.goToApps("Accounts");
		Account a=new Account(driver);
		FAccount fa=new FAccount(driver);
		fa.getDetailTab().click();
	}*/
	/*@Test (dataProvider = "accountInfo")
	public void editAccount(String accountName, String parentAccount, String accountNumber, String rating, String phone, String fax, 
			String website, String accountSite, String tickerSymbol, String type, String ownership, String industry, String employees, 
			String annualRevenue, String sicCode, String billingStreet, String shippingStreet, String billingZipPostalCode, String shippingZipPostalCode, 
			String billingCity, String billingStateProvince, String shippingCity, String shippingStateProvince, String billingCountry, 
			String shippingCountry, String customerPriority, String sla, String slaExpirationDate, String slaSerialNumber, String numberOfLocations, 
			String upsellOpportunity, String active, String description) {
		WebDriver driver = initializeAndLogin("chrome");
		Account a=new Account(driver);
		//a.editAccount(accountName, parentAccount, accountNumber, rating, phone, fax, website, accountSite, tickerSymbol, type, ownership, industry, employees, annualRevenue, sicCode, billingStreet, shippingStreet, billingZipPostalCode, shippingZipPostalCode, billingCity, billingStateProvince, shippingCity, shippingStateProvince, billingCountry, shippingCountry, customerPriority, sla, slaExpirationDate, slaSerialNumber, numberOfLocations, upsellOpportunity, active, description);
		
	}*/
	@Test (dataProvider = "accountInfo")
	public void editAccountDos(Hashtable<String,String> args) {
		WebDriver driver = initializeAndLoginbyVMarguments("chrome");
		Account a=new Account(driver);
		System.out.println(args.get("Account Name"));

		a.editAccount(args);
		
	}
	
	@Test 
	public void goToURLCreated() {
		WebDriver driver = initializeAndLoginbyVMarguments("chrome");
		URLmaker um = new URLmaker(driver);
		um.goToURLCreated("Account");
	}
	@DataProvider(name="accountInfo")
	public Object[][] data() {
		ExcelReader excel=new ExcelReader("Data");
		Object[][] ob=excel.getData();
		return ob;
	}
	
	/*public WebDriver initializeAndLogin(String browser) {
		WebDriver driver=DriverConfig.getDriverInitializer(browser); 
		driver.get(url);
		Login login=new Login(driver);
		login.login(adminUser, password);
		return driver;
	}*/
	public WebDriver initializeAndLoginbyVMarguments(String browser) {
		WebDriver driver=DriverConfig.getDriverInitializer(browser); 
		driver.get(System.getProperty("url"));
		Login login=new Login(driver);
		login.login(System.getProperty("email"),System.getProperty("password"));
		return driver;
	}
}
