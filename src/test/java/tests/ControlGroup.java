package tests;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.ControlGroupPage;
import pages.HomePage;
import utilities.PropertyManager;

import java.net.MalformedURLException;

public class ControlGroup {

    WebDriver driver;
    PropertyManager propertyManager = new PropertyManager();

    HomePage homePage;
    ControlGroupPage controlGroupPage;

    {
        try {
            driver = PropertyManager.getInstance().getdriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @When("^I select Controlgroup option from left menu under interactions$")
    public void i_select_Controlgroup_option_from_left_menu_under_interactions() throws Throwable {
        driver = utilities.PropertyManager.getInstance().getdriver();
        homePage = new HomePage(driver);
        homePage.clickOnControlGroup();
    }

    @When("^enter booking details for Horizontal orientation like Vehicle Option \"([^\"]*)\" Type \"([^\"]*)\" number \"([^\"]*)\"$")
    public void enter_booking_details_for_Horizontal_orientation_like_Vehicle_Option_Type_number(String arg1,
                                                                                                 String arg2, String arg3) {
        controlGroupPage = new ControlGroupPage(driver);
        try {
            controlGroupPage.selectRentalCar(arg1);
            controlGroupPage.selectRadioButton(arg2);
            controlGroupPage.enterNoOfCars(arg3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^enter booking details for Vertical orintation like Vehicle Option \"([^\"]*)\" Type \"([^\"]*)\" number \"([^\"]*)\"$")
    public void enter_booking_details_for_Vertical_orintation_like_Vehicle_Option_Type_number(String arg1, String arg2,
                                                                                              String arg3) {
        try {
            controlGroupPage.selectRentalCar2(arg1);
            controlGroupPage.selectRadioButton2(arg2);
            controlGroupPage.enterNoOfCars2(arg3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^opt for Insurance for either case$")
    public void opt_for_Insurance_for_either_case() {
        try {
            controlGroupPage.insuranceCheckBox();
            controlGroupPage.insuranceCheckBox2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("^click on Book Now Button$")
    public void click_on_Book_Now_Button() {
        controlGroupPage.clickOnBookBtn2();

    }

    @Then("^Booking should be Successful$")
    public void booking_should_be_Successful() {

    }

    @After("@ControlGroup")
    public void tear() {
        propertyManager.closeDriver(driver);
    }


}
