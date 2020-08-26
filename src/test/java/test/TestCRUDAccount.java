package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Setup.DriverConfig;
import Setup.ExcelReader;
import domain.Login;

@Test
public class TestCRUDAccount extends TestingBase {
	
	@Test (dataProvider = "accountInfo")
	public void createAccount() {
		WebDriver driver=initializeAndLogin();
		
	}
	
	@DataProvider(name="accountInfo")
	public Object[][] data() {
		ExcelReader excel=new ExcelReader("Data");
		Object[][] ob=excel.getData();
		return ob;
	}
	
	public WebDriver initializeAndLogin() {
		WebDriver driver=DriverConfig.getDriverInitializer("chrome"); 
		Login login=new Login(driver);		
		login.login(adminUser, password);
		return driver;
	}
}
