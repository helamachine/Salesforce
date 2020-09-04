package test;

import java.util.Hashtable;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Setup.DriverConfig;
import domain.Account;
import Setup.ExcelReader;
import Setup.URLmaker;
import domain.Login;

@Test
public class TestCRUDAccount extends TestingBase {
	
	/*@Test //(dataProvider = "accountInfo")
	public void createAccount() {
		WebDriver driver=initializeAndLogin("chrome");
		Global g=new Global(driver);
		g.goToApps("Accounts");
		Account a=new Account(driver);
		FAccount fa=new FAccount(driver);
		fa.getDetailTab().click();
	}*/
	
	@Test (dataProvider = "accountInfo")
	public void editAccountDos(Hashtable<String,String> args) {
		WebDriver driver = initializeAndLoginWithVMArguments("chrome");
		Account a=new Account(driver);

		a.editAccount(args);
		
	}
	
	@Test 
	public void goToURLCreated() {
		WebDriver driver = initializeAndLogin("chrome");
		URLmaker um = new URLmaker(driver);
		um.goToURLCreated("Account");
	}
	@DataProvider(name="accountInfo")
	public Object[][] data() {
		ExcelReader excel=new ExcelReader("Data");
		Object[][] ob=excel.getData();
		return ob;
	}
	
	public WebDriver initializeAndLogin(String browser) {
		WebDriver driver=DriverConfig.getDriverInitializer(browser); 
		driver.get(url);
		Login login=new Login(driver);
		login.login(adminUser, password);
		return driver;
	}
	public WebDriver initializeAndLoginWithVMArguments(String browser) {
		WebDriver driver=DriverConfig.getDriverInitializer(browser); 
		driver.get(System.getProperty("url"));
		Login login=new Login(driver);
		login.login(System.getProperty("email"), System.getProperty("password"));
		return driver;
	}
}
