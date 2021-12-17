package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.PropertyManager;

import java.net.MalformedURLException;
import java.util.List;

public class ControlGroupPage {
    WebDriver driver;
    WebDriverWait wait;

    //public WebDriver driver= PropertyManager.getInstance().getdriver();

    public HomePage homePage =new HomePage(driver);

    @FindBy(how = How.XPATH, using = "//*[@id='car-type-button']")
    private WebElement carTypeButton;

    @FindBy(how = How.XPATH, using = "//*[@id='car-type-menu']/li")
    private WebElement carTypeList;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[1]/div/label[2]/span[1]")
    private WebElement automaticRadioButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[1]/div/label[1]/span[1]")
    private WebElement standardRadioButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[1]/div/label[3]/span[1]")
    private WebElement insuranceCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id='horizontal-spinner']")
    private WebElement spinOfCars;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[1]/div/button")
    private WebElement btnBookNow;

    @FindBy(how = How.XPATH, using = "//*[@id='ui-id-8-button']")
    private WebElement carTypeButton2;

    @FindBy(how = How.XPATH, using = "//*[@id='ui-id-8-menu']/li")
    private WebElement carTypeList2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[2]/div/label[2]/span[1]")
    private WebElement automaticRadioButton2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[2]/div/label[1]/span[1]")
    private WebElement standardRadioButton2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[2]/div/label[3]/span[1]")
    private WebElement insuranceCheckBox2;

    @FindBy(how = How.XPATH, using = "//*[@id='vertical-spinner']")
    private WebElement spinOfCars2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/fieldset[2]/div/button")
    private WebElement btnBookNow2;


    public ControlGroupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }




    public void selectRadioButton(String strRadioOpt) {
        if (strRadioOpt.equalsIgnoreCase("Automatic"))
            driver.findElement((By) automaticRadioButton).click();
        else if (strRadioOpt.equalsIgnoreCase("Standard"))
            driver.findElement((By) standardRadioButton).click();
    }

    public void insuranceCheckBox() {
        if (!driver.findElement((By) insuranceCheckBox).isSelected())
            driver.findElement((By) insuranceCheckBox).click();
    }

    public void selectRentalCar(String strVal) {

        driver.findElement((By) carTypeButton).click();
        List<WebElement> wElements = driver.findElements((By)carTypeList);
        for (int i = 0; i < wElements.size(); i++) {
            WebElement wElement = wElements.get(i);
            if (wElement.getText().equals(strVal)) {
                wElement.click();
                break;
            }
        }
    }

    public void enterNoOfCars(String strVal) {
        driver.findElement((By) spinOfCars).sendKeys(strVal);
    }

    public void clickOnBookBtn() {
        driver.findElement((By) btnBookNow).click();
    }

    public void selectRadioButton2(String strRadioOpt) {
        if (strRadioOpt.equalsIgnoreCase("Automatic"))
            driver.findElement((By) automaticRadioButton2).click();
        else if (strRadioOpt.equalsIgnoreCase("Standard"))
            driver.findElement((By) standardRadioButton2).click();
    }

    public void insuranceCheckBox2() {
        if (!driver.findElement((By) insuranceCheckBox2).isSelected())
            driver.findElement((By) insuranceCheckBox2).click();
    }

    public void selectRentalCar2(String strVal) {

        driver.findElement((By) carTypeButton2).click();
        List<WebElement> wElements = driver.findElements((By) carTypeList2);
        for (int i = 0; i < wElements.size(); i++) {
            WebElement wElement = wElements.get(i);
            if (wElement.getText().equals(strVal)) {
                wElement.click();
                break;
            }
        }
    }

    public void enterNoOfCars2(String strVal) {
        driver.findElement((By) spinOfCars2).sendKeys(strVal);
    }

    public void clickOnBookBtn2() {
        driver.findElement((By) btnBookNow2).click();
    }

}