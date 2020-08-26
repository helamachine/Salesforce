package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.CtsGlobal;

public class FGlobal {
	
	WebDriver driver;
	
	//APPBOX
	@FindBy (css = CtsGlobal.btnSearchAppBox)private WebElement btnSearchAppBox;
	@FindBy(xpath = CtsGlobal.inputSearchAppBox)private WebElement inputSearchAppBox;
	@FindBy(css = CtsGlobal.workspace)private WebElement workspace;
	@FindBy(css = CtsGlobal.imgToWait)private WebElement imgToWait;
	//FANTASTIC SOLUTION FOR WAITING THE SPINNER
	@FindBy (css = CtsGlobal.spinner)private WebElement spinner;
	
	//GLOBAL ACTIONS BUTTONS
	@FindBy (css = CtsGlobal.btnSetup)private WebElement btnSetup;
	@FindBy (css = CtsGlobal.selectSetup)private WebElement selectSetup;
	@FindBy (css = CtsGlobal.selectServiceSetup)private WebElement selectServiceSetup;
	@FindBy (css = CtsGlobal.selectDeveloperConsole)private WebElement selectDeveloperConsole;
	@FindBy (xpath = CtsGlobal.saveAndNewButton)private WebElement saveAndNewButton;
	@FindBy (xpath = CtsGlobal.saveButton)private WebElement saveButton;
	@FindBy (xpath = CtsGlobal.cancelButton)private WebElement cancelButton;
	@FindBy (css = CtsGlobal.newBtn) private WebElement newBtn;
	
	
	


	public FGlobal(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getNewBtn() {
		return newBtn;
	}
	
	public WebElement getBtnSearchAppBox() {
		return btnSearchAppBox;
	}


	public WebElement getInputSearchAppBox() {
		return inputSearchAppBox;
	}


	public WebElement getWorkspace() {
		return workspace;
	}

	
	public WebElement getImgToWait() {
		return imgToWait;
	}


	public WebElement getSpinner() {
		return spinner;
	}


	public WebElement getBtnSetup() {
		return btnSetup;
	}


	public WebElement getSelectSetup() {
		return selectSetup;
	}


	public WebElement getSelectServiceSetup() {
		return selectServiceSetup;
	}


	public WebElement getSelectDeveloperConsole() {
		return selectDeveloperConsole;
	}


	public WebElement getSaveAndNewButton() {
		return saveAndNewButton;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	public By getImgLocator() {
		return By.xpath(CtsGlobal.imgToWait);
	}
	
	public WebElement getXpathTab(String tab) {
		return driver.findElement(By.xpath(CtsGlobal.xpathTab.replace("$x", tab)));
	}
	
	public WebElement getItemLink(String item) {
		return driver.findElement(By.cssSelector(CtsGlobal.itemLink.replace("$x", item)));
	}
	
	public WebElement getItemId(String item) {
		return driver.findElement(By.cssSelector(CtsGlobal.itemId.replace("$x", item)));
	}
}
