package Setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class URLmaker {
	WebDriver driver;
	String url;
	
	public URLmaker(WebDriver driver) {
		this.driver = driver;
		url = driver.getCurrentUrl();
	}
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public String urlMaker(String object) {
		String urlCreated;
		String idURL = url.substring(54, 72);
		System.out.println(idURL);
		urlCreated = "https://na172.lightning.force.com/lightning/r/" + object + "/" + idURL +"/view";
		return urlCreated;
	}
	
	public void goToURLCreated(String object) {
	
		String urlCreated = urlMaker(object);
		driver.get(urlCreated);
		System.out.println(urlCreated);
	}
}
