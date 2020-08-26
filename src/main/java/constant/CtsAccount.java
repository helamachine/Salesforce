package constant;

public class CtsAccount {
	
	//ACCOUNT INFO
	public static final String AccountName = "//label/span[text()='Account Name']/parent::label/following-sibling::input";
	public static final String ddMenuRating = "//div/span/span[text()='Rating']/parent::span/following-sibling::div";
	//public static final String billingStreet = "//textarea[contains(@placeholder,'Billing')]";
	public static final String rating = "a[title='$x']";
	public static final String phone = "//span[text()='Phone']/parent::label/following-sibling::input";
	public static final String fax = "//span[text()='Fax']/parent::label/following-sibling::input";
	public static final String parentAccount = "input[title='Search Accounts']"; //para seleccionar la cuenta a enparentar le mandamos un ARROWDOWN Y ENTER
	public static final String accountNumber = "//label/span[text()='Account Number']/parent::label/following-sibling::input";
	public static final String webSite = "//label/span[text()='Website']/parent::label/following-sibling::input";
	public static final String accountSite = "//label/span[text()='Account Site']/parent::label/following-sibling::input";
	public static final String tickerSymbol = "//label/span[text()='Ticker Symbol']/parent::label/following-sibling::input";
	public static final String menuText = "--None--"; //lo indexamos luego
	public static final String employees = "//label/span[text()='Employees']/parent::label/following-sibling::input";
	public static final String annualRevenue = "//label/span[text()='AnnualRevenue']/parent::label/following-sibling::input";
	public static final String sicCode = "//label/span[text()='SIC Code']/parent::label/following-sibling::input";
	
	//ADRESS INFO
	public static final String billingStreet = "textarea[placeholder='Billing Street']";
	public static final String shippingStreet = "textarea[placeholder='Shipping Street']";
	public static final String billingPostal = "input[placeholder='Billing Zip/Postal Code']";
	public static final String shippingPostal = "input[placeholder='Shipping Zip/Postal Code']";
	public static final String billingCity = "input[placeholder='Billing City']";
	public static final String billingState = "input[placeholder='Billing State/Province']";
	public static final String shippingCity = "input[placeholder='Shipping City']";
	public static final String shippingState = "input[placeholder='Shipping State/Province']";
	public static final String billingCountry = "input[placeholder='Billing Country']";
	public static final String shippingCountry = "input[placeholder='Shipping Country']";
	
	//ADITIONAL INFO
	public static final String customerPriority = "//span[text()='Customer Priority']/parent::span/following-sibling::div";
	public static final String sla = "//span[text()='SLA']/parent::span/following-sibling::div";
	public static final String slaExpirationDate = "//span[text()='SLA Expiration Date']/parent::label/following-sibling::div";
	public static final String slaSerialNumber = "//span[text()='SLA Serial Number']/parent::label/following-sibling::input";
	public static final String numberOfLocation = "//span[text()='Number of Locations']/parent::label/following-sibling::input";
	public static final String upsellOpportunity = "//span[text()='Upsell Opportunity']/parent::span/following-sibling::div";
	public static final String active = "//span[text()='Active']/parent::span/following-sibling::div";
	
	//DESCRIPTION INFO
	public static final String description = "('textarea')[2]";
	
}
