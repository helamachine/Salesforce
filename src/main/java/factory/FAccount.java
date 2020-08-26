package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FAccount {
	
	
	
	public FAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
