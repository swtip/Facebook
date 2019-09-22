package components.SignIn;

import org.openqa.selenium.WebElement;

import Keywords.Keyword;

public class LoginOrSignInPage {
	public WebElement logo;
	public WebElement enterEmailorMobile;
	public WebElement enterpassword;
	public WebElement clickonSignIn;

	public void clickonLogoButton() {
		logo = Keyword.getWebElement("CSS", ".fb_logo");
		logo.click();
	}

	public void enterEmailorPhone()

	{
		enterEmailorMobile = Keyword.getWebElement("CSS", "#email");
		enterEmailorMobile.sendKeys("test");

	}

}
