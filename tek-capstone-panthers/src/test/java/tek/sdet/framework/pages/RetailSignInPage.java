package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
        PageFactory.initElements(getDriver(),this);
    }
@FindBy(xpath="//*[@id=\"signinLink\"]")
public WebElement signInPage;
@FindBy(xpath="//*[@id=\"email\"]")
public WebElement emailField;
@FindBy(xpath="//*[@id=\"password\"]")
public WebElement passwordField;
@FindBy(xpath="//*[@id=\"loginBtn\"]")
public WebElement loginButton;
@FindBy(xpath="//*[@id=\"accountLink\"]")
public WebElement account;



}

