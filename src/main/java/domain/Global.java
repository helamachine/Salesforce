package domain;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.FGlobal;

public class Global {
	
	WebDriver driver;
	protected WebDriverWait wait;
	protected FGlobal fg;
	
	public Global(WebDriver driver) {
		this.driver=driver;
	}
	
	public void goToApps() {
		fg.getBtnSearchAppBox().click();
		fg.getInputSearchAppBox().sendKeys(Keys.ARROW_DOWN);
		fg.getInputSearchAppBox().sendKeys(Keys.ENTER);
		
	}
}
