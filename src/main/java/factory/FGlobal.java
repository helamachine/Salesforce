package factory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import constant.CtsGlobal;

public class FGlobal {
	@FindBy(css = CtsGlobal.spinner)private WebElement spinner;
}
