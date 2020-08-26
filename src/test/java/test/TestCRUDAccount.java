package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Setup.DriverConfig;
import domain.Account;
import domain.Global;

import Setup.ExcelReader;

import domain.Login;
import factory.FAccount;

@Test
public class TestCRUDAccount extends TestingBase {
	
	@Test //(dataProvider = "accountInfo")
	public void createAccount() {
		WebDriver driver=initializeAndLogin("chrome");
		FAccount fa=new FAccount(driver);
		fa.getDetailTab().click();
		
		
	}
	
	/*@DataProvider(name="accountInfo")
	public Object[][] data() {
		ExcelReader excel=new ExcelReader("Data");
		Object[][] ob=excel.getData();
		return ob;
	}*/
	
	public WebDriver initializeAndLogin(String browser) {
		WebDriver driver=DriverConfig.getDriverInitializer(browser); 
		driver.get(url);
		Login login=new Login(driver);
		login.login(adminUser, password);
		return driver;
	}
}
