package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import utilities.PropertyManager;

import java.net.MalformedURLException;


public class SampleTestingStepDefs {
    SampleTestingPageObject sampleTestingPageObject;
    HomePage homePage;


    String Url;

    {
        Url = "http://automationpractice.com/index.php";
    }

    WebDriver Driver;

    {
        try {
            Driver = PropertyManager.getInstance().getdriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    String email;

    {
        try {
            email = PropertyManager.getInstance().getUsername();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    String password;

    {
        try {
            password = PropertyManager.getInstance().getPassword();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }



    public void user_on_page() throws MalformedURLException {
        sampleTestingPageObject = new SampleTestingPageObject();
        homePage=sampleTestingPageObject.gethomePageObject();
        homePage.navigateTo_site(Url);
    }


    @Given("^User Open Landing Page$")
    @Test
    public void Site_opens_successfully() throws MalformedURLException {
        user_on_page();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("User clicks on Sign In Url")
    @Test
    public void User_changes_language_in_welcome_screen(){
        homePage.click_sign_in();
    }

    @And("User Insert valid Email as {string}")
    @Test
    public void User_insert_valid_email_txt(String arg0){
        homePage.insert_email(arg0);
    }

    @And("User Insert valid Password as {string}")
    public void userInsertValidPasswordAs(String arg0) {
        homePage.insert_password(arg0);
    }

    @And("User Clicks on SignIn button")
    public void userClicksOnSignInButton() {
        homePage.click_sign_in_button();
    }

    @Then("User Full Name displayed properly")
    public void userFullNameDisplayedProperly() {
        String displayed_fullName= homePage.getFullName();
        String expected_val=fake_api_getFullName();
        Assert.assertEquals("Displayed Logged In User is not as expected", expected_val, displayed_fullName);

    }
    
    public String fake_api_getFullName() {
        String FullName= "Abdullah Atef";
        return FullName;
    }
}
