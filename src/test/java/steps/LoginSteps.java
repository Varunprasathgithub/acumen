package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;

public class LoginSteps extends BasePage{
	
	public LoginPage loginpage;

@And("I am on the login page")
public void iAmOnTheLoginPage() {
	LoginPage.verifyLoginPageIsVisisble("Acumen");
}

@When("I enter valid username")
public void iEnterValidUsername() {
	
}

@And("I enter valid password")
public void iEnterValidPassword() {
	
}

@And("I click on submit button")
public void iClickOnSubmitButton() {
	
}

@Then("I should be logged in successfully")
public void iShouldBeLoggedInSuccessfully() {
	
}
	
	

}
