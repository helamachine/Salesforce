package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Setup.DriverConfig;
import domain.Login;

@Test
public class TestCRUDAccount extends TestingBase {
	@Test //(dataProvider = "accountInfo")
	public void createAccount() {
		WebDriver driver=DriverConfig.getDriverInitializer("chrome");
		driver.get(url);
		Login login=new Login(driver);
		login.login(adminUser, password);
	}
	/*@DataProvider(name="accountInfo")
	public Object[][] data() {
		Object[][] ob=new Object[1][1]; //todo el tema de excel o lo que vayamos a usar.
		return ob;
	}*/
}
