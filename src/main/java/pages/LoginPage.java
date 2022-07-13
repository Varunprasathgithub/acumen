package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends PageObject{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public static void  verifyLoginPageIsVisisble (String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
}
