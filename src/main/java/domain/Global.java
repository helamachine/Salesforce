package domain;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.FGlobal;
import utility.GeneralUtilities;

public class Global {
	
	WebDriver driver;
	protected WebDriverWait wait;
	protected FGlobal fg;
	protected GeneralUtilities gu;
	
	public Global(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		fg = new FGlobal(driver);
		gu = new GeneralUtilities();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	public void goToApps(String app) {
		wait.until(ExpectedConditions.visibilityOf(fg.getImgToWait()));
		fg.getBtnSearchAppBox().click();
		wait.until(ExpectedConditions.visibilityOf(fg.getInputSearchAppBox()));
		//fg.getInputSearchAppBox().click();
		fg.getInputSearchAppBox().sendKeys(app);
		gu.waitForLoad(500);
		fg.getInputSearchAppBox().sendKeys(Keys.ENTER);
		
	}
}
