package tests;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SelectablePage;
import utilities.ArrayUtility;
import utilities.PropertyManager;

import java.net.MalformedURLException;
import java.util.List;

public class Selectable {

    WebDriver driver;
    PropertyManager propertyManager = new PropertyManager();
    HomePage homePage;
    SelectablePage selectablePage;


    {
        try {
            driver = PropertyManager.getInstance().getdriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Given("^I am on home page of application \"([^\"]*)\"$")
    public void i_am_on_home_page_of_application() throws Throwable {
        driver = utilities.PropertyManager.getInstance().getdriver();
    }

    @When("^I select Selectable option from left menu under interactions$")
    public void i_select_Selectable_option_from_left_menu_under_interactions() throws Throwable {
        driver = utilities.PropertyManager.getInstance().getdriver();
        homePage = new HomePage(driver);
        homePage.clickOnSelectableLink();
    }

    @When("^Select items \"([^\"]*)\" from options$")
    public void select_items_from_options(String arg1) {
        selectablePage = new SelectablePage(driver);
        String[] arr = arg1.split(";");
        List<String> lst = ArrayUtility.arrayToList(arr);
        try {
            selectablePage.selectItems(lst);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I should be able to verify that the multiple select option is allowed$")
    public void i_should_be_able_to_verify_that_the_multiple_select_option_is_allowed() {

    }

    @After("@MultipleSelect")
    public void tear() {
        propertyManager.closeDriver(driver);
    }

}
