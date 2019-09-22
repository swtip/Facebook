package Keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keyword {
 public static RemoteWebDriver driver=null;
 	public static void openBrowser(String browserName) {
		switch (browserName)
		{
	
		case "Chrome":
			System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		    break;
		case "Firefox":
			System.setProperty("webdriver.gekodriver.driver","D:\\Driver\\geckodriver-v0.21.0-win64\\gekodriver.exe");
		    driver=new FirefoxDriver();
		    break;
		   
		}
		
	}
	public static void openURL(String url)
	{
		driver.get(url);
	}
	public static WebElement getWebElement(String locatorType,String locatorvalue)
	{
		WebElement element=null;
		switch (locatorType)
		{
		case "CSS":
			element=driver.findElementByCssSelector(locatorvalue);
		case "xpath":
			element=driver.findElementByXPath(locatorvalue);
			default:
				break;
		}
		return element;
	}
	public static void enterText(String locatorType,String locatorvalue,String textToEnter)
	{
		getWebElement(locatorType,locatorvalue).sendKeys(textToEnter);
			
	}
	public static void clickOnButton(String locatorType,String locatorvalue)
	{
		getWebElement(locatorType,locatorvalue).click();
		
		
	}

}
