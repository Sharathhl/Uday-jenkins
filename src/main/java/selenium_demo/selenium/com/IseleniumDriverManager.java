package selenium_demo.selenium.com;

import org.openqa.selenium.WebElement;

public interface IseleniumDriverManager {
	
	     void launchBrowser();
	     void loginToQTApplication() throws Exception ; 
		 void quitApplication() ;
		 void waitforElementVisibleExplicit(int isecondsToWait,WebElement ele);


}
