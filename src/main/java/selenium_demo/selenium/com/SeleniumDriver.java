package selenium_demo.selenium.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver extends TestBase implements IseleniumDriverManager {

	@Override
	public void launchBrowser() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Override
	public void loginToQTApplication() throws Exception {
		// TODO Auto-generated method stub
		driver.get("https://www.kayak.co.in/ ");
		
		
	
		
	}

	@Override
	public void quitApplication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitforElementVisibleExplicit(int isecondsToWait, WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	
}
