package runner;

import java.io.IOException;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\My\\acumen automation\\acumen automation\\src\\test\\java\\feature",
        glue = {"steps"},
        monochrome = true
        )

	
public class RunnerUi extends BasePage {
   
	@Before()
	public void beforeTest() throws IOException {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\My\\acumen automation\\acumen automation\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acumencostanalytics.com/login");
	}

	@After()
    public void afterTest(Scenario scenario) {
      driver.close();
    }
}

