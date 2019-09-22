package TestCases;

import org.testng.annotations.Test;

import FileUtilities.Locator;
import Keywords.Keyword;

public class Regression extends Keyword {

	@Test
	public void test_verify_title_of_landing_page() {
		Locator locator = new Locator();
	    openBrowser("Chrome");
		openURL("https://www.facebook.com");
		enterText("xpath", locator.email, "firstuser");
		enterText("xpath", locator.pass, "1245");
	}
}
