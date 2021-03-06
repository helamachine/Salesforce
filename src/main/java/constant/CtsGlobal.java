package constant;

public class CtsGlobal {
		//AppBox
		public static final String btnSearchAppBox = ".slds-icon-waffle";
		public static final String inputSearchAppBox = "//input[@placeholder = 'Search apps and items...']/parent::div";
		public static final String imgToWait = ".tileImg";
		public static final String workspace="//div[@data-aura-class = 'oneWorkspace2']";
		//FANTASTIC SOLUTION FOR WAITING THE SPINNER
		public static final String spinner = "#spinner-container";	
		//GLOBAL ACTIONS BUTTONS
		public static final String btnSetup = ".setupGear";
		public static final String selectSetup = "#related_setup_app_home";
		public static final String selectServiceSetup = "#service_setup_home";
		public static final String selectDeveloperConsole = "#developer-console-link";
		
		public static final String saveAndNewButton = "//*[@title = 'Save & New']";
		public static final String saveButton = "//*[@title = 'Save']";
		public static final String cancelButton = "//*[@title = 'Cancel']";
		
		//==================REPLACEABLE==========================
		public static final String xpathTab="//header[@id='oneHeader']/div[@class='bBottom']//one-app-nav-bar-item-root[@data-id='$x']";
		public static final String itemLink="a[data-label='$x']";
		public static final String itemId="#$x";
}
