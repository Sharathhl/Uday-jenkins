package selenium_demo.selenium.com;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Day2 extends TestBase {

	public static void main(String[] args) throws Exception {
		
		IseleniumDriverManager osel = new SeleniumDriver();
         osel.launchBrowser();
	     osel.loginToQTApplication();
	     Date();
		 osel.quitApplication() ;
	}
	
	public static void Date() throws Exception {
		
		WebElement eleDateFrom = driver.findElement(By.xpath("//span[@class='cQtq-date'][1]"));
		//osel.waitForElementVisibelExplicit(10,eleDateFrom);
		eleDateFrom.click();
		WebElement eleMonthName = driver.findElement(By.xpath("//div[@class='wHSr-monthName'][1]"));
		String sMonthName = eleMonthName.getText();
		sMonthName = sMonthName.replace(" "," ");
		String sDate = "20";
		String xpathAsText = sDate+" "+sMonthName;
		String xpath = "//div[@aria-label='"+xpathAsText+" ']";
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(3000);
	}
	
}