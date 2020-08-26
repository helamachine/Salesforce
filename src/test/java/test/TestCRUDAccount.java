package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Setup.DriverConfig;

import domain.Global;

import Setup.ExcelReader;

import domain.Login;

@Test
public class TestCRUDAccount extends TestingBase {
	
	@Test (dataProvider = "accountInfo")
	public void createAccount() {
		
		WebDriver driver=initializeAndLogin("chrome");
		Global g=new Global(driver);
		g.goToApps();
	}
	
	@DataProvider(name="accountInfo")
	public Object[][] data() {
		ExcelReader excel=new ExcelReader("Data");
		Object[][] ob=excel.getData();
		return ob;
	}
	
	public WebDriver initializeAndLogin(String browser) {
		WebDriver driver=DriverConfig.getDriverInitializer(browser); 
		Login login=new Login(driver);		
		login.login(adminUser, password);
		return driver;
	}
}
