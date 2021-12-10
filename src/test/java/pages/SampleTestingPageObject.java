package pages;


import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

import java.net.MalformedURLException;

public class SampleTestingPageObject {

    public WebDriver driver=PropertyManager.getInstance().getdriver();

    public HomePage homePage=new HomePage(driver);


    public SampleTestingPageObject() throws MalformedURLException {
    }


    public HomePage gethomePageObject() {
        return homePage;
    }


}
