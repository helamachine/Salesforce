package constant;

public class CtsAccount {
	
	//ACCOUNT TABS
	//public static final String detailTab = "/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___home_page___account___view/forcegenerated-flexipage_home_page_account__view_js/record_flexipage-record-page-decorator/div/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/lightning-tab-bar/ul/li[2]/a";
	public static final String detailTab = "//lightning-tab-bar/ul/li[@title = 'Details']/a";
	//ACCOUNT INFO
	public static final String AccountName = "//span[text()='Account Name']/parent::label/following-sibling::input";
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
	
	//ACCOUNT DETAILS
	//public static final String editButton = "button[title = 'Edit $x']";
	public static final String editButton = "/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___home_page___account___view/forcegenerated-flexipage_home_page_account__view_js/record_flexipage-record-page-decorator/div/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/slot/flexipage-tab2[2]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-record-layout-event-broker/slot/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/force-record-layout-block/slot/force-record-layout-section[1]/div/div/div/slot/force-record-layout-row[2]/slot/force-record-layout-item[1]/div/div/div[2]/button[title = 'Edit $x']";
	public static final String editButton2 ="//force-record-layout-item[1]/div/div/div[2]/button";
	///html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adgrollup_component___forcegenerated__flexipage_recordpage___home_page___account___view/forcegenerated-flexipage_home_page_account__view_js/record_flexipage-record-page-decorator/div/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/slot/flexipage-tab2[2]/slot/flexipage-component2/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/records-record-layout-event-broker/slot/records-lwc-record-layout/forcegenerated-detailpanel_account___012000000000000aaa___full___view___recordlayout2/force-record-layout-block/slot/force-record-layout-section[1]/div/div/div/slot/force-record-layout-row[2]/slot
	//INNER EDIT DETAILS
	public static final String editFields ="//label[text() = '$x']/following-sibling::div";
	
	
}
