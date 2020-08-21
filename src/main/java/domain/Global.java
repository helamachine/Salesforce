package domain;

import org.openqa.selenium.WebDriver;

public class Global {
	WebDriver driver;
	public Global(WebDriver driver) {
		this.driver=driver;
	}
}
