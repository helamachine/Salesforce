package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.CtsLogin;

public class FLogin {
	@FindBy (css = CtsLogin.inputUsername)private WebElement inputUsername;
	@FindBy (css = CtsLogin.inputPassword)private WebElement inputPassword;
	@FindBy (css = CtsLogin.bttnLogin)private WebElement buttonLogin;
	@FindBy (css = CtsLogin.loginErrorMessage)private WebElement logginError;
	
	
	public FLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getInputUsername() {
		return inputUsername;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}
	
	public WebElement getLogginError() {
		return logginError;
	}
}
