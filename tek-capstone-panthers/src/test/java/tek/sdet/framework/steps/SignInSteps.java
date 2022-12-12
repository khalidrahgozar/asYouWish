package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	  POMFactory factory = new POMFactory();

	   @Given("User is on retail website")
	    public void userIsOnRetailWebsite() {
	        String expectedTitle = "React App";
	        String actualTitle = getTitle();
	        Assert.assertEquals(expectedTitle, actualTitle);
	        logger.info(expectedTitle + "is equal to " + actualTitle);
	        slowDown();
	    }
	   @When("User click on Sign in option")
	    public void userClickOnSignInOption() {
	        click(factory.signInPage().signInField);
	        logger.info("User clicked signin option");
	    }
	    @When("User enter email {string} and password {string}")
	    public void userEnterEmailAndPassword(String email, String password) {
	        sendText(factory.signInPage().emailField, email);
	        sendText(factory.signInPage().passwordField, password);
	        logger.info(email + "User Entered email and password" + password);
	    }
	    @And("User click on login button")
	    public void userClickOnLoginButton() {
	        click(factory.signInPage().loginButton);
	        logger.info("user clicked on Login Button");
	    }
	    @Then("User should be logged in into Account")
	    public void userShouldBeLoggedInIntoAccount() {
	    Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	        logger.info("User should logg in to account");
	       
	    }
	}
