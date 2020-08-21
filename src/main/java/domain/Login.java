package domain;

import org.openqa.selenium.WebDriver;
import factory.FLogin;

public class Login extends Global{
	FLogin fl;
	public Login(WebDriver driver) {
		super(driver);
		fl=new FLogin(driver);
	}

	public void login(String user, String password) {
		fl.getInputUsername().sendKeys(user);
		fl.getInputPassword().sendKeys(password);
		fl.getButtonLogin().click();
	}
}
