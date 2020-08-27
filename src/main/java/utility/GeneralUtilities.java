package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralUtilities {
	
	public static void waitForLoad(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void scrollToViewElement(WebDriver driver, WebElement element, boolean direction) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView("+direction+");", element);
		} catch (Exception e) {
			System.out.println("Error while scrolling to view element info");
			e.printStackTrace();
		}
	}

}
