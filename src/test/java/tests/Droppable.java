package tests;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DroppablePage;
import pages.HomePage;
import utilities.PropertyManager;

import java.net.MalformedURLException;

public class Droppable {
    WebDriver driver;
    PropertyManager propertyManager = new PropertyManager();
    DroppablePage droppablePage;
    HomePage homePage;


    {
        try {
            driver = PropertyManager.getInstance().getdriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @When("^I select Droppable option from left menu under interactions$")
    public void i_select_Droppable_option_from_left_menu_under_interactions() throws Throwable {
        WebDriver driver = PropertyManager.getInstance().getdriver();
        homePage = new HomePage(driver);
        droppablePage = new DroppablePage(driver);
        homePage.clickOnDroppableLink();

    }

    @When("^Drag Drag me to my target component to Drop here component$")
    public void drag_Drag_me_to_my_target_component_to_Drop_here_component() throws Throwable {
        WebDriver driver = PropertyManager.getInstance().getdriver();

        droppablePage = new DroppablePage(driver);
        try {
            droppablePage.dragAndDropElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^I should be able to able to drag and drop$")
    public void i_should_be_able_to_able_to_drag_and_drop() {

        Assert.assertEquals(droppablePage.isDropped(), true);
    }

    @After("@DragAndDrop")
    public void tear() {propertyManager.closeDriver(driver);
    }

}
